package com.jbk.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.jbk.hibernate.config.HibernateConfig;
import com.jbk.hibernate.entity.Product;

public class ProductDao {
	
	SessionFactory sf=HibernateConfig.getsessionfactory();
	
	public String saveproduct(Product product) {
		Session ss=sf.openSession();
		ss.save(product);
		ss.beginTransaction().commit();
		
		
		return "saved";
		
	}

}
