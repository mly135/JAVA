package user.dao.impl;

import user.com.bjsxt.User;
import user.dao.IUserDao;

public class UserDaoImpl implements IUserDao {

	@Override
	public void insertToDb(User user) {

		System.out.println("user 已经存到数据库！！！！");
	}

}
