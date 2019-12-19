package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.customerDao.CustomerDao;
import com.example.models.Customer;

@Controller
public class CustomerController {

	@Autowired
	CustomerDao CustomerDao;
	
	@RequestMapping(value="/viewAllCustomers",method=RequestMethod.GET)
	public ModelAndView getAllCustomers(){
		
		List<Customer> Customers=CustomerDao.getAllCustomer();
		
		ModelAndView mv=new ModelAndView("CustomersList");
		mv.addObject("CustomersList",Customers);
		return mv;
	}
	
	@RequestMapping(value="/deleteCustomer/{uId}",method=RequestMethod.GET)
	public ModelAndView deleteCustomer(@PathVariable int uId){
		
		System.out.println("Customer to delete = "+uId);
		Customer CustomerObj=CustomerDao.getCustomerById(uId);
		System.out.println("Customer Obj = "+CustomerObj);
		
		CustomerDao.deleteCustomer(CustomerObj);
		
		ModelAndView mv=new ModelAndView("CustomersList");
		mv.addObject("CustomersList",CustomerDao.getAllCustomer());
		mv.addObject("msg","Customer deleted Succesfully...");
		return mv;
	}
	
	@RequestMapping(value="/updateCustomer/{uId}",method=RequestMethod.GET)
	public ModelAndView getUpdateCustomerForm(@PathVariable int uId){
		
		
		Customer CustomerObj=CustomerDao.getCustomerById(uId);
		
		ModelAndView mv=new ModelAndView("SignUpForm");
		mv.addObject("CustomerObj",CustomerObj);
		mv.addObject("btnLabel","Update");
		mv.addObject("formLabel", "Update Form");
		return mv;
	}
}


