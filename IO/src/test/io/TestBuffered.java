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
 * <p>Description: 缓冲流测试类</p>
 * <p>Company: 北京华宇信息技术有限公司</p> 
 * @author mengly
 * @date 2017-8-15 上午10:56:07
 */
public class TestBuffered {
	
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
	
	//文件复制，使用字节流和使用处理流
	@Test
	public void testZjlCopy() throws IOException{
		
		long start = System.currentTimeMillis();
		//创建文件
		File inptuFile = FileUtils.getInputWmvFile();
		File outputFile  = FileUtils.getOutputWmvFile();
		
		//创建节点流，读写文件
		FileInputStream inputStream = new FileInputStream(inptuFile);
		FileOutputStream outStream = new FileOutputStream(outputFile);
		
		//创建缓冲流，为读写加速
		BufferedInputStream bufferInput = new BufferedInputStream(inputStream);
		BufferedOutputStream bufferOutput = new BufferedOutputStream(outStream);
		//一般写法
		byte[] bytes = new byte[100];
		int a;
		while((a = bufferInput.read(bytes)) != -1){
			bufferOutput.write(bytes, 0, a);
			bufferOutput.flush();
		}
		
		//关闭流
		bufferOutput.close();
		bufferInput.close();
		long end = System.currentTimeMillis();
		System.out.println("缓冲流执行时间为"+(end-start)); //缓冲流执行时间为2094
	}
	
	
	//文件复制，使用字符流和使用处理流
		@Test
		public void testZflCopy() throws IOException{
			
			long start = System.currentTimeMillis();
			//创建文件
			File inptuFile = new File("C:\\Users\\mengly\\Desktop\\发布前必须解决问题.txt");
			File outputFile  = new File("C:\\Users\\mengly\\Desktop\\2.txt");
			
			//创建节点流，读写文件
			FileReader reader = new FileReader(inptuFile);
			FileWriter writer = new FileWriter(outputFile);
			
			//创建缓冲流，为读写加速
			BufferedReader bufferReader = new BufferedReader(reader);
			BufferedWriter bufferWriter = new BufferedWriter(writer);
			
			//第一种方式
			/*char[] bytes = new char[2];
			int a;
			while((a = bufferReader.read(bytes)) != -1){
				bufferWriter.write(bytes, 0, a);
				bufferWriter.flush();
			}*/
			
			//第二种方式
			String str;
			while((str = bufferReader.readLine()) != null){
				bufferWriter.write(str+"\n");
				bufferWriter.newLine();
				bufferWriter.flush();
			}
			
			//关闭流
			bufferWriter.close();
			bufferReader.close();
			long end = System.currentTimeMillis();
			System.out.println("缓冲流执行时间为"+(end-start)); //缓冲流执行时间为6
		
		}
}
