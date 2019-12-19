package com.iris.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iris.daos.RoleDao;
import com.iris.models.Role;
import com.iris.services.RoleService;

@Component
@Service("roleService")
@Transactional
public class RoleServiceImpl implements RoleService {


	@Autowired
   private RoleDao RoleDaoObj;
	
	
	public List<Role> getAllRole() {
		
		return RoleDaoObj.getAllRole();
	}

}