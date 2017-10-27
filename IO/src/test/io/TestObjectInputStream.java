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
 * <p>Description: ������������</p>
 * <p>Company: ����������Ϣ�������޹�˾</p> 
 * @author mengly
 * @date 2017-8-15 ����10:46:06
 */
public class TestObjectInputStream {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//�����ļ�
		File file = new File("C:\\Users\\mengly\\Desktop\\aaa.txt");
		//�������������
		OutputStream out = new FileOutputStream(file);
		//�������������
		ObjectOutputStream objectOut = new ObjectOutputStream(out);
		//д�����
		Test test = new Test();
		test.b = 3;
		objectOut.writeObject(test);
		test.b = 4;
		
		//��������������
		InputStream input = new FileInputStream(file);
		//��������������
		ObjectInputStream objectInput = new ObjectInputStream(input);
		//��ȡ����
		Test testRead = (Test)objectInput.readObject();
		System.out.println(testRead);
		System.out.println(testRead.b);
	}
}

/**
 * 
 * <p>Title: Test</p>
 * <p>Description: Test����</p>
 * <p>Company: ����������Ϣ�������޹�˾</p> 
 * @author mengly
 * @date 2017-8-15 ����10:44:47
 */
class Test implements Serializable{
	private static final long serialVersionUID = 1L;

	public static int a = 1;
	
	public int b = 2;
}
