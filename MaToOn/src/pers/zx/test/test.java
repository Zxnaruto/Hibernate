package pers.zx.test;




import org.hibernate.Session;
import org.hibernate.Transaction;

import pers.zx.entity.Depart;
import pers.zx.entity.Employee;
import pers.zx.util.HibernateUtil;

public class test {
	public static void main(String[] args){
		Depart a=new Depart();
		
	
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		//Employee bean1=new Employee(3,"С��",20,"��");
		Transaction tx=session.beginTransaction();
		
		//session.save(bean);
		Depart bean=(Depart) session.get(Depart.class, 1);
		
	
		System.out.println("=="+bean);
		//session.delete(bean);
		tx.commit();
		System.out.println("�ɹ�"+bean.getDepartName());
		HibernateUtil.getSessionFactory().close();
	}
}
