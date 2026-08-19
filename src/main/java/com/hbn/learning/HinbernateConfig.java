package com.hbn.learning;

import java.util.Properties;



import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

public class HinbernateConfig {


    public static SessionFactory getSessionFactory()
    {

        Properties properties = new Properties();

//		properties.put(Environment.DIALECT,"org.hibernate.dialect.MySQLDialect");
        properties.put("jakarta.persistence.jdbc.url","jdbc:mysql://localhost:3306/java11");
        properties.put(Environment.JAKARTA_JDBC_USER,"root");
        properties.put(Environment.JAKARTA_JDBC_PASSWORD,"Maurya");
        properties.put(Environment.HBM2DDL_AUTO,"create");
        properties.put(Environment.SHOW_SQL,"true");
        properties.put(Environment.FORMAT_SQL,"true");



//		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();



        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().applySettings(properties).build();

        Metadata meta = new MetadataSources(ssr).addAnnotatedClass(com.hbn.learning.entity.Employee.class).getMetadataBuilder().build();

        return meta.buildSessionFactory();

    }
}