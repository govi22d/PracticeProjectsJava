package com.maven.hibernate;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EmployeeRepository repo = new EmployeeRepository();
    	
        Employee em1 = new Employee("Smith1", 15);
        Employee em2 = new Employee("John1", 23);
        
        repo.deleteAll();
        System.out.println(" =======CREATE =======");
        repo.createEmployee(em1);
        repo.createEmployee(em2);
        
        System.out.println(" =======READ =======");
        List<Employee> ems1 = repo.readAllEmplyee();
        System.out.println("id" + ", " + "name" + ", " + "age");
        for(Employee e: ems1) {
            System.out.println(e.toString());
        }
        
        System.exit(0);
    }
}
