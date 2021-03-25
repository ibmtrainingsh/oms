package com.ibm.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BugSystem {
	
		  @PostMapping("/bug")
	      String BugAppeared() {
	    	  return "Bug appeared";
	      }
		  @GetMapping("/bug")
		  String BugAnalyzed() {
			  return "Bug analyzed";
		  }
		  @PutMapping("/bug/{id}")
		  String BugResolve(@PathVariable("id") int BugId) {
			  System.out.println(BugId);
			  return "Bug Resolving";
		  }
		  @DeleteMapping("/order/{id}")
		  String BugRemoved(@PathVariable("id") int BugId) {
			  System.out.println(BugId);
			  return "Bug Removed";
		  }
	} 

