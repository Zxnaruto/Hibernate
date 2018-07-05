package pers.zx.uitl;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {
	private static final SessionFactory sessionFactory=buildSessionFactory();
    private static  Session session;
     

  private static SessionFactory buildSessionFactory(){
      Configuration configuration=new Configuration().configure(); //实例化配置
      ServiceRegistry serviceRegistry= new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
      return configuration.buildSessionFactory(serviceRegistry);
  }
  //获取sessionFactory
  public static SessionFactory getSessionFactory(){
      return sessionFactory;
  }
  //获取session
  public static Session getSession(){
      return sessionFactory.openSession();
  }
  //关闭session
  public static void closeSession(){
      if(session!=null){
          session.close();
      }
  }

}
