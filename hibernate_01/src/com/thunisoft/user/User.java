package com.thunisoft.user;

public class User {
	
	public Integer id;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String age;
	
	public String username;

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	
	public User(String age, String username) {
		super();
		this.age = age;
		this.username = username;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", age=" + age + ", username=" + username
				+ "]";
	}

	

}
