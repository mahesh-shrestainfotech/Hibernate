package com.mtc.app.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.mtc.app.entity.Product;

public class HibernateUtil {
	
	private final static SessionFactory SESSION_FACTORY;
	
	static {
		
		Configuration configuration = new Configuration();
		
		//loads hibernate.cfg.xml
		configuration.configure();
		
		configuration.addAnnotatedClass(Product.class);
		
		//starts hibernate services essential to work with hibernate framework
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		
		SESSION_FACTORY  = configuration.buildSessionFactory(serviceRegistry);
		
		
	}
	
	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}

}
