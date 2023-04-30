package pe.edu.cibertec.appbasededatos.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	//@PostMapping
	
	//@DeleteMapping
	
	//@PutMapping
	
}
