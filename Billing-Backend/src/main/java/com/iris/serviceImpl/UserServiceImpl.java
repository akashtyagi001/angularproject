package com.iris.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;



import com.iris.daos.UserDao;

import com.iris.models.User;
import com.iris.services.UserService;


@Service("userService")

@Transactional

public class UserServiceImpl implements UserService {



	@Autowired
    UserDao userDaoObj;

	

	public User validateUser(int Id, String password) {

		//some business logic...

		return userDaoObj.validateUser(Id, password);	

	}

	}



