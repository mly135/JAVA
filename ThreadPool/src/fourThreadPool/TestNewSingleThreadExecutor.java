package fourThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ����һ�������߳ǣ�ֻ��Ψһ���߳���ִ�����񣬱�֤����������ָ����˳��fifo lifoִ��
 * <p>Title: TestNewSingleThreadExecutor</p>
 * <p>Description: </p>
 * <p>Company: ����������Ϣ�������޹�˾</p> 
 * @author mengly
 * @date 2018-1-16 ����3:56:14
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
