package com.sit.controller;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import com.sit.configuration.HibernateUtil;

public class UpdateData {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        
        Query namedQuery = session.createNamedQuery("UpdateData");
        
        // Use the parameter names as defined in the named query
        namedQuery.setParameter("name", "Vaishnavi");
        namedQuery.setParameter("email", "vaishu@gmail.com");
        namedQuery.setParameter("id", 3);
        
        namedQuery.executeUpdate();
        tx.commit();
        session.close();
        
        System.out.println("Data Updated Successfully !!!");
    }
}
