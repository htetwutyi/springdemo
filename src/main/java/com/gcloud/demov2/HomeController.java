package com.gcloud.demov2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String getMessage() {
		return "Welcom demov2 ";
	}

	@GetMapping("/test")
	public String getGitMessage() {
		return "Welcome Git Message from testing.";
	}
}
