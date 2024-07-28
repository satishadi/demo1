package com.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo1")
public class Controller {

	
	@GetMapping("hello")
	public String hello() {
		return "hello hi , im from demo1 app";
	}
}
