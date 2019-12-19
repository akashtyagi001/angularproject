package com.example.customerDao;
import com.example.models.Customer;

import java.util.List;
public interface CustomerDao {

public boolean registerCustomer(Customer CustomerObj);
	public Customer validateCustomer(int Id,String password);
	public List<Customer> getAllCustomer();
	public boolean deleteCustomer(Customer  CustomerObj);
	public boolean updateCustomer(Customer CustomerObj);
	public Customer getCustomerById(int Id);

}

