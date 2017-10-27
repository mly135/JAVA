package test.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

/**
 * 
 * <p>Title: TestObjectInputStream</p>
 * <p>Description: 对象流测试类</p>
 * <p>Company: 北京华宇信息技术有限公司</p> 
 * @author mengly
 * @date 2017-8-15 上午10:46:06
 */
public class TestObjectInputStream {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//定义文件
		File file = new File("C:\\Users\\mengly\\Desktop\\aaa.txt");
		//创建输出流对象
		OutputStream out = new FileOutputStream(file);
		//创建对象输出流
		ObjectOutputStream objectOut = new ObjectOutputStream(out);
		//写入对象
		Test test = new Test();
		test.b = 3;
		objectOut.writeObject(test);
		test.b = 4;
		
		//创建输入流对象
		InputStream input = new FileInputStream(file);
		//创建对象输入流
		ObjectInputStream objectInput = new ObjectInputStream(input);
		//读取对象
		Test testRead = (Test)objectInput.readObject();
		System.out.println(testRead);
		System.out.println(testRead.b);
	}
}

/**
 * 
 * <p>Title: Test</p>
 * <p>Description: Test对象</p>
 * <p>Company: 北京华宇信息技术有限公司</p> 
 * @author mengly
 * @date 2017-8-15 上午10:44:47
 */
class Test implements Serializable{
	private static final long serialVersionUID = 1L;

	public static int a = 1;
	
	public int b = 2;
}
