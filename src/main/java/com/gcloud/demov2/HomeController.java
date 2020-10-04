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
	
	@GetMapping("/jenkins")
	public String getJenkinsMessage() {
		String testing = "Add some line to commit";
		return "This is Jenkins and GitHub Combinations Successfully." + testing;
	}
}


