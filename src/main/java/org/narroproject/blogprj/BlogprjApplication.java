/*
 *  Copyright 2023 Raymond Pattend & Narro LLC. All rights reserved.
 */

package org.narroproject.blogprj;

import org.narroproject.blogprj.utilities.Constants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@ServletComponentScan("org.narroproject.blogprj.*")
@SpringBootApplication
@EntityScan(basePackages = "corg.narroproject.blogprj.*")
@EnableAsync
public class BlogprjApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogprjApplication.class, args);


		try {
			String keyPath = "src/main/resources/private/myrsakey_pcks8";
			String content = new String(Files.readAllBytes(Paths.get(keyPath)));
			String privateKey = content.replace("-----BEGIN PRIVATE KEY-----", "").replace("-----END PRIVATE KEY-----", "").trim();
			Constants.PRIVATE_KEY = privateKey;
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
