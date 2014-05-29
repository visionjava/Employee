package com.visionjava.employee.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.visionjava.employee.model.Employee;

@Controller
public class EmployeeController {
	@Value("${userName}")
	private String user;
	
	@InitBinder
	public void allowEmptyDateBinding( WebDataBinder binder )
	{
	    // tell spring to set empty values as null instead of empty string.
	    binder.registerCustomEditor( String.class, new StringTrimmerEditor( true ));
	    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("MM/dd/yyyy");
	    simpleDateFormat.setLenient(false);
	    binder.registerCustomEditor( Date.class, new CustomDateEditor( simpleDateFormat,false));	   
	}

	@RequestMapping("/")
	public String showHomePage(){
		System.out.println(user);
		return "employeeHomePage";
	}
	
	@RequestMapping(value="/enroll", method = RequestMethod.GET)
	public ModelAndView showEnrollmentPage(){		
		ModelAndView modelAndView = new ModelAndView("employeeEnrollment");
		modelAndView.addObject("employee", new Employee());
		return modelAndView;
	}
	
	@RequestMapping(value="/submitEnrollment", method = RequestMethod.POST)
	public String submitEnrollment(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult, ModelMap modelMap ){		
		
		if(bindingResult.hasErrors()){
			return "employeeEnrollment";
		}
		
		return "employeeHomePage";
	}
	
}
