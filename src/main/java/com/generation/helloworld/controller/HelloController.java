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
		
		@GetMapping ("/top")
		public String top () {
		return "<b>A Turma 68 é top!!!</b>";

		}
		
}
