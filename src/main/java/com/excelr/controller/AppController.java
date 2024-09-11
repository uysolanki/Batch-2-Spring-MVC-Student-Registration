package com.excelr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.excelr.model.Student;

@Controller
public class AppController {

	
	@GetMapping("/home")
	public String getOwner(Model model)
	{
		return "home";
	}
	
	@RequestMapping("/registerUser")
	public String registerUser(Model mod)
	{
		Student s1=new Student();
		mod.addAttribute("stud",s1);
		return "user-form";
	}
	
	@RequestMapping("/saveStudentDetails")
	public String saveStudentDetails(@ModelAttribute Student st,Model model)
	{
		System.out.println(st);
		model.addAttribute("student",st);
		return "user-confirmation";
	}
}
