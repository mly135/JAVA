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
		
		//����sessionFactory
		SessionFactory sessionFactory = null;
		
		//����config����,����hibernate�Ļ���������Ϣ
		Configuration config = new Configuration().configure();
		
		//����ServiceRegistry����ע��������Ϣ�Ͷ���
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		
		//����SessionFactory����
		sessionFactory = config.buildSessionFactory(serviceRegistry);
		
		//����Session����
		Session session = sessionFactory.openSession();
		
		//��������
		Transaction transaction = session.beginTransaction();
		
		//ִ�б���
		session.save(new User("27","������"));
		
		//�ύ����
		transaction.commit();
		
		//�ر�session
		session.close();
		
		//�ر�sessionFactory
		sessionFactory.close();
		
	}

}
