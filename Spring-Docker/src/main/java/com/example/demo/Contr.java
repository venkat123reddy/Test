package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class Contr {
	
	@GetMapping("/get")
	public String get()
	{
		return "Hello docker";
	}

}
