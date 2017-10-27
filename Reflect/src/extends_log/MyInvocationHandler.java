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
		System.out.println(".....开始记录日志.....");
		method.invoke(target, args);
		System.out.println(".....记录日志结束记录日志.....");
		return null;
	}

}
