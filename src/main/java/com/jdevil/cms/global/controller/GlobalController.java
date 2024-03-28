package com.jdevil.cms.global.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GlobalController {

	@GetMapping("/")
	public String home() {

		return "global/main";
	}

	@GetMapping("/login")
	public String main() {

		return "global/login";
	}
}