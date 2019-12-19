package com.iris.services;

import com.iris.models.User;


public interface UserService {
	public User validateUser(int userId, String password);
}
