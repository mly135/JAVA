package test.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import org.junit.Test;

/**
 * 
 * <p>Title: TestReaderWriter</p>
 * <p>Description: �ַ���������</p>
 * <p>Company: ����������Ϣ�������޹�˾</p> 
 * @author mengly
 * @date 2017-8-15 ����10:54:53
 */
public class TestReaderWriter {
	
	/**
	 * 
	 *       ������                                    �ڵ���                                                 ������(�����ڽڵ���֮��)
	 *                 
	 *   InputStream      FileInputStream(�ֽ���)     BufferedInputStream
	 * 
	 *   OutputStream     FileOutputStream(�ֽ���)    BufferedOutputStream(flush())
	 * 
	 * 	 Reader           FileReader(�ַ���)          BufferedReader
	 * 
	 *   Writer           FileWriter(�ַ���)          BufferedWriter(flush())
	 * 
	 * 
	 */
	
	/**
	 * 1.ÿ��дʱ�ļ����ᱻ����
	 * 2.�ַ����������ı��ļ����޷��������ļ�
	 */
	@Test
	public void testChar() throws Exception{
		long start = System.currentTimeMillis();
		//File����
		File inptuFile = FileUtils.getInputTxtFile();
		File outputFile  = FileUtils.getOutputTxtFile();
		
		FileReader reader = new FileReader(inptuFile);
		FileWriter writer = new FileWriter(outputFile);
		int a;
		//read() ����ÿ�ζ�ȡһ���ַ���ÿ������ռ�����ַ����������Ļ�����������
		while((a =reader.read()) != -1){
			//System.out.print(a);
			System.out.print((char)a);
			writer.write(a);
			//writer.flush();
		}
		//ÿ�������ַ�
	/*	char b [] = new char[2];
		while((a = reader.read(b)) != -1){
			writer.write(b, 0, a);
		}*/
		writer.close();
		reader.close();
		
		long end = System.currentTimeMillis();
		System.out.println("ִ��ʱ��Ϊ��"+(end - start));//ִ��ʱ��Ϊ:7430
	}

}
