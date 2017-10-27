package dxc.text;

/**
 * @author mengly
 *
 *1.多线程需要实现java.lang.Thread抽象类或者实现Runnable接口
 * 继承java.lang.Thread，需要从写run()方法，使用start()方法开启线程
 * 
 * 方法
 * 1.setPriority() 设置优先级，1~10,默认为5
 * 2.setName()设置线程名字
 * 3.currentThread();//获得正在执行的线程对象
 * 4.sleep()线程休眠,参数为毫秒
 * 5.yield();//放弃cpu使用权利
 * 6.isDaemon();//判断是否守护线程
 * 7.interrupt();中断线程
 * 8.isInterrupted();线程是否中断
 * 9.interrupted();返回上一次中断的线程
 */

public class testThread {
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
		TestThread testThread = new TestThread();
		testThread.setName("++子线程++");
		//设置优先级，优先级默认为5，可选为1到10
		testThread.setPriority(Thread.MAX_PRIORITY);
		Thread.currentThread().setName("**主线程**");
		Thread.currentThread().setPriority(1);
		testThread.start();
		for (int i = 0; i < 50; i++) {
			Thread.currentThread().sleep(300L);
			
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		
		

		//匿名类实现
		new Thread(){
			public void run(){
				Thread.currentThread().setName("子线程");
				for (int i = 0; i < 50; i++) {
					System.out.println(Thread.currentThread().getName()+":"+i);
				}
			}
		}.start();
		
	}
	
}
class TestThread extends Thread{
	public void run() {
		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep(200L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		
	}
	
	
}