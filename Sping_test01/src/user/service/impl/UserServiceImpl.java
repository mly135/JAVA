package user.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import user.com.bjsxt.User;
import user.dao.IUserDao;
import user.service.IUserService;


public class UserServiceImpl implements IUserService {
	
	@Autowired
	@Qualifier(value="aaa")
	private IUserDao userDao;

	public IUserDao getUserDao() {
		return userDao;
	}
	

/*	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}*/

	@Override
	public void insertToDb(User user) {
		userDao.insertToDb(user);
		
	}
}
