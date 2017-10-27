import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;


public class Test {
	
	public static void main(String[] args) {
		ClassLoader systemLoader = ClassLoader.getSystemClassLoader();
		System.out.println(systemLoader);
		
		try {
			Enumeration<URL>  a   = systemLoader.getResources("");
			
			while(a.hasMoreElements()){
				System.out.println(a.nextElement());
			}
			ClassLoader extClassLoader= systemLoader.getParent();
			System.out.println(extClassLoader);
			System.out.println(System.getProperty("java.ext.dirs"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
