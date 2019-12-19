package com.example.controllers;


import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.customerDao.CustomerDao;
import com.example.models.Customer;


@Controller
public class Controllers {

	@Autowired
	CustomerDao cDao;
	
	@Autowired
	SessionFactory sessionFactory;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String sayHello(ModelMap map){
		map.addAttribute("Cust","Welcome to Customer Form!!!");
		
		return "homepage";
	}
	
	@RequestMapping(value="/getSignUpForm",method=RequestMethod.GET)
	public String displayRegisterForm(ModelMap map){
		map.addAttribute("CustomerObj",new Customer());
		return "SignUpForm";
	}
	
	@RequestMapping(value="/registerCustomer",method=RequestMethod.POST)
	public ModelAndView registerCustomer(@Valid @ModelAttribute ("CustomerObj") Customer CustomerObj,BindingResult result){
	if(result.hasErrors()){
			System.out.println("I m here..");
			ModelAndView mv=new ModelAndView("SignUpForm");
			mv.addObject("btnLabel","Sign Up");
			mv.addObject("formLabel", "SignUp Form");	
			return mv;
		}
		else {
		cDao.registerCustomer(CustomerObj);
		
		ModelAndView mv=new ModelAndView("SignInFile");
		mv.addObject("msg","User has been registered succesfully. Now u can Login");
		return mv;
		}
			
	}/*public ModelAndView registerUser(@Valid @ModelAttribute("userObj")  User userObj,
			BindingResult result){
		//Will write the code to insert the object into the database
		
		myValidator.validate(userObj, result);
		
		if(result.hasErrors()){
			System.out.println("I m here..");
			ModelAndView mv=new ModelAndView("SignUpForm");
			//mv.addObject("userObj",new User());
			mv.addObject("btnLabel","Sign Up");
			mv.addObject("formLabel", "SignUp Form");	
			return mv;
		}
		else {
		userObj.setRole("User");
		userDao.registerUser(userObj);
		
		ModelAndView mv=new ModelAndView("SignInForm");
		mv.addObject("msg","User has been registered succesfully. Now u can Login");
		return mv;
		}
	}*/
	
	@RequestMapping(value="/Login",method=RequestMethod.GET)
	public String displayLoginForm(ModelMap map){
		map.addAttribute("CustomerObj",new Customer());
		return "SignInFile";
	}
		@Autowired
	HttpServletRequest session;
@RequestMapping(value="/getSignInForm",method=RequestMethod.POST)
public String validateCustomer(@RequestParam int Id,@RequestParam String pass) {
	Customer uObj=cDao.validateCustomer(Id,pass);
	if(uObj==null){
		return "SignInFile";
}
	else {
		session.setAttribute("uObj",uObj);
		return "Success";
	}
}
/*@Transactional
public List<Customer> getAllCustomers() {
	Session session=sessionFactory.getCurrentSession();
	Query q=session.createQuery("from com.portal.models.Customer where role='Customer'");
	List<Customer> CustomersList=q.list();
	return CustomersList;
}

@Transactional
public boolean deleteCustomer(Customer CustomerObj) {
	try {
		Session session=sessionFactory.getCurrentSession();
		session.delete(CustomerObj);
		return true;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return false;

}

@Transactional
public boolean updateCustomer(Customer CustomerObj) {
	try {
		Session session=sessionFactory.getCurrentSession();
		session.update(CustomerObj);
		return true;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return false;

	
}

@Transactional
public Customer getCustomerById(int Id) {
	try {
	Session session=sessionFactory.getCurrentSession();
	Customer CustomerObj=session.get(Customer.class, Id);
	return CustomerObj;
	
	}
	catch(Exception e){
		e.printStackTrace();
	}
	return null;*/
}