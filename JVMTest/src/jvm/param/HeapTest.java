package jvm.param;

import java.util.ArrayList;
import java.util.List;

/**
 * ���ڴ�����
 * -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * <p>Title: HeapTest</p>
 * <p>Description: </p>
 * <p>Company: ����������Ϣ�������޹�˾</p> 
 * @author mengly
 * @date 2017-12-5 ����3:38:09
 */
public class HeapTest {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		while(true){
			list.add(new Object());
		}
		
	}

}
