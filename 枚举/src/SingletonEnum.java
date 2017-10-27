

/**
 * 1.枚举类默认继承java.lang.Enum类（实现了java.lang.Serizlizable 
 * 和 java.lang.Comparable），无法显示继承其他类
 * 2.使用枚举定义的，非抽象默认都是final
 * 3.枚举的构造器默认是private修饰，也只能是private修饰
 * 4.枚举的所有实例必须放在第一行显示，否则无法产生实例，并且系统会自动添加 public static final修饰，不能显示自动添加
 */
public enum SingletonEnum {
	TEST;
	
	Test test;
	
	private SingletonEnum(){
		test = new Test();
	}
	
	public Test getInstance(){
		return test;
	}

}
