package controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import beans.Student;


@Controller
public class RegisterController {

	@RequestMapping("/first")
	public ModelAndView hello()
	{
		
		Student student=new Student();
		return new ModelAndView("register","student",student);
		
	}
	
	
	@RequestMapping("/second")
	public ModelAndView m1(@Valid Student stud,BindingResult br)
	{
		if(br.hasErrors()){
			return new ModelAndView("register");
		}else
		{
			return new ModelAndView("display","msg", stud);
		}
		
	}
	@RequestMapping("/back")
	public ModelAndView back(Student s)
	{
				return new ModelAndView("register");
	}
	
	
}
