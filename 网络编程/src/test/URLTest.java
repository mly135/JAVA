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
	        System.out.println(file);//该URL的资源名
	        String host = uRLTest.getHost();
	        System.out.println(host);//该URL的主机名
	        int port = uRLTest.getPort();
	        System.out.println(port);//该URL的端口
	        String query = uRLTest.getQuery();
	        System.out.println(query);//该URL的查询字符串补分
	        String protocol = uRLTest.getProtocol();
	        System.out.println(protocol);//该URL的协议名
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
	 * @Description: IP地址对象
	 * @param @throws IOException    设定文件   
	 * @return void    返回类型   
	 * @throws
	 */
	@Test
	public void testInetAddress() throws IOException{
		//根据当前主机ip获取IP对象
		InetAddress inet = InetAddress.getLocalHost();
		outPrint(inet);
		//根据域名获取IP对象
		InetAddress inetName = InetAddress.getByName("www.baidu.com");
		outPrint(inetName);
		
		//根据ip字节数据，获取IP对象
		InetAddress inetIp = InetAddress.getByAddress(new byte[]{127,0,0,1});
		outPrint(inetIp);
	}
	
	public void outPrint(InetAddress inet) throws IOException{
		//主机IP地址
		System.out.println(inet.getHostAddress());
		//主机名
		System.out.println(inet.getHostName());
		//获取对应的全限定域名
		System.out.println(inet.getCanonicalHostName());
		//是否可达
		System.out.println(inet.isReachable(5000));
	}

	/**
	 * 
	 * @Title: testDecoder   
	 * @Description: 测试编码
	 * @param @throws UnsupportedEncodingException   
	 * @return void 
	 * @throws
	 */
	@Test
	public void testDecoder() throws UnsupportedEncodingException{
		
		//将特殊字符转换为application/x-www-form-urlencode
		String str = URLEncoder.encode("超超", "GBK");
		System.out.println(str);
		
		//将application/x-www-form-urlencode转换为字符串
		String str1 = URLDecoder.decode(str, "gbk");
		System.out.println(str1);
		
	}
}
