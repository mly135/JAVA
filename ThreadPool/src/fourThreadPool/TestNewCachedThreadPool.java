package fourThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * <p>Title: 创建可缓存的线程池，如果超长，回收空闲线程，若无可用线程，创建新的线程</p>
 * <p>Description: </p>
 * <p>Company: 北京华宇信息技术有限公司</p> 
 * @author mengly
 * @date 2018-1-16 下午3:19:29
 */
public class TestNewCachedThreadPool {
	public static void main(String[] args) {
		ExecutorService cachePool = Executors.newCachedThreadPool();
		for (int i = 0; i < 100000000; i++) {
			final int index = i; 
			try {
				//Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			cachePool.execute(new Runnable(){
				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println(index+" "+Thread.currentThread());
				}
				
			});
			
		}
	}

}
