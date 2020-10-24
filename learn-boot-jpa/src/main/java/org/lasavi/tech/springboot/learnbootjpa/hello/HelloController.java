package org.lasavi.tech.springboot.learnbootjpa.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/")
	private String sayHello() {
		return "Welcome, visit <a href='/students'>Student List</a>";
	}

}
