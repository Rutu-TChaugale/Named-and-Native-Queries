package com.sit.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.sit.configuration.HibernateUtil;



public class FetchData {
	
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		Query namedQuery = session.createNamedQuery("SelectData");
		List<Object[]>  resultList = namedQuery.getResultList();
		
		for (Object[] object : resultList) {
			System.out.println(object[0]+" "+object[1]+" "+object[2]);
		}
	}

}
