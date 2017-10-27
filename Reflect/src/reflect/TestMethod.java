package reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@SuppressWarnings("unchencked")
public class TestMethod {
	
	private TestMethod(){
		
	}
	
	public TestMethod(String params){
	
	}
	
	public void info(){
		
	}
	
	public void info(int a){
		System.out.println("执行了info");
	}
	
	public int a = 123;
	
	class Inner{
		
	}
	
	
	public static void main(String[] args) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {
		
		Class<TestMethod> test = TestMethod.class;
		//全部构造方法
		Constructor<?>[] allConstrucotr = test.getDeclaredConstructors();
		
		for (Constructor<?> constructor : allConstrucotr) {
			System.out.println(constructor);
		}
		
		//获取public构造方法
		Constructor<?>[] Pubconstrucotr = test.getConstructors();
		
		for (Constructor<?> pub : Pubconstrucotr) {
			System.out.println(pub);
		}
		
		//获取类下所有public方法
		Method[] method = test.getMethods();
		
		for(Method meth : method){
			System.out.println(meth);
		}
		
		
		Method meth = test.getMethod("info", int.class);
		meth.invoke(test.newInstance(), 111);
		System.out.println(meth);
		
		//得到注释
		Annotation[] anno = test.getAnnotations();
		for(Annotation aaa : anno){
			System.out.println(aaa);
		}
		
	}

}
