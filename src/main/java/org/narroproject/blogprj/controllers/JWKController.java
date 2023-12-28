/*
 *  Copyright 2023 Raymond Pattend & Narro LLC. All rights reserved.
 */

package org.narroproject.blogprj.controllers;

import org.narroproject.blogprj.utilities.Constants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class JWKController {


    @GetMapping("/auth/keys")
    @ResponseBody
    public String getKeys() {


        return Constants.FULLJWK;
    }

}

