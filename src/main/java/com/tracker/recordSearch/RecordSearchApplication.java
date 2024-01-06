package com.tracker.recordSearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class RecordSearchApplication implements WebMvcConfigurer {

	public void addViewController(ViewControllerRegistry registry){
		registry.addViewController("/track").setViewName("dashboard");
	}

	public static void main(String[] args) {
		SpringApplication.run(RecordSearchApplication.class, args);
	}

}
