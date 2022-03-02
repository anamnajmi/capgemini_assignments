package com.NewEmployee;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Controller
public class EmployeeManager {
	ArrayList<Employee>employee= new ArrayList();
@RequestMapping("/search")
@ResponseBody
	public Employee employeeDetails(@RequestParam("employee_id") int employeeid) {
	
	Employee temp = null;
	for(Employee e: employee) {
		if(employeeid== e.getId()){
			
			temp=e;
		}
	}
	return temp;
	
	}
@RequestMapping("/add")
@ResponseBody

public ModelAndView addEmployee(@RequestParam("e_id") int i,@RequestParam("e_name") String n,@RequestParam("e_address") String a,@RequestParam("e_contact") long c,@RequestParam("e_department") String d,@RequestParam("e_designation") String de,@RequestParam("e_salary") int s ) {
	
	ModelAndView mv2 =new ModelAndView();
	
	Employee e = new Employee();
	e.setName(n);
	e.setContact(c);
	e.setAddress(a);
	e.setId(i);
	e.setDepartment(d);
	e.setDesignation(de);
	e.setSalary(s);
	employee.add(e);
	mv2.setViewName("add.jsp");
	return mv2;
	
}
@RequestMapping("/open")
@ResponseBody
public ArrayList<Employee> showDb() {
	return employee;
}
@RequestMapping("/addmore")
public ModelAndView returnBack() {
	ModelAndView mv3 =new ModelAndView();
	mv3.setViewName("index.jsp");
	return mv3;
}
@RequestMapping("/update")
public Employee upadteDatabase(@RequestParam("id") int i,@RequestParam("new_id") int f,@RequestParam("new_name") String n,@RequestParam("new_address") String a,@RequestParam("new_contact") long c,@RequestParam("new_department") String d,@RequestParam("new_designation") String de,@RequestParam("new_salary") int s) {
	Employee temp = null;
	for(Employee e: employee) {
		if(i== e.getId()){
			e.setId(f);
			e.setName(n);
			e.setAddress(a);
			e.setContact(c);
			e.setSalary(s);
			e.setDesignation(de);
			e.setDepartment(d);
			temp=e;
		}
	}
	return temp;
}
@RequestMapping("/remove")
@ResponseBody
public ArrayList removeEmployee(@RequestParam("employee_id")int i) {
	employee.remove(i-1);
	ArrayList<Employee> a =showDb();
	return a;
}
}
