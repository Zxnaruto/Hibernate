package pers.zx.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pers.zx.entity.Student;
import pers.zx.util.HibernateUtil;

public class test {

	public static void main(String[] args){
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		//Employee bean1=new Employee(3,"小数",20,"男");
		Transaction tx=session.beginTransaction();
		
		//session.save(bean);
		Student bean=(Student) session.get(Student.class, 1);
		
		System.out.println("=="+bean);
		//session.delete(bean);
		tx.commit();
		System.out.println("成功"+bean.getStuName());
		HibernateUtil.getSessionFactory().close();
	}
}
