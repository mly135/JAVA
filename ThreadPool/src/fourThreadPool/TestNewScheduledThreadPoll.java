package fourThreadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 创建定长线程池，支持定时及周期性执行任务.
 * <p>Title: TestNewScheduledThreadPoll</p>
 * <p>Description: </p>
 * <p>Company: 北京华宇信息技术有限公司</p> 
 * @author mengly
 * @date 2018-1-16 下午3:23:01
 */
public class TestNewScheduledThreadPoll {
	public static void main(String[] args) {
		//延迟3秒
		//test1();
		//延迟2秒，每3秒执行一次
		test2();
	}
	
	/**
	 * 延迟3秒执行.
	 */
	public static void test1(){
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
		scheduledThreadPool.schedule(new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.print("延迟3秒");
			}
			
		}, 3, TimeUnit.SECONDS);
	}
	
	/**
	 * 延迟2秒执行，每三秒执行一次
	 */
	public static void test2(){
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
		scheduledThreadPool.scheduleAtFixedRate(new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("首次延迟2秒，每1秒执行一次");
				System.out.println(Thread.currentThread());
			}
			
		}, 2,3, TimeUnit.SECONDS);
	
	}
	

}
