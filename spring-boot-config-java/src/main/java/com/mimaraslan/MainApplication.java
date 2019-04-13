package com.mimaraslan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.mimaraslan.service.MessageProcessor;

@SpringBootApplication
public class MainApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(MainApplication.class, args);
		MessageProcessor userService = applicationContext.getBean(MessageProcessor.class);
		userService.processMsg("Message sending ");
	}
}