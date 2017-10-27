package invoke;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, SecurityException, NoSuchMethodException {
		/*Class<?> clazz  = Class.forName("invoke.Invoke");
		Invoke invoke = (Invoke)clazz.newInstance();
		System.out.println(invoke.a);*/
		
		Class<?> clazz  = Class.forName("invoke.Invoke");
		Constructor cons = clazz.getConstructor(Integer.class);
		Invoke invo = (Invoke)cons.newInstance(123456);
		System.out.println(invo.a);
		
	}

}
