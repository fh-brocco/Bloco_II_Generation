package org.generation.hello_world.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/helloworld")
@RestController
public class helloController {

	@GetMapping
	public String hello() {
		return "E ai,jovem?!";
	}
}
