package pers.zx.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pers.zx.entity.UserBean;
import pers.zx.util.HibernateUtil;




public class Insert {


	public static void main(String[] args){
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		//UserBean bean=new UserBean("×ôÖú×¢","55555");
		Transaction tx=session.beginTransaction();
		
		//session.save(bean);
		UserBean bean=(UserBean) session.get(UserBean.class, 2);
		//System.out.println("=="+bean);
		session.delete(bean);
		tx.commit();
		System.out.println("É¾³ý³É¹¦");
		HibernateUtil.getSessionFactory().close();
	}
}
