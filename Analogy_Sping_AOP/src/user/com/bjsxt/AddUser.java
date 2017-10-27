package user.com.bjsxt;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import user.service.IUserService;
import user.service.impl.UserServiceImpl;

public class AddUser {
	public void userAdd() throws Exception{
		
		BeanFactory factory = new ClassPathXmlApplicationContext("bean.xml");
		
		//IUserDao userDao = (UserDaoImpl)factory.getBean("u");
		
		User user = new User();
		
		IUserService userService = (UserServiceImpl)factory.getBean("userService");
		
		userService.insertToDb(user);
		//userDao.insertToDb(user);
	}

}
