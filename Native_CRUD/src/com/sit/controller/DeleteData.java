package com.sit.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import com.sit.configuration.HibernateUtil;

public class DeleteData {
public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		NativeQuery namedNativeQuery = session.getNamedNativeQuery("DeleteData");
		namedNativeQuery.setParameter("id", 3);
		namedNativeQuery.executeUpdate();
		tx.commit();
		System.out.println("data deleted successfully..!!");
		
		
	}
}
