/*
 *  Copyright 2023 Raymond Pattend & Narro LLC. All rights reserved.
 */

package org.narroproject.blogprj.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DirectoryController {

    @GetMapping("/")
    public String getIndex() {
        return "/directories/contact";
    }

    @GetMapping("/code")
    public String getCode() {
        return "/directories/contact";
    }

    @GetMapping("/blog")
    public String getBlog() {
        return "/directories/contact";
    }

    @GetMapping("/photos")
    public String getPhotos() {
        return "/directories/photos";
    }

    @GetMapping("/contact")
    public String getContact() {
        return "/directories/contact";
    }

}
