package extends_log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
	
	private Object target ;

	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//PersonImpl Person = new PersonImpl();
		System.out.println(".....��ʼ��¼��־.....");
		method.invoke(target, args);
		System.out.println(".....��¼��־������¼��־.....");
		return null;
	}

}
