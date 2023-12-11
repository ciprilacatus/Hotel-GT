package com.gt.HotelGT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class HotelGtApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelGtApplication.class, args);
	}

}
