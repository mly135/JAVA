package test.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.junit.Test;

/**
 * 
 * <p>Title: TestInputOutuptStream</p>
 * <p>Description: �ֽ���������</p>
 * <p>Company: ����������Ϣ�������޹�˾</p> 
 * @author mengly
 * @date 2017-8-15 ����10:55:26
 */
public class TestInputOutuptStream {
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
	 * 2.�ֽ�����������ƵͼƬ֮������ļ��������ı����ܻ�����,��Ч�ʵ�
	 */
	@Test
	public void test() throws Exception{
		long start = System.currentTimeMillis();
		File inptuFile = FileUtils.getInputWmvFile();
		File outputFile  = FileUtils.getOutputWmvFile();
		FileInputStream input = new FileInputStream(inptuFile);
		FileOutputStream out = new FileOutputStream(outputFile);
		int a;
		//read() ����ÿ�ζ�ȡһ���ַ���ÿ������ռ�����ַ����������Ļ�����������
		/*while((a =input.read()) != -1){
			System.out.print(a);
			//System.out.print((char)a);
			out.write(a);
		}*/
		//���������ж�ȡһ���������ֽڣ�������洢�ڻ��������� b �С� 
		byte b [] = new byte[100];
		while((a = input.read(b)) != -1){
			out.write(b, 0, a);
			/*for (int i = 0; i < a; i++) {
				System.out.println((char)b[i]);
			}*/
		}
		//�ر��ļ���
		out.close();
		input.close();
		
		long end = System.currentTimeMillis();
		System.out.println("");
		System.out.println("ִ��ʱ��Ϊ��"+(end - start));//ִ��ʱ��Ϊ:5776
	}

}
