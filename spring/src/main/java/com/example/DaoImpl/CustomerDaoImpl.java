package com.example.DaoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.customerDao.CustomerDao;
import com.example.models.Customer;


@Repository("CustomerDao")
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public boolean registerCustomer(Customer CustomerObj) {
		try {
		Session session=sessionFactory.getCurrentSession();
		session.save(CustomerObj);
		return true;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	
	@Transactional
	public Customer validateCustomer(int Id, String password) {
		try {
		Session session=sessionFactory.getCurrentSession();
		Customer CustomerObj=session.get(Customer.class, Id);
		
		//If object is found with the given ID 
		if(CustomerObj!=null){
			if(CustomerObj.getPassword().equals(password)){
				return CustomerObj;
			}
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Transactional
	public List<Customer> getAllCustomer() {
		Session session=sessionFactory.getCurrentSession();
		Query q=session.createQuery("from com.example.models.Customer where id='101'");
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
		return null;
	}

}
