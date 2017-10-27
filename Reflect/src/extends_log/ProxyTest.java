package extends_log;

import java.lang.reflect.Proxy;

import extends_log.impl.Person;
import extends_log.impl.PersonImpl;

public class ProxyTest {

	public static void main(String[] args) {
		MyInvocationHandler handler = new MyInvocationHandler();
		handler.setTarget(new PersonImpl());

		Person p = (Person) Proxy.newProxyInstance(
				Person.class.getClassLoader(), new Class[] { Person.class },
				handler);
		p.eat("≥‘¡Àœ„Ω∂°£°£°£");
		p.walk();
	}

}
