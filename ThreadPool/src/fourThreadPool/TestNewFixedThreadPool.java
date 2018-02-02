package fourThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 常见定长线程池，若是超过最大并发数，超出的线程池在队列中等待
 * <p>Title: TestNewFixedThreadPool</p>
 * <p>Description: </p>
 * <p>Company: 北京华宇信息技术有限公司</p> 
 * @author mengly
 * @date 2018-1-16 下午3:20:42
 */
public class TestNewFixedThreadPool {
	public static void main(String[] args) {
		ExecutorService fixedPool = Executors.newFixedThreadPool(2);
		for (int i = 0; i < 10; i++) {
			final int index = i;
			fixedPool.execute(new Runnable(){

				@Override
				public void run() {
					try {
						//先输出index
						System.out.println(index);
						//因为休眠了，让出cup执行权，线程池的其他线程还是可以执行之前的输出index
						//2个线程都休眠醒了后，执行后续过程
						Thread.sleep(2000);
						System.out.println(Thread.currentThread());
					
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
			});
		}
		
	}
	

}
