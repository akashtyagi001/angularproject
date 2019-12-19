package com.iris.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.iris.daos.UserDao;
import com.iris.models.User;

@Controller
@CrossOrigin(value="http://localhost:4200")
public class Controllers {
	

	@Autowired
	UserDao userDao;
	@RequestMapping(value= {"/","homepage"},method=RequestMethod.GET)

	public String Home() {

		return "homepage";

	}
	
	/*@RequestMapping(value="/",method=RequestMethod.GET)
    public String sayHello(){
           return "homepage";
}*/
	@RequestMapping(value= "/contact",method=RequestMethod.GET)

	public String contact() {

		return "contact";

	}

	@RequestMapping(value= "/about",method=RequestMethod.GET)

	public String about() {

		return "about";

	}
    @RequestMapping(value="/login",method=RequestMethod.GET)
  public String getSignInForm(){
          return "login";
  }
    
    @Autowired
	HttpSession session;
@RequestMapping(value="/validate",method=RequestMethod.POST)
public ResponseEntity<?> validateUserForLoginPage(@RequestParam int userId, @RequestParam String password,ModelMap map)
{
                System.out.println("I m here.... 1");
                User uObj=userDao.validateUser(userId,password);
                if(uObj!=null) {
                                System.out.println("I m here.... 2");
                                return new ResponseEntity<User>(uObj,HttpStatus.OK);
                                /* System.out.println("I m here.... 2 "+rd);
                                  session.setAttribute("resourceSessionObj", rd);
                                if(rd.getResourceRole().getRoleType().equals("ADMIN"))
                                                return "AdminWelcomePage";
                                else if(rd.getResourceRole().getRoleType().equals("MANAGER"))
                                                return "ProjectManagerWelcomePage";
                                else map.addAttribute("msg1","Others ka login");          
                                 return "DeveloperOrTesterWelcomePage";*/
                }
                else {
                                System.out.println("I m here.... 3");
                                return new ResponseEntity<String>("User is Invalid",HttpStatus.UNAUTHORIZED);
                                
                 }
                
                 /*map.addAttribute("msg1","Incorrect login details. Please re-enter.");
                return "LoginPage";*/
}





/*public String validateUser(@RequestParam int userId,@RequestParam String password) {
	User uObj=userDao.validateUser(userId,password);
	
	System.out.println("I m validating User : "+uObj);
	
	if(uObj!=null){
		session.setAttribute("uObj",uObj);
		
		
		if(uObj.getEmployeeRole().equals("admin")) {
			System.out.println(session.getAttribute("uObj"));
			return "admin";
		}
		else
		return "operator";
}
	else {
		
		return "login";
	}
}
*/










/*
@Autowired

UserDao userDao;

@RequestMapping(value= "/",method=RequestMethod.GET)

public String Home() {

	return "homepage";

}


@Autowired

HttpSession session;

@RequestMapping(value="/login",method=RequestMethod.POST)

public String validateUser(@RequestParam int userId,@RequestParam String password){

	

	User uObj=userDao.validateUser(userId, password);

	if(uObj!=null){

		session.setAttribute("userObj",uObj);

		if(uObj.getEmployeeRole().equals("operator"))

		{				

		return "operator";

		}

		else if(uObj.getEmployeeRole().equals("admin"))

		{

			return "AdminPage";

		}

		else

		{

			return "ManagerPage";

		}

	}

	else {

		return "index";

	}

	

}
*/
@RequestMapping(value= {"logout"}, method=RequestMethod.GET)

public String logout() {

	session.removeAttribute("uObj");

      session.invalidate();

	return "homepage";

}



}