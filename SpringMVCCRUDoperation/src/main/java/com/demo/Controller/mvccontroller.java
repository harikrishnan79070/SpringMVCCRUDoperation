package com.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Student;
import com.demo.service.RegistrationService;

@Controller
public class mvccontroller 
{
 @Autowired
 private RegistrationService ser;	
 
 public mvccontroller() 
 {
	System.out.println("Front-Controller invorked");
 }
 
 @RequestMapping(value="/")
 public String homepage() 
 {
	 return "registration.jsp";
 }
 @RequestMapping(value="/register",method=RequestMethod.POST)
 public ModelAndView registerForm(Student s)
 {
	 ser.studentRegistrationService(s);
	 return new ModelAndView("sucess.jsp").addObject("sucess", "Record Sucessfully Inserted");
 }
}
