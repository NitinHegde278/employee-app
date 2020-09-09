package com.emp.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.emp.model.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		// create a employee object
		Employee theEmployee = new Employee();
		
		// add employee object to the model
		theModel.addAttribute("employee", theEmployee);
		
		return "add_employee";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("employee") Employee theEmployee) {
		
		// log the input data
		System.out.println("theEmployee: " + theEmployee.getEmployeeName()
							+ " " + theEmployee.getEmployeeId());
		
		return "success_page";
	}
	
}
