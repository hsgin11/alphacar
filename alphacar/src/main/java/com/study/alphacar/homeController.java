package com.study.alphacar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {

	@RequestMapping("/")
	public String home() {
		return "home";
	}
	@RequestMapping("/test")
	public String test() {
		return "test";
	}
}
