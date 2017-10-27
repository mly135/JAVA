package test.io;

import java.io.IOException;
import java.io.RandomAccessFile;

import org.junit.Test;

public class TestRandomAccessFile {
	
	
	@Test
	public void testRead() throws IOException{
		//创建随机读取对象,文件内容123456789
		RandomAccessFile randowAccess = new RandomAccessFile("randomAccess.txt", "rw");
		//设置指针位置为2,内容从数字3开始
		randowAccess.seek(2);
		//获取指针位置
		System.out.println("指针位置："+randowAccess.getFilePointer());
		
		int a;
		byte b [] = new byte[2];
		while((a = randowAccess.read(b)) != -1){
			
			for (int i = 0; i < a; i++) {
				System.out.println((char)b[i]);
				
			}
			
		//randowAccess.seek(2);
			
		}
		//关闭文件流
		randowAccess.close();
	}
	
	
	@Test
	public void testWrite() throws IOException{
		//创建随机读取对象,文件内容123456789
		RandomAccessFile randowAccess = new RandomAccessFile("randomAccess1.txt", "rw");
		//设置指针位置为5,内容从数字5开始
		randowAccess.seek(5);
		//获取指针位置
		System.out.println("指针位置："+randowAccess.getFilePointer());
		
		//从第6位开始，覆盖式插入
		randowAccess.write(new byte[5]);
		
		//关闭文件流
		randowAccess.close();
	}

}
