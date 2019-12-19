package com.online.controller;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.online.Daos.ProductDao;
import com.online.models.*;

@Controller
public class Controllers {

		
		@Autowired
		ProductDao productDao;
		
		@RequestMapping(value="/",method=RequestMethod.GET)
		public String sayHello(ModelMap map){
			System.out.println("I m sayHello method of Controller class");
			map.addAttribute("myData","Welcome");
			
			return "HomePage";
		}
		
	
		@RequestMapping(value="/addProduct",method=RequestMethod.POST)
		public String  aProduct( @ModelAttribute() Product pObj, ModelMap map){
			//Will write the code to insert the object into the database
			System.out.println("add controller");
			
			boolean r=productDao.addProduct(pObj);
			if(r==true) {
			map.addAttribute("msg","Product Added Successfully");
			return "NewFile";}
			
			map.addAttribute("msg","Problem in Adding");
			return "NewFile";
		}
		
		
		@RequestMapping(value="/add",method=RequestMethod.GET)
		public String displayRegisterForm(ModelMap map){
			map.addAttribute("pObj",new Product());
			
			return "Add";
}
		
		@RequestMapping(value="/viewAllProducts",method=RequestMethod.GET)
		public ModelAndView getAllCustomers(){
			
			List<Product> product=productDao.getAllProducts();
			
			ModelAndView mv=new ModelAndView("AllProducts");
			mv.addObject("pList",product);
			return mv;
		}
}