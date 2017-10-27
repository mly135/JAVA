package user.com.bjsxt;

public class Test {
	public static void main(String[] args) {
		
		AddUser adduser = new AddUser();
		
		try {
			adduser.userAdd();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
