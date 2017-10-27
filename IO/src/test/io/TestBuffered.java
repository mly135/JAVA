package test.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

/**
 * <p>Title: TestBuffered</p>
 * <p>Description: ������������</p>
 * <p>Company: ����������Ϣ�������޹�˾</p> 
 * @author mengly
 * @date 2017-8-15 ����10:56:07
 */
public class TestBuffered {
	
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
	
	//�ļ����ƣ�ʹ���ֽ�����ʹ�ô�����
	@Test
	public void testZjlCopy() throws IOException{
		
		long start = System.currentTimeMillis();
		//�����ļ�
		File inptuFile = FileUtils.getInputWmvFile();
		File outputFile  = FileUtils.getOutputWmvFile();
		
		//�����ڵ�������д�ļ�
		FileInputStream inputStream = new FileInputStream(inptuFile);
		FileOutputStream outStream = new FileOutputStream(outputFile);
		
		//������������Ϊ��д����
		BufferedInputStream bufferInput = new BufferedInputStream(inputStream);
		BufferedOutputStream bufferOutput = new BufferedOutputStream(outStream);
		//һ��д��
		byte[] bytes = new byte[100];
		int a;
		while((a = bufferInput.read(bytes)) != -1){
			bufferOutput.write(bytes, 0, a);
			bufferOutput.flush();
		}
		
		//�ر���
		bufferOutput.close();
		bufferInput.close();
		long end = System.currentTimeMillis();
		System.out.println("������ִ��ʱ��Ϊ"+(end-start)); //������ִ��ʱ��Ϊ2094
	}
	
	
	//�ļ����ƣ�ʹ���ַ�����ʹ�ô�����
		@Test
		public void testZflCopy() throws IOException{
			
			long start = System.currentTimeMillis();
			//�����ļ�
			File inptuFile = new File("C:\\Users\\mengly\\Desktop\\����ǰ����������.txt");
			File outputFile  = new File("C:\\Users\\mengly\\Desktop\\2.txt");
			
			//�����ڵ�������д�ļ�
			FileReader reader = new FileReader(inptuFile);
			FileWriter writer = new FileWriter(outputFile);
			
			//������������Ϊ��д����
			BufferedReader bufferReader = new BufferedReader(reader);
			BufferedWriter bufferWriter = new BufferedWriter(writer);
			
			//��һ�ַ�ʽ
			/*char[] bytes = new char[2];
			int a;
			while((a = bufferReader.read(bytes)) != -1){
				bufferWriter.write(bytes, 0, a);
				bufferWriter.flush();
			}*/
			
			//�ڶ��ַ�ʽ
			String str;
			while((str = bufferReader.readLine()) != null){
				bufferWriter.write(str+"\n");
				bufferWriter.newLine();
				bufferWriter.flush();
			}
			
			//�ر���
			bufferWriter.close();
			bufferReader.close();
			long end = System.currentTimeMillis();
			System.out.println("������ִ��ʱ��Ϊ"+(end-start)); //������ִ��ʱ��Ϊ6
		
		}
}
