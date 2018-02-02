package fourThreadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * ���������̳߳أ�֧�ֶ�ʱ��������ִ������.
 * <p>Title: TestNewScheduledThreadPoll</p>
 * <p>Description: </p>
 * <p>Company: ����������Ϣ�������޹�˾</p> 
 * @author mengly
 * @date 2018-1-16 ����3:23:01
 */
public class TestNewScheduledThreadPoll {
	public static void main(String[] args) {
		//�ӳ�3��
		//test1();
		//�ӳ�2�룬ÿ3��ִ��һ��
		test2();
	}
	
	/**
	 * �ӳ�3��ִ��.
	 */
	public static void test1(){
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
		scheduledThreadPool.schedule(new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.print("�ӳ�3��");
			}
			
		}, 3, TimeUnit.SECONDS);
	}
	
	/**
	 * �ӳ�2��ִ�У�ÿ����ִ��һ��
	 */
	public static void test2(){
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
		scheduledThreadPool.scheduleAtFixedRate(new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("�״��ӳ�2�룬ÿ1��ִ��һ��");
				System.out.println(Thread.currentThread());
			}
			
		}, 2,3, TimeUnit.SECONDS);
	
	}
	

}
