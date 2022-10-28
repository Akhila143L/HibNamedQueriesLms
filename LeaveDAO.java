package com.infinite.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class LeaveDAO {
	SessionFactory sessionFactory;

public List<Leave> showLeaveHistory() {
		
		sessionFactory = SessionHelper.getSession();
  	    Session session=sessionFactory.openSession();  
		Query query = session.getNamedQuery("showLeaveHistory");
		List<Leave> leaveList = query.list();
		return leaveList;
	}
public String add(Leave leaveId ){
	sessionFactory = SessionHelper.getSession();
	Session session = sessionFactory.openSession(); 
	Transaction tran = session.beginTransaction();
	session.save(leaveId);
	session.close();
	
	return "Leave Added Sucessfully...";
	
}
}
