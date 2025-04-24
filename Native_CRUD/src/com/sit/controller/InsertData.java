package com.sit.controller;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import com.sit.configuration.HibernateUtil;

public class InsertData {
	
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		NativeQuery nativeQuery = session.createNativeQuery("insert into student(sname,semail,saddr) values(?1,?2,?3)");
		nativeQuery.setParameter(1, "Altmash");
		nativeQuery.setParameter(2, "altu@gmail.com");
		nativeQuery.setParameter(3, "Jaysinghpur");
		nativeQuery.executeUpdate();
		tx.commit();
		System.out.println("Data Inserted Successfully...!!!");
	}

}
