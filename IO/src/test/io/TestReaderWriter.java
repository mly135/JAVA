package test.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import org.junit.Test;

/**
 * 
 * <p>Title: TestReaderWriter</p>
 * <p>Description: 字符流测试类</p>
 * <p>Company: 北京华宇信息技术有限公司</p> 
 * @author mengly
 * @date 2017-8-15 上午10:54:53
 */
public class TestReaderWriter {
	
	/**
	 * 
	 *       抽象类                                    节点流                                                 处理流(作用于节点流之上)
	 *                 
	 *   InputStream      FileInputStream(字节流)     BufferedInputStream
	 * 
	 *   OutputStream     FileOutputStream(字节流)    BufferedOutputStream(flush())
	 * 
	 * 	 Reader           FileReader(字符流)          BufferedReader
	 * 
	 *   Writer           FileWriter(字符流)          BufferedWriter(flush())
	 * 
	 * 
	 */
	
	/**
	 * 1.每次写时文件都会被覆盖
	 * 2.字符流，处理文本文件，无法处理流文件
	 */
	@Test
	public void testChar() throws Exception{
		long start = System.currentTimeMillis();
		//File对象
		File inptuFile = FileUtils.getInputTxtFile();
		File outputFile  = FileUtils.getOutputTxtFile();
		
		FileReader reader = new FileReader(inptuFile);
		FileWriter writer = new FileWriter(outputFile);
		int a;
		//read() 方法每次读取一个字符，每个中文占两个字符，存在中文会有乱码问题
		while((a =reader.read()) != -1){
			//System.out.print(a);
			System.out.print((char)a);
			writer.write(a);
			//writer.flush();
		}
		//每次两个字符
	/*	char b [] = new char[2];
		while((a = reader.read(b)) != -1){
			writer.write(b, 0, a);
		}*/
		writer.close();
		reader.close();
		
		long end = System.currentTimeMillis();
		System.out.println("执行时间为："+(end - start));//执行时间为:7430
	}

}
