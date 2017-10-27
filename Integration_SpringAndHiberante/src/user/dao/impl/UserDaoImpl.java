package user.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import user.com.bjsxt.User;
import user.dao.IUserDao;

@Component
public class UserDaoImpl implements IUserDao {

	@Resource
	private SessionFactory mySessionFactory;
	 
	private int tge;

	public int getTge() {
		return tge;
	}

	public void setTge(int tge) {
		this.tge = tge;
	}

	@Override
	public void insertToDb(User user) {
		Session session = mySessionFactory.openSession();
		session.save(user);
	}

}
