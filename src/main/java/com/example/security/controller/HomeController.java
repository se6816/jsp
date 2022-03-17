package com.example.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.security.model.Pet;

@Controller
public class HomeController {

	@Autowired
	public Pet pet;
	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("pet", pet.getName());
		return "hello";
	}
}
