package com.jbk.hibernate.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jbk.hibernate.entity.Product;

public class HibernateConfig {
	
	public static SessionFactory getsessionfactory() {
		
		Configuration config=new Configuration();
		config.configure().addAnnotatedClass(Product.class);
		SessionFactory sf=config.buildSessionFactory();
		return sf;
	}

}
