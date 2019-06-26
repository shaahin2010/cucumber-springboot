package com.gmail.shaahin2010.springcucumber.service;

import org.springframework.stereotype.Component;

@Component
public class IsItFridayServiceImpl implements IsItFridayService {

	@Override
	public String isTodayFriday(String message) {
		return "Friday".equalsIgnoreCase(message) ? "TGIF" : "Nope";
	}
}
