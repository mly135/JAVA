package user.com.bjsxt;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) {
		
		try {
			BeanFactory factory = new ClassPathXmlApplicationContext("bean.xml");
			AddUser adduser = (AddUser)factory.getBean("addUser");
			adduser.userAdd();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
