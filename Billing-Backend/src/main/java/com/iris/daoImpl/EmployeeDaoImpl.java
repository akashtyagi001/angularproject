
package com.iris.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.iris.daos.EmployeeDao;
import com.iris.models.Operator;
import com.iris.models.ProjectAllocation;
import com.iris.models.Employee;

@Component
@Repository(value="employeeDao")
@Transactional
public class EmployeeDaoImpl implements EmployeeDao{
		@Autowired
	    private SessionFactory sessionFactory;//To get session factory from dbconfig.java file
	     public List<Employee> getAllEmployee() {
		try {
	          Session session=sessionFactory.getCurrentSession();
	           Query q=session.createQuery("from com.iris.models.Employee");
	           if (q.list()!=null) {
	           System.out.println("Not null");
	            return q.list();
	             	} 
	           else    	
	             	{
	System.out.println("Null");
						return null;
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				return null;
			}
	     public List<Employee> EmployeeAllocation(int empId) {

	 		try {
              Session session=sessionFactory.getCurrentSession();
               Query q=session.createQuery("from com.get.model.Employee where EmployeeId=:empId");
                 q.setParameter("empId",empId);
              return q.list();
               }
                     catch(Exception e)
	 		{
	 			e.printStackTrace();

	 		}

	 		return null;
	 	}

		public Employee getEmployeeById(int id) {
			try {

				Session session=sessionFactory.getCurrentSession();

				Employee d=session.get(Employee.class,id);

				 return d;

				 

				

			}

			catch(Exception e)

			{

				e.printStackTrace();

			}

			return null;

		}
/*public boolean setAttandance(Attandance obj) {

	try

	{

		Session session=sessionFactory.getCurrentSession();

		session.save(obj);

		return true;

	}

	catch(Exception e)

	{

		e.printStackTrace();

	}

	return false;

}

public Attandance getBill(Integer id, String month, String year) {

	// TODO Auto-generated method stub

	return null;*/
		public boolean setAttandance(Operator obj) {
			try

			{

				Session session=sessionFactory.getCurrentSession();

				session.save(obj);

				return true;

			}

			catch(Exception e)

			{

				e.printStackTrace();

			}

			return false;

		}

		
		public ProjectAllocation getProAllocationObj(int id) {
			try

			{

				Session session=sessionFactory.getCurrentSession();
				Query q=session.createQuery("from com.iris.models.ProjectConfiguration where ConfigId=:i ");

				q.setParameter("i",id);

				List<ProjectAllocation> allProAllocation = q.list();

				if(allProAllocation.size()==0) {

					return null;

				}

				else {

				ProjectAllocation ProAllocation = (ProjectAllocation)allProAllocation.get(0);

				System.out.println(ProAllocation);

				return ProAllocation;

				}

			}

			catch(Exception e)

			{

				e.printStackTrace();

			}

			return null;

		}

		
				
		public Operator getBill(Integer id, String month, int year) {
			try {

				Session session=sessionFactory.getCurrentSession();

				Query q=session.createQuery("from com.iris.models.Operator where EmployeeId=:i and month=:m and year=:y");

				q.setParameter("i",id);

				q.setParameter("m",month);

				q.setParameter("y",year);

				

				List<Operator> OperatorList=q.list();

				if(OperatorList.size()!=0) {

					System.out.println("obj");

					return OperatorList.get(0);

				}

			}

			catch(Exception e)

			{

				e.printStackTrace();

			}

			return null;

		}
		public List<Operator> getAllAttendance() {
			try {

				Session session=sessionFactory.getCurrentSession();

				Query q=session.createQuery("from Operator");

				return q.list();

			}

			catch(Exception e)

			{

				e.printStackTrace();

			}

			return null;

		}
		public String getEmployeeById1(int id) {
			try

			{

				Session session = sessionFactory.getCurrentSession();

				Employee obj = session.get(Employee.class, id);

				String name = obj.getEmployeeName();

				System.out.println(name);

				return name;

			}

			catch(Exception e)

			{

				e.printStackTrace();

			}

			return null;

		}
		public ProjectAllocation getConfig(int id) {
			try

			{

				Session session=sessionFactory.getCurrentSession();			

				Query q=session.createQuery("from com.iris.models.ProjectAllocation where EmplObj.employeeId=:i ");

				q.setParameter("i",id);

				List<ProjectAllocation> allProAllocation = q.list();

				if(allProAllocation.size()==0) {

					return null;

				}

				else {

				ProjectAllocation ProAllocation = (ProjectAllocation)allProAllocation.get(0);

				System.out.println(ProAllocation);

				return ProAllocation;

				}

			}

			catch(Exception e)

			{

				e.printStackTrace();

			}

			return null;

		}
	
		public List<ProjectAllocation> getAllAllocate() {
			try {

				Session session=sessionFactory.getCurrentSession();

				Query q=session.createQuery("from ProjectAllocation");

				return q.list();

			}

			catch(Exception e)

			{

				e.printStackTrace();

			}

			return null;

		}

}




















