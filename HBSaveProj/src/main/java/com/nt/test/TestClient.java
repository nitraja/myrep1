package com.nt.test;

import com.nt.dao.EmployeeDAO;
import com.nt.dao.EmployeeDAOFactory;
import com.nt.domain.Employee;

public class TestClient {

	public static void main(String[] args) {
		 EmployeeDAO dao=null;
		 Employee emp=null;
		 int eno=0;
		//get DAO
         dao=EmployeeDAOFactory.getInstance();
         //invoke methods
          emp=new Employee();
          emp.setEid(1005);emp.setFirstname("raja"); emp.setLastname("rao"); emp.setEmail("rao@x.com");
          eno=dao.save(emp);
          System.out.println("Employee saved with no::"+eno);
          
	}

}
