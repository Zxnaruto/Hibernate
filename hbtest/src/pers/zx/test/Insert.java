package pers.zx.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pers.zx.entity.UserBean;
import pers.zx.uitl.HibernateUtil;



public class Insert {

	@SuppressWarnings("unused")
	public static void main(String[] args){
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		UserBean bean=new UserBean("×ôÖú×¢","55555");
		Transaction tx=session.beginTransaction();
		
		session.save(bean);
		//UserBean bean=(UserBean) session.get(UserBean.class, 1);
		tx.commit();
	}
}
