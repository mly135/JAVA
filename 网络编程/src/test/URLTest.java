package test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.net.UnknownHostException;

import org.junit.Test;

public class URLTest {
	
	@Test
	public void test1() throws MalformedURLException{
		 URL uRLTest = new URL("https://i.cnblogs.com/EditPosts.aspx?opt=1");
	        String file = uRLTest.getFile();
	        System.out.println(file);//��URL����Դ��
	        String host = uRLTest.getHost();
	        System.out.println(host);//��URL��������
	        int port = uRLTest.getPort();
	        System.out.println(port);//��URL�Ķ˿�
	        String query = uRLTest.getQuery();
	        System.out.println(query);//��URL�Ĳ�ѯ�ַ�������
	        String protocol = uRLTest.getProtocol();
	        System.out.println(protocol);//��URL��Э����
	} 
	
	@Test
	public void test2() throws IOException{
		 URL url = new URL("https://www.baidu.com");
		 URLConnection conn = (URLConnection) url.openConnection();
		 InputStream input = conn.getInputStream();
		 
		 InputStreamReader reader = new InputStreamReader(input);
		 
		 OutputStream output = new FileOutputStream("C:\\Users\\mengly\\Desktop\\111.txt");
		 
		 OutputStreamWriter writer = new OutputStreamWriter(output);
		 
		 char [] a = new char[100];
		 int b;
		 while((b  =reader.read(a)) != -1){
			 writer.write(a, 0, b);
			 writer.flush();
		 }
		 output.close();
		 input.close();
	}
	
	
	/**
	 * 
	 * @Title: testInetAddress   
	 * @Description: IP��ַ����
	 * @param @throws IOException    �趨�ļ�   
	 * @return void    ��������   
	 * @throws
	 */
	@Test
	public void testInetAddress() throws IOException{
		//���ݵ�ǰ����ip��ȡIP����
		InetAddress inet = InetAddress.getLocalHost();
		outPrint(inet);
		//����������ȡIP����
		InetAddress inetName = InetAddress.getByName("www.baidu.com");
		outPrint(inetName);
		
		//����ip�ֽ����ݣ���ȡIP����
		InetAddress inetIp = InetAddress.getByAddress(new byte[]{127,0,0,1});
		outPrint(inetIp);
	}
	
	public void outPrint(InetAddress inet) throws IOException{
		//����IP��ַ
		System.out.println(inet.getHostAddress());
		//������
		System.out.println(inet.getHostName());
		//��ȡ��Ӧ��ȫ�޶�����
		System.out.println(inet.getCanonicalHostName());
		//�Ƿ�ɴ�
		System.out.println(inet.isReachable(5000));
	}

	/**
	 * 
	 * @Title: testDecoder   
	 * @Description: ���Ա���
	 * @param @throws UnsupportedEncodingException   
	 * @return void 
	 * @throws
	 */
	@Test
	public void testDecoder() throws UnsupportedEncodingException{
		
		//�������ַ�ת��Ϊapplication/x-www-form-urlencode
		String str = URLEncoder.encode("����", "GBK");
		System.out.println(str);
		
		//��application/x-www-form-urlencodeת��Ϊ�ַ���
		String str1 = URLDecoder.decode(str, "gbk");
		System.out.println(str1);
		
	}
}
