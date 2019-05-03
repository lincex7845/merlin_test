package com.mera.bicis.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {

		Bici b = new Bici();
		SpringApplication.run(ApiApplication.class, args);
	}


}
