package user.dao.impl;

import user.com.bjsxt.User;
import user.dao.IUserDao;

public class UserDaoImpl implements IUserDao {

	private int tge;
	
	public int getTge() {
		return tge;
	}
	public void setTge(int tge) {
		this.tge = tge;
	}
	@Override
	public  void insertToDb(User user) {
		System.out.println("tge="+tge);
		System.out.println("UserDaoImpl,user �Ѿ��浽���ݿ⣡������");
	}

}
