package com.nt.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.domain.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public int save(Employee emp) {
		Session ses=null;
		Transaction tx=null;
		int id=0;
		//Create Hibernate SessionFactory,Session objects
		ses=new Configuration().configure("/com/nt/cfgs/hibernate.cfg.xml").buildSessionFactory().openSession();
		//save Object
	
		try{
			tx=ses.beginTransaction();
		      id=(Integer)ses.save(emp);
			tx.commit();
		}//try
		catch(Exception e){
			tx.rollback();
		}
		return id;
	}//method
}//class
