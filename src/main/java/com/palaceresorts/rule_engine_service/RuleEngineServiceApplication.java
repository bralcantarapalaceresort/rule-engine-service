package com.palaceresorts.rule_engine_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class RuleEngineServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RuleEngineServiceApplication.class, args);
	}

}