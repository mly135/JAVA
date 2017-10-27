package dxc.text;

class Bank{
	private int sum;
	public int addMoney(int count){
		sum+= count;
		return sum;
	}
	
}

class Custom implements Runnable{
	Bank bank = new Bank();
	@Override
	public void run() {
		for (int i = 0; i <10; i++) {
			System.out.println(Thread.currentThread().getName()+":"+bank.addMoney(1));
		}
	}
	
}

public class BanKDemo {
	public static void main(String[] args) {
		Custom custom = new Custom();
		Thread user1 = new Thread(custom);
		user1.setName("´°¿Ú1");
		Thread user2 = new Thread(custom);
		user2.setName("´°¿Ú2");
		user1.start();
		user2.start();
	}

}

