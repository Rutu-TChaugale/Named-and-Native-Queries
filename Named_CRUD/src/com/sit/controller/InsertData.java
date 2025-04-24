package com.sit.controller;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.sit.configuration.HibernateUtil;

public class InsertData {
	
	public static void main(String[] args) {
	Session session = HibernateUtil.getSessionFactory().openSession();
	Transaction tx = session.beginTransaction();
	
	Query namedQuery = session.createNamedQuery("InsertData");
	namedQuery.setParameter("id", "3");
	namedQuery.setParameter("name", "Gayatri");
	namedQuery.setParameter("email", "gayu@gmail.com");
	namedQuery.executeUpdate();
	tx.commit();
	
	
	}

}
