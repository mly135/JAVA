package fourThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * <p>Title: �����ɻ�����̳߳أ�������������տ����̣߳����޿����̣߳������µ��߳�</p>
 * <p>Description: </p>
 * <p>Company: ����������Ϣ�������޹�˾</p> 
 * @author mengly
 * @date 2018-1-16 ����3:19:29
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
