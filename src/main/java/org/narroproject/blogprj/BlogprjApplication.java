/*
 *  Copyright 2023 Raymond Pattend & Narro LLC. All rights reserved.
 */

package org.narroproject.blogprj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan("org.narroproject.blogprj.*")
@SpringBootApplication
@EntityScan(basePackages = "corg.narroproject.blogprj.*")
public class BlogprjApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogprjApplication.class, args);
	}

}
