package com.sit.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import com.sit.configuration.HibernateUtil;
import com.sit.model.Student;

public class SelectData {
	
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		NativeQuery namedNativeQuery = session.getNamedNativeQuery("SelectData");
		
		List<Object[]> list = namedNativeQuery.getResultList();
		
		for (Object[] objcets : list) {
			System.out.println(objcets[0] +" "+objcets[1]+" "+objcets[2]+" "+objcets[3]);
		}
		
	}

}
