package test.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.junit.Test;

/**
 * 
 * <p>Title: TestInputOutuptStream</p>
 * <p>Description: 字节流测试类</p>
 * <p>Company: 北京华宇信息技术有限公司</p> 
 * @author mengly
 * @date 2017-8-15 上午10:55:26
 */
public class TestInputOutuptStream {
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
	 * 2.字节流，处理视频图片之类的流文件，处理文本可能会乱码,且效率低
	 */
	@Test
	public void test() throws Exception{
		long start = System.currentTimeMillis();
		File inptuFile = FileUtils.getInputWmvFile();
		File outputFile  = FileUtils.getOutputWmvFile();
		FileInputStream input = new FileInputStream(inptuFile);
		FileOutputStream out = new FileOutputStream(outputFile);
		int a;
		//read() 方法每次读取一个字符，每个中文占两个字符，存在中文会有乱码问题
		/*while((a =input.read()) != -1){
			System.out.print(a);
			//System.out.print((char)a);
			out.write(a);
		}*/
		//从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。 
		byte b [] = new byte[100];
		while((a = input.read(b)) != -1){
			out.write(b, 0, a);
			/*for (int i = 0; i < a; i++) {
				System.out.println((char)b[i]);
			}*/
		}
		//关闭文件流
		out.close();
		input.close();
		
		long end = System.currentTimeMillis();
		System.out.println("");
		System.out.println("执行时间为："+(end - start));//执行时间为:5776
	}

}
