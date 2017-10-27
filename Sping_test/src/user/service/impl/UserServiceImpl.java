package user.service.impl;

import user.com.bjsxt.User;
import user.dao.IUserDao;
import user.service.IUserService;


public class UserServiceImpl implements IUserService {
	
	private IUserDao userDao;

	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void insertToDb(User user) {
		userDao.insertToDb(user);
		
	}
	

}
