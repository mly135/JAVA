package test.io;

import java.io.IOException;
import java.io.RandomAccessFile;

import org.junit.Test;

public class TestRandomAccessFile {
	
	
	@Test
	public void testRead() throws IOException{
		//���������ȡ����,�ļ�����123456789
		RandomAccessFile randowAccess = new RandomAccessFile("randomAccess.txt", "rw");
		//����ָ��λ��Ϊ2,���ݴ�����3��ʼ
		randowAccess.seek(2);
		//��ȡָ��λ��
		System.out.println("ָ��λ�ã�"+randowAccess.getFilePointer());
		
		int a;
		byte b [] = new byte[2];
		while((a = randowAccess.read(b)) != -1){
			
			for (int i = 0; i < a; i++) {
				System.out.println((char)b[i]);
				
			}
			
		//randowAccess.seek(2);
			
		}
		//�ر��ļ���
		randowAccess.close();
	}
	
	
	@Test
	public void testWrite() throws IOException{
		//���������ȡ����,�ļ�����123456789
		RandomAccessFile randowAccess = new RandomAccessFile("randomAccess1.txt", "rw");
		//����ָ��λ��Ϊ5,���ݴ�����5��ʼ
		randowAccess.seek(5);
		//��ȡָ��λ��
		System.out.println("ָ��λ�ã�"+randowAccess.getFilePointer());
		
		//�ӵ�6λ��ʼ������ʽ����
		randowAccess.write(new byte[5]);
		
		//�ر��ļ���
		randowAccess.close();
	}

}
