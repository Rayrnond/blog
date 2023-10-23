/*
 *  © 2023 Raymond Pattend & Narro LLC. All rights reserved.
 */

package org.narroproject.blogprj.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

}
