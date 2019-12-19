package com.iris.Billing_Backend;


	import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.iris.config.DbConfig;
import com.iris.daos.UserDao;
import com.iris.models.User;

	public class AppTest{

		private static UserDao userDaoObj;
		
		@BeforeClass
		public static void init(){
			System.out.println("I m in init - start");
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DbConfig.class);
			userDaoObj=context.getBean(UserDao.class,"userDao");
	   	 	System.out.println("I m in init - end");
		}
		
	
		@Test
		public void validateUserTest(){
			User r=userDaoObj.validateUser(101,"admin");
			assertNotNull("Employee not found", r);
		}
		
	} 