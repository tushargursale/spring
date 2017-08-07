package com.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Student;
import com.service.StudentService;


@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;

	
	@RequestMapping("/")
	public String setUpForm(Map<String,Object> map){
		System.out.println("first method");
		Student student=new Student();
		map.put("student",student);
		map.put("studentList",studentService.getAllStudent());
		return "student";
	}
	
	@RequestMapping(value="student.do",method=RequestMethod.POST)
	public String doActions(@ModelAttribute Student student,BindingResult result,@RequestParam String action,Map<String,Object> map){
		System.out.println("do method");
		Student student2=new Student();
		
		switch (action.toLowerCase()) {
		case "add":
			studentService.add(student);
			student2=student;
			break;
		case "edit":
			
			studentService.edit(student);
			student2=student;
			break;
		case "delete":
			studentService.delete(student.getStudentId());
			student2=new Student();
			break;
		case "search":
		Student searchStudent=	studentService.getStudent(student.getStudentId());
			student2=searchStudent !=null ? searchStudent :new Student();
			break;

		}
		map.put("student",student2);
		map.put("studentList",studentService.getAllStudent());
		
		return "student";
	}
	
}
