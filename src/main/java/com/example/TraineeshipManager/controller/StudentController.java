package com.example.TraineeshipManager.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @RequestMapping("/student/dashboard")
    public String getUserHome(){
   	 	Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
   	 	String currentPrincipalName = authentication.getName();
		 System.err.println(currentPrincipalName);
		
        return "student/dashboard";
    }
}
