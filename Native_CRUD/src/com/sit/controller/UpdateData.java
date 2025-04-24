package com.sit.controller;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import com.sit.configuration.HibernateUtil;

public class UpdateData {
	
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		/*
		 * 1st way NativeQuery nativeQuery = session.
		 * createNativeQuery("update student set sname=:name,semail=:email,saddr=:addr where sid=:id"
		 * ); nativeQuery.setParameter("name", "Vishal");
		 * nativeQuery.setParameter("email", "vishu@gmail.com");
		 * nativeQuery.setParameter("addr", "Pune"); nativeQuery.setParameter("id", 3);
		 * nativeQuery.executeUpdate();
		 * System.out.println("Data Updated successfully !!!"); tx.commit();
		 */
		
		//2nd way
		NativeQuery namedNativeQuery = session.getNamedNativeQuery("UpdateData");
		
		namedNativeQuery.setParameter("name", "Gayatri");
		namedNativeQuery.setParameter("email", "gayo@gmail.com");
		namedNativeQuery.setParameter("addr", "kop"); 
		namedNativeQuery.setParameter("id", 3);
		namedNativeQuery.executeUpdate();
		tx.commit();
		
	}

}
