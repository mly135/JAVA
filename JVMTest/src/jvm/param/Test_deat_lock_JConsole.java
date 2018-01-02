package jvm.param;

public class Test_deat_lock_JConsole {
	
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			new Thread(new SynAddRunnable(1, 2)).start();
			new Thread(new SynAddRunnable(2, 1)).start();
		}
	}

}

class SynAddRunnable implements Runnable{
	
	int a, b;
	public SynAddRunnable(int a, int b){
		this.a = a;
		this.b = b;
		
	}

	@Override
	public void run() {
		synchronized (Integer.valueOf(a)) {
			synchronized (Integer.valueOf(b)) {
				System.out.print(b);
				
			}
		}
	}
	
}
