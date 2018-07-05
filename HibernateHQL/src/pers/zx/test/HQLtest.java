package pers.zx.test;

import java.util.List;

import javassist.bytecode.Descriptor.Iterator;

/*外键只是关联，是一种限制，并不代表一个属性，外键还是要到它是主键的那个表去查*/

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import pers.zx.entity.Person;
import pers.zx.util.HibernateUtil;


public class HQLtest {
	   private static SessionFactory factory; 
   public static void main(String[] args){
	   try{
	         factory = new Configuration().configure().buildSessionFactory();
	      }catch (Throwable ex) { 
	         System.err.println("Failed to create sessionFactory object." + ex);
	         throw new ExceptionInInitializerError(ex); 
	      }

	   Session session=factory.openSession();
	   Transaction tx = session.beginTransaction();
	   
	   //WHERE语句
	 /*  String hql="FROM Person WHERE PerId=2";//Person是类名
	   Query query=session.createQuery(hql);
	   List results=query.list();
	   */
	   //SELECT语句
	/*  String hql = "SELECT  cardId FROM IdCard ";
	   Query query = session.createQuery(hql);
	   
	   List results = query.list();
	   Hibernate.initialize(results);
		System.out.println("结果："+results);*/
	
	   //迭代器
	  List persons=session.createQuery("FROM Person").list();
	  //List idcards=session.createQuery("FROM IdCard").list();
	  System.out.println("PerId"+"  "+"PerName"+"  "+"PerAge"+" "+"PerIdCard");
	  for(java.util.Iterator iterator=persons.iterator();iterator.hasNext();){
		  Person person=(Person) iterator.next();
		  System.out.println(person.getPerId()+"  "+person.getPerName()+"  "+person.getPerAge());
	  }
	
	   tx.commit();
	   session.close();
	HibernateUtil.getSessionFactory().close();
   }
}
