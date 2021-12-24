package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class index {

	@GetMapping("/helloworld")
	public String write1(Model model) {
		model.addAttribute("moji", "hello world!");
		return "index";
	}
}
