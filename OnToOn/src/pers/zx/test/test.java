package pers.zx.test;

import org.hibernate.Session;
import org.hibernate.Transaction;


import pers.zx.entity.Person;
import pers.zx.util.HibernateUtil;

public class test {
	public static void main(String[] args){
		
		
	
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		//Person a=new Person(6,"l3l","31");
		//IdCard b=new IdCard(6,"lll");
      //  a.setIdcard(b);
      //  b.setPerson(a);
        Transaction tx=session.beginTransaction();
       //session.save(a);
		//session.save(b);
		
		Person bean=(Person) session.get(Person.class, 6);
		
	
		//System.out.println("=="+bean);
		session.delete(bean);
		tx.commit();
		//System.out.println("³É¹¦"+bean.getName());
		HibernateUtil.getSessionFactory().close();
	}
}
