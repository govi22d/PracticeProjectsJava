package com.maven.hibernate;

import java.util.List;

import org.hibernate.Session;

public class EmployeeRepository extends BaseRepository {

	public Integer createEmployee(Employee e) {
		Session session = super.OpenSession();
		session.beginTransaction();
        session.save(e);
        session.getTransaction().commit();
        super.DestroySession(session);
        
        System.out.println("Successfully created " + e.toString());
        return e.getId();
    }
    
    public List<Employee> readAllEmplyee() {
    	Session session = super.OpenSession();
    	@SuppressWarnings("unchecked")
        List<Employee> employees = session.createQuery("FROM Employee").list();
    	super.DestroySession(session);
    	
        System.out.println("Found " + employees.size() + " Employees");
        return employees;
    }
    
    public void update(Employee e) {
    	Session session = super.OpenSession();
    	session.beginTransaction();
        Employee em = (Employee) session.load(Employee.class, e.getId());
        em.setName(e.getName());
        em.setAge(e.getAge());
        session.getTransaction().commit();
        super.DestroySession(session);
        
        System.out.println("Successfully updated " + e.toString());
    }
    
    public void deleteEmployee(Integer id) {
    	Session session = super.OpenSession();
    	session.beginTransaction();
    	Employee e = (Employee) session.load(Employee.class, id);
    	session.delete(e);
        session.getTransaction().commit();
        super.DestroySession(session);
        
        System.out.println("Successfully deleted " + e.toString());
    }
    
    public void deleteAll() {
    	Session session = super.OpenSession();
        session.beginTransaction();
        var query = session.createQuery("DELETE FROM Employee ");
        query.executeUpdate();
        session.getTransaction().commit();
        super.DestroySession(session);
        
        System.out.println("Successfully deleted all employees.");
    }
}
