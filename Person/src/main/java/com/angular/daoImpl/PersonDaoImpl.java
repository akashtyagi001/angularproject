package com.angular.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.angular.dao.PersonDao;
import com.angular.model.Person;


@Repository(value="personDao")
@Transactional
public class PersonDaoImpl implements PersonDao {
	@Autowired
    private SessionFactory sessionFactory;
     
	public List<Person> getAllPersons() {
	try {
          Session session=sessionFactory.getCurrentSession();
           Query q=session.createQuery("from com.angular.model.Person");
         
       	List list=q.list();
       	System.out.println("List of Persons "+list);
       	System.out.println("Size of List "+list.size());
       	
       	
       	return list;
			
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return null;
		}

	public boolean deletePerson(int p) {
		try {
	          Session session=sessionFactory.getCurrentSession();
	          System.out.println("in delete ka function===================");
	          Person pObj=session.get(Person.class, p);
	          session.delete(pObj);
	          return true;
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

	public boolean addPerson(Person Obj) {
		try {
	          Session session=sessionFactory.getCurrentSession();
	          System.out.println("in save ka function===================");
	         
	          session.save(Obj);
	          return true;
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
}
