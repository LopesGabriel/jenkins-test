package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

	@GetMapping
	public String helloWorld() {
		return "Hello World v1.0.1";
	}

	@GetMapping(value = "/{slug}")
	public String novoEndpoint(@PathVariable(name = "slug") String slug) {
		return "Você tentou acessar o end-point \"/" + slug + "\".";
	}

}
