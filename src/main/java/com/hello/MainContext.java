package com.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainContext {

	@RequestMapping("/index")
	public String index() {
		return "Hellow World....";
	}
	
}
