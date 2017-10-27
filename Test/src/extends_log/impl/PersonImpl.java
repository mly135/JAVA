package extends_log.impl;

public class PersonImpl implements Person{

	@Override
	public void walk() {
		System.out.println("the preson walk....");
		
	}

	@Override
	public void eat(String something) {
		System.out.println("the person eat "+something);
		
	}

}
