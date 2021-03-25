package com.ibm.demo;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

public class BugController {
	@PostMapping("/bug")
	String createBug() {
		return "Bug appeared";
	}

	@GetMapping("/bug")
	String getBug() {
		return "Bug searched";
	}

	@PutMapping("/bug/{id}")
	String updateBug(@PathVariable("id") int BugId) {
		System.out.println(BugId);
		return "Bug updated";
	}
	 @DeleteMapping("/bug/{id}")
	  String deleteBug(@PathVariable("id") int BugId) {
		  System.out.println(BugId);
		  return "Bug deleted";
	  }
}
