package com.sazegar.APISampleV1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application-${spring.profiles.active:default}.properties")
public class ApiSampleV1Application {

	public static void main(String[] args) {
		SpringApplication.run(ApiSampleV1Application.class, args);
	}

}
