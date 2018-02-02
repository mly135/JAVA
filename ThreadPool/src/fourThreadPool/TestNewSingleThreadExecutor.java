package fourThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 创建一个单例线城，只用唯一的线城来执行任务，保证所有任务按照指定的顺序fifo lifo执行
 * <p>Title: TestNewSingleThreadExecutor</p>
 * <p>Description: </p>
 * <p>Company: 北京华宇信息技术有限公司</p> 
 * @author mengly
 * @date 2018-1-16 下午3:56:14
 */
public class TestNewSingleThreadExecutor {
	public static void main(String[] args) {
		ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 10; i++) {
			 final int index = i;  
			   singleThreadExecutor.execute(new Runnable() {  
			    public void run() {  
			      System.out.println(index);
			      System.out.println(Thread.currentThread());  
			    }  
			   }); 
			   
		}
		
	}

}
