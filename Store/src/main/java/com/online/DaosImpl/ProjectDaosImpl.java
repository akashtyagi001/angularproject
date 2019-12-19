package com.online.DaosImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.online.models.Products;

@Repository("ProjectDaos")
@Transactional
public class ProjectDaosImpl implements ProjectDaos {

	@Autowired
	private SessionFactory sessionFactory;
	
}