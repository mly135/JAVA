package dxc.text;

/**
 * @author mengly
 *
 *1.���߳���Ҫʵ��java.lang.Thread���������ʵ��Runnable�ӿ�
 * �̳�java.lang.Thread����Ҫ��дrun()������ʹ��start()���������߳�
 * 
 * ����
 * 1.setPriority() �������ȼ���1~10,Ĭ��Ϊ5
 * 2.setName()�����߳�����
 * 3.currentThread();//�������ִ�е��̶߳���
 * 4.sleep()�߳�����,����Ϊ����
 * 5.yield();//����cpuʹ��Ȩ��
 * 6.isDaemon();//�ж��Ƿ��ػ��߳�
 * 7.interrupt();�ж��߳�
 * 8.isInterrupted();�߳��Ƿ��ж�
 * 9.interrupted();������һ���жϵ��߳�
 */

public class testThread {
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
		TestThread testThread = new TestThread();
		testThread.setName("++���߳�++");
		//�������ȼ������ȼ�Ĭ��Ϊ5����ѡΪ1��10
		testThread.setPriority(Thread.MAX_PRIORITY);
		Thread.currentThread().setName("**���߳�**");
		Thread.currentThread().setPriority(1);
		testThread.start();
		for (int i = 0; i < 50; i++) {
			Thread.currentThread().sleep(300L);
			
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		
		

		//������ʵ��
		new Thread(){
			public void run(){
				Thread.currentThread().setName("���߳�");
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