package com.iris.daos;

import java.util.List;

import com.iris.models.Role;

public interface RoleDao {
	public List<Role> getAllRole();
	public Role getRoleById(int rId);

}
