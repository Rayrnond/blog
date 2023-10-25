/*
 *  © 2023 Raymond Pattend & Narro LLC. All rights reserved.
 */

package org.narroproject.blogprj.controllers;

import jakarta.servlet.http.HttpServletRequest;
import lombok.SneakyThrows;
import org.narroproject.blogprj.utilities.objects.blog.BlogMarkdown;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class BlogController {

    private final Map<String,BlogMarkdown> simpleCache = new java.util.concurrent.ConcurrentHashMap<>();

    @GetMapping("/blog/{page}")
    public String getTestDoc(Model model, HttpServletRequest request, Locale locale, @PathVariable String page) {
        try {
            BlogMarkdown markdown = simpleCache.getOrDefault(page.toLowerCase() + (locale.getLanguage()), BlogMarkdown.fromJson(getResourceFileAsString(page, locale)));
            simpleCache.put(page.toLowerCase()+(locale.getLanguage()), markdown);

            model.addAttribute("markdown", markdown);
            return "/documentation/index";
        }catch (Exception e) {
            return "/directories/404";
        }
    }


    public static String getResourceFileAsString(String f, Locale locale) {
        String fileName = "static/docs/"+(locale.getLanguage())+"/"+f+".json";
        InputStream is = getResourceFileAsInputStream(fileName);
        if (is != null) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            return (String)reader.lines().collect(Collectors.joining(System.lineSeparator()));
        } else {
            if (!locale.equals(Locale.ENGLISH)) {
                return getResourceFileAsString(f, Locale.ENGLISH);
            }
            return "null";
        }
    }

    @SneakyThrows
    public static String getFileAsString(File file) {
        InputStream is = file.toURL().openStream();
        if (is != null) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            return (String)reader.lines().collect(Collectors.joining(System.lineSeparator()));
        } else {
            return "null";
        }
    }



    @SneakyThrows
    public static InputStream getResourceFileAsInputStream(String fileName) {
        ClassLoader classLoader = BlogController.class.getClassLoader();
        return classLoader.getResourceAsStream(fileName);
    }


}
