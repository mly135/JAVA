package com.thunisoft.test;

import java.sql.Connection;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.jdbc.Work;
import org.hibernate.service.ServiceRegistry;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.thunisoft.user.User;




public class HibernateTest {
	
	//session��������
    SessionFactory sessionFactory= null;
    
    //Sessoin ����
    Session session = null;
    
    //Transaction �������
	Transaction transaction = null;
	
	@Before
	public void init(){
		
		//���������ļ�
		Configuration config = new Configuration().configure();
		
		//ע�������ļ�
		ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		
		//����SessionFactoty����
		sessionFactory = config.buildSessionFactory(reg);
		
		//����Session����
		session = sessionFactory.openSession();
		
		//��������
		transaction = session.beginTransaction();
		
	}
	
	@After
	public void destory(){
		//�ύ����
		transaction.commit();
		
		//�ر�session
		session.close();

		//�ر�SessinFactory
		sessionFactory.close();
	}
	
	
	@Test
	public void testFlush() throws Exception{
		
		User user = (User)session.get(User.class, 1);
		System.out.println(user);
		user.setAge("22");
		
	}
	

	@Test
	public void testClear() throws Exception{
		
		User user = (User)session.get(User.class, 1);
		System.out.println(user);
		
		session.clear();
		User user1 = (User)session.get(User.class, 1);
		System.out.println(user1);
		
	}
	
	@Test
	public void testRflush() throws Exception{
		
		User user = (User)session.get(User.class, 1);
		System.out.println(user);
		session.refresh(user);
		System.out.println(user);
		
	}
	
	@Test
	public void testSave() throws Exception{
		
		//session.save(new User("12", "1313"));
		
		
		session.doWork(new Work() {
			
			@Override
			public void execute(Connection arg0) throws SQLException {
				// TODO Auto-generated method stub
				System.out.println(arg0);
			}
		});
		
	}
	
}
