package com.tgv.hibernate;

import javax.persistence.Query;

import org.hibernate.Session;

import com.tgv.pojo.Category;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    
    public static void main( String[] args )
    {
        
        try(Session s = HibernateUtils.getFactory().openSession()){
            Query q = s.createQuery("FROM Category");
            List<Category> cates = q.getResultList();
            cates.forEach(c -> System.out.println(c.getName()));
        }
    }
}
