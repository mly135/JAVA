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
 * <p>Description: 转换流测试类</p>
 * <p>Company: 北京华宇信息技术有限公司</p> 
 * @author mengly
 * @date 2017-8-15 上午10:55:42
 */
public class ConvertStream {
	
	/**
	 * 转换流两个类
	 * InputStreamReader  字节流转换为字符  解码
	 * OutputStreamWriter 字符转换为字节流  编码
	 * 
	 * @throws IOException 
	 * 
	 */
	@Test
	public void test() throws IOException{
		
		// ---解码---
		File inptuFile = new File("C:\\Users\\mengly\\Desktop\\bbb.txt");
		//创建输入流
		FileInputStream input = new FileInputStream(inptuFile);
		//创建转换输入流,是Reader的子类,可以添加编码格式
		InputStreamReader inputReader = new InputStreamReader(input,"utf-8");
		
		
		// --- 编码---
		File outputFile  = new File("C:\\Users\\mengly\\Desktop\\3.txt");
		//创建输出流
		FileOutputStream output = new FileOutputStream(outputFile);
		//创建转换输出流
		OutputStreamWriter outWriter = new OutputStreamWriter(output, "utf-8");
		
		//使用处理流
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
	 * 标准的输入和输出
	 * 
	 * System.in 
	 * System.out
	 * @throws IOException 
	 * 
	 */
	@Test
	public void doWork() throws IOException{
		//创建标准的输入流
		InputStream inputStream = System.in;
		//使用转换流
		InputStreamReader reader = new InputStreamReader(inputStream,"GBK");
		
		//使用处理流
		BufferedReader rea = new BufferedReader(reader);
		
		while(true){
			System.out.println("请输入字符串：");
			String str = rea.readLine();
			if(str.equalsIgnoreCase("exit")){
				return;
			}else{
				System.out.println(str.toUpperCase());
			}
		}
	}

}
