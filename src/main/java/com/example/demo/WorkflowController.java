package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkflowController {
	
	@PostMapping("/workflow")
	public void sample(@RequestBody String body) {
		System.out.println(body);
	}

}
