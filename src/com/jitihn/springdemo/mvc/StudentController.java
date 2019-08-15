package com.jitihn.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jitihn.springdemo.domains.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/addstudent")
	public String addStudent(Model model) {
		model.addAttribute("student", new Student());
		return "student-form";
	}
	
	@RequestMapping("/process-student")
	public String processStudent(@ModelAttribute("student") Student student, Model model) {
		return "student-confirmation";
	}
}
