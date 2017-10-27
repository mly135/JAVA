package com.thunisoft.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.thunisoft.user.User;

public class Test {

	public static void main(String[] args) {
		
		//创建sessionFactory
		SessionFactory sessionFactory = null;
		
		//创建config对象,加载hibernate的基本配置信息
		Configuration config = new Configuration().configure();
		
		//创建ServiceRegistry对象，注册配置信息和对象
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		
		//创建SessionFactory对象
		sessionFactory = config.buildSessionFactory(serviceRegistry);
		
		//创建Session对象
		Session session = sessionFactory.openSession();
		
		//开启事物
		Transaction transaction = session.beginTransaction();
		
		//执行保存
		session.save(new User("27","张丽荣"));
		
		//提交事务
		transaction.commit();
		
		//关闭session
		session.close();
		
		//关闭sessionFactory
		sessionFactory.close();
		
	}

}
