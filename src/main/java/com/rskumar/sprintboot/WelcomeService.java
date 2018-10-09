package com.rskumar.sprintboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WelcomeService {

	@Value("${welcome.message}")
	private String welcomeMessage;

	public String retrieveWelcomeMessage() {
		System.out.println("Returning the welcome message:"+welcomeMessage);
		return welcomeMessage;
	}
}
