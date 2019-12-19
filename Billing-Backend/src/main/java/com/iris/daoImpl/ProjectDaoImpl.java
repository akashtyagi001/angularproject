package com.iris.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.iris.daos.ProjectDao;
import com.iris.models.Project;
import com.iris.models.ProjectAllocation;
import com.iris.models.ProjectConfiguration;
@Component
@Repository(value="projectDao")
@Transactional
public class ProjectDaoImpl implements ProjectDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public List<Project> getAllProject() {
		try {
			Session session=sessionFactory.getCurrentSession();
			Query q=session.createQuery("from com.iris.models.Project");
			if (q.list()!=null) {
				System.out.println("Not null");
				return q.list();
			} else {
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
	public List<ProjectConfiguration> getAllProjectConfig() {
			try {
				Session session=sessionFactory.getCurrentSession();
				Query q=session.createQuery("from com.iris.models.ProjectConfiguration");
				if (q.list()!=null) {
					System.out.println("Not null");
					return q.list();
				} else {
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


	public Project getProjectById(int projectId)

	{

		try

		{

			Session session=sessionFactory.getCurrentSession();
	      Project c=session.get(Project.class, projectId);
               return c;
	         	}
            catch(Exception e)
{
    e.printStackTrace();
}
		return null;
	}	
	
	public boolean setProjectConfig(ProjectConfiguration pObj1) {
		try
{
			Session session=sessionFactory.getCurrentSession();
			 Query q=session.createQuery("from com.iris.models.ProjectConfiguration where ProjectId=:projectId and RoleId=:roleId and Loc=:location");
			 q.setParameter("projectId",pObj1.getProjObj());
			   q.setParameter("roleId",pObj1.getRoleObj());
			   q.setParameter("location",pObj1.getLocation());
			   if(q.list().size()==0) {
			    session.save(pObj1);
			    return true;
			   }
			   
}
 catch(Exception e)
 {
  e.printStackTrace();
 }
return false;
	}

	
	public ProjectConfiguration getProjectConfig(int id) {
	try
		{
			Session session=sessionFactory.getCurrentSession();
			ProjectConfiguration p = session.get(ProjectConfiguration.class, id);
			return p;
		}
		catch(Exception e)
		{
e.printStackTrace();
		}
		return null;
	}
	
	
	
	
	
	public List<ProjectConfiguration> validateProject(int projectId, int roleId, String location) {
		try {

			Session session=sessionFactory.getCurrentSession();
	Query q=session.createQuery("from com.iris.models.ProjectConfiguration where ProjObj.projectId=:projectId and RoleObj.roleId=:roleId and loc=:location");
        q.setParameter("projectId",projectId);
	   q.setParameter("roleId",roleId);
           q.setParameter("location",location);
             	return q.list();
		}
         catch(Exception e)
            	{
              	e.printStackTrace();

		}

		return null;

	}
	
	
	public boolean setProjectAllocation(ProjectAllocation projectAllocation) {
		try {



			Session session=sessionFactory.getCurrentSession();

			Query q=session.createQuery("from com.iris.models.ProjectAllocation where employeeId=:employeeId and configId=:configurationId");

			q.setParameter("employeeId",projectAllocation.getEmplObj().getEmployeeId());

			q.setParameter("configurationId",projectAllocation.getConfigObj().getConfigurationId());

			if(q.list().size()==0) {
				session.save(projectAllocation);
				return true;

			}

			}

			catch(Exception e) {
				e.printStackTrace();
			}
			return false;

		}
	
	
	
	/*public boolean checkProjectConfiguration(ProjectConfiguration obj) {
		try {
	Session session=sessionFactory.getCurrentSession();
Query q=session.createQuery("from com.iris.models.ProjectConfiguration where projectId=:projectId and roleId=:roleId and loc=:location");
	q.setParameter("projectId",obj.getProjObj());
	q.setParameter("roleId",obj.getRoleObj());
	q.setParameter("location",obj.getLocation());

			if(q.list().size()==0) {

				session.save(obj);

				return true;

			}

			

		}

			catch(Exception e)



			{



				e.printStackTrace();



			}

		return false;

	}
*/
	
/*	public List<ProjectConfiguration> getAllProjectConfigNotAllocated() {
		try {
       Session session=sessionFactory.getCurrentSession(); 
        Query q=session.createQuery("from ProjectConfiguration where configurationId not in(select ConfigObj.configurationId from ProjectAllocation)");
         return q.list();
		}
            catch(Exception e)
		{
         e.printStackTrace();
              }
           return null;
}
	
	
	
	public List<ProjectConfiguration> getAllProjectConfiguration(int projectId) {
		try {
          	Session session=sessionFactory.getCurrentSession();
          	Query q=session.createQuery("from com.iris.models.ProjectConfiguration where ProjObj.projectId=:projectId");
             q.setParameter("projectId",projectId);

                 	return q.list();
                       
		}

           catch(Exception e)

		{
	e.printStackTrace();

		}
		return null;
	}
	*/
	public List<ProjectConfiguration> getAllProjectConfiguration(int projectId) {


		try {

			System.out.println("i am config");

			Session session=sessionFactory.getCurrentSession();

			Query q=session.createQuery("from com.iris.models.ProjectConfiguration where ProjObj.projectId=:proId");

			q.setParameter("proId", projectId);

				return q.list();

		}

		catch(Exception e)

		{

			e.printStackTrace();

		}

		return null;

	}
	public List<ProjectConfiguration> getAllConfigId(int id) {
		

		try

		{

			Session session=sessionFactory.getCurrentSession();

			Query q=session.createQuery("from com.iris.models.ProjectConfiguration where proId=:p");

			q.setParameter("p", id);

			

			return q.list();

		}

		catch(Exception e)

		{

			e.printStackTrace();

		}

		return null;

	}
	public List<ProjectAllocation> getAllProjectAllocation() {

		try {



			Session session=sessionFactory.getCurrentSession();

			Query q=session.createQuery("from com.iris.models.ProjectAllocation");

			

			List list=q.list();

			return list;



		}



		catch(Exception e)



		{



			e.printStackTrace();



		}



		return null;

	}

	}

