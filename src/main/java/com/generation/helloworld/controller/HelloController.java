package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String Hello() {
		return "<i>Hello Turma 68!!!</i>";
	}

	@GetMapping("/top")
	public String bsm() {
		return "<b>Persistencia, orientação ao detalhes, comunicação, mentalidade de crescimento, responsabilidade pessoal, orientação ao futuro, proatividade"
				+ "trabalho em equipe</b>";

	}

	@GetMapping("/top")
	public String obj() {
		return "<b>Banco de Dados e Spring</b>";

	}
}
