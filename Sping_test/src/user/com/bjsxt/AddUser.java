package user.com.bjsxt;

import user.service.IUserService;
import user.service.impl.UserServiceImpl;

public class AddUser {
	public void userAdd() throws Exception{
		
		BeanFactory factory = new ClassPathXmlApplicationContext();
		
		//IUserDao userDao = (UserDaoImpl)factory.getBean("u");
		
		User user = new User();
		
		IUserService userService = (UserServiceImpl)factory.getBean("userService");
		
		userService.insertToDb(user);
		//userDao.insertToDb(user);
	}

}
