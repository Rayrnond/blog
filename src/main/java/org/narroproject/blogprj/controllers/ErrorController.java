/*
 *  Copyright 2023 Raymond Pattend & Narro LLC. All rights reserved.
 */

package org.narroproject.blogprj.controllers;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController {

        @Getter
        private static final String PATH = "/error";

        @GetMapping("/error")
        public String getError() {
            return "/directories/404";
        }

}
