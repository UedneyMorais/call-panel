package com.example.callpanel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.callpanel")
@EntityScan("com.example.callpanel.model")
@EnableJpaRepositories("com.example.callpanel.repository")
@EnableJpaAuditing 
public class CallPanelApplication {

	public static void main(String[] args) {
		SpringApplication.run(CallPanelApplication.class, args);
	}

}
