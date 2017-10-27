package user.com.bjsxt;

import org.springframework.stereotype.Component;


@Component
public class User {
	
	public String age;
	
	public String name;

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
