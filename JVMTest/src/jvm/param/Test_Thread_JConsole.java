package jvm.param;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_Thread_JConsole {
	
	public static void createByeThread(){
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true);
			}
		},"testByeThread");
		thread.start();
	}
	
	public static void createLockThread(final Object lock){
		Thread thred = new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized(lock){
					try {
						//lock.wait();
						System.out.println("µÈ´ý10Ãë");
						Thread.sleep(10000);
						System.out.println("ÔÙµÈ´ý5Ãë");
						Thread.sleep(5000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					
				}
				
			}
		},"testLockThread");
		thred.start();
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		createByeThread();
		br.readLine();
		createLockThread(new Object());
		br.close();
	}
}
