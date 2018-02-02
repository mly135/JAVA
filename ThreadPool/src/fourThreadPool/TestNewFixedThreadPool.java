package fourThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ���������̳߳أ����ǳ�����󲢷������������̳߳��ڶ����еȴ�
 * <p>Title: TestNewFixedThreadPool</p>
 * <p>Description: </p>
 * <p>Company: ����������Ϣ�������޹�˾</p> 
 * @author mengly
 * @date 2018-1-16 ����3:20:42
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
						//�����index
						System.out.println(index);
						//��Ϊ�����ˣ��ó�cupִ��Ȩ���̳߳ص������̻߳��ǿ���ִ��֮ǰ�����index
						//2���̶߳��������˺�ִ�к�������
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
