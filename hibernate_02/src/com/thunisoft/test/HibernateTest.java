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
	
	//session工厂对象
    SessionFactory sessionFactory= null;
    
    //Sessoin 对象
    Session session = null;
    
    //Transaction 事物对象
	Transaction transaction = null;
	
	@Before
	public void init(){
		
		//加载配置文件
		Configuration config = new Configuration().configure();
		
		//注册配置文件
		ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		
		//创建SessionFactoty对象
		sessionFactory = config.buildSessionFactory(reg);
		
		//创建Session对象
		session = sessionFactory.openSession();
		
		//开启事物
		transaction = session.beginTransaction();
		
	}
	
	@After
	public void destory(){
		//提交事务
		transaction.commit();
		
		//关闭session
		session.close();

		//关闭SessinFactory
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
