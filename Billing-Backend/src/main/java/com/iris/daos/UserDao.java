package com.iris.daos;

import com.iris.models.User;


public interface UserDao {
	public User validateUser(int userId, String password);
}
