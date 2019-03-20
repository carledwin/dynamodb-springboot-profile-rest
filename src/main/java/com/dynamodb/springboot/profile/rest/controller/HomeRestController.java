package com.dynamodb.springboot.profile.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {

	@GetMapping("/")
	public String home() {
		return "Bem vindo ao sistema!";
	}
}
