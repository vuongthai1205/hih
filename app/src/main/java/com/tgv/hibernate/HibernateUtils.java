package com.tgv.hibernate;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.tgv.pojo.Category;

public class HibernateUtils {
    private static final SessionFactory factory;

    static{
        Configuration conf = new Configuration();
        Properties props = new Properties();

        props.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
        props.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
        props.put(Environment.URL, "jdbc:mysql://localhost/saledb");
        props.put(Environment.USER, "root");
        props.put(Environment.PASS, "");
        props.put(Environment.SHOW_SQL , "true");

        conf.setProperties(props);
        conf.addAnnotatedClass(Category.class);
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        factory = conf.buildSessionFactory(serviceRegistry);
    }

    public static SessionFactory getFactory(){
        return factory;
    }
}
