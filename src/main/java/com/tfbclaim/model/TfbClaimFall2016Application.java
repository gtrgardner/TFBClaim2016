package com.tfbclaim.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.tfbclaim.model")
public class TfbClaimFall2016Application {
	
	public static void main(String[] args) {
		SpringApplication.run(TfbClaimFall2016Application.class, args);
		
	}
}
