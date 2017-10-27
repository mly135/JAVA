package user.com.bjsxt;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import user.dao.IUserDao;
import user.service.IUserService;

@Component
public class AddUser {
	
	@Resource(name = "userService")
	private IUserService userService;
	
	/*public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}*/

	@Autowired
	@Qualifier(value="aaa")
	private IUserDao userDao;

	public void userAdd() throws Exception{
		userService.insertToDb(User.class.newInstance());
		//userDao.insertToDb(user);
	}

}
