package br.com.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdministradoresController {
	@GetMapping("/administradores")
	public String getAll(Model model) {
		model.addAttribute("nome", "Matheus");
		return "administradores/index";
	}
}