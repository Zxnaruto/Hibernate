package pers.zx.test;

import java.util.List;

import javassist.bytecode.Descriptor.Iterator;

/*���ֻ�ǹ�������һ�����ƣ���������һ�����ԣ��������Ҫ�������������Ǹ���ȥ��*/

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
	   
	   //WHERE���
	 /*  String hql="FROM Person WHERE PerId=2";//Person������
	   Query query=session.createQuery(hql);
	   List results=query.list();
	   */
	   //SELECT���
	/*  String hql = "SELECT  cardId FROM IdCard ";
	   Query query = session.createQuery(hql);
	   
	   List results = query.list();
	   Hibernate.initialize(results);
		System.out.println("�����"+results);*/
	
	   //������
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
