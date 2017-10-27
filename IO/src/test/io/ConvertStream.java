package test.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import org.junit.Test;

/**
 * 
 * <p>Title: ConvertStream</p>
 * <p>Description: ת����������</p>
 * <p>Company: ����������Ϣ�������޹�˾</p> 
 * @author mengly
 * @date 2017-8-15 ����10:55:42
 */
public class ConvertStream {
	
	/**
	 * ת����������
	 * InputStreamReader  �ֽ���ת��Ϊ�ַ�  ����
	 * OutputStreamWriter �ַ�ת��Ϊ�ֽ���  ����
	 * 
	 * @throws IOException 
	 * 
	 */
	@Test
	public void test() throws IOException{
		
		// ---����---
		File inptuFile = new File("C:\\Users\\mengly\\Desktop\\bbb.txt");
		//����������
		FileInputStream input = new FileInputStream(inptuFile);
		//����ת��������,��Reader������,������ӱ����ʽ
		InputStreamReader inputReader = new InputStreamReader(input,"utf-8");
		
		
		// --- ����---
		File outputFile  = new File("C:\\Users\\mengly\\Desktop\\3.txt");
		//���������
		FileOutputStream output = new FileOutputStream(outputFile);
		//����ת�������
		OutputStreamWriter outWriter = new OutputStreamWriter(output, "utf-8");
		
		//ʹ�ô�����
		BufferedReader reader = new BufferedReader(inputReader);
		BufferedWriter writer = new BufferedWriter(outWriter);
		String str;
		while((str = reader.readLine()) != null){
			writer.write(str);
			writer.newLine();
			writer.flush();
		}
		
		reader.close();
		writer.close();
		
	}
	
	/**
	 * ��׼����������
	 * 
	 * System.in 
	 * System.out
	 * @throws IOException 
	 * 
	 */
	@Test
	public void doWork() throws IOException{
		//������׼��������
		InputStream inputStream = System.in;
		//ʹ��ת����
		InputStreamReader reader = new InputStreamReader(inputStream,"GBK");
		
		//ʹ�ô�����
		BufferedReader rea = new BufferedReader(reader);
		
		while(true){
			System.out.println("�������ַ�����");
			String str = rea.readLine();
			if(str.equalsIgnoreCase("exit")){
				return;
			}else{
				System.out.println(str.toUpperCase());
			}
		}
	}

}
