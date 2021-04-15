package com.ibm.bts;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.ibm.bts.service.BugService;



public class UserController {
	Logger logger = Logger.getLogger(UserController.class.getName());
	@Autowired
	BugService bugService;
    @GetMapping("/hello")  
	String hello() {
    	logger.setLevel(Level.WARNING);
    //	logger.setLevel(Level.SEVERE);
    	logger.log(Level.WARNING,bugService.hashCode()+"printed");
    	  return "Hello";
      }
}
