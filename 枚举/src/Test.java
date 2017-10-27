public class Test {
	public static void main(String[] args) {
		System.out.println(EnumTest.MAN.getId());
		System.out.println(EnumTest.MAN.getTpye());
		
		System.out.println(SingletonEnum.TEST.getInstance() == SingletonEnum.TEST.getInstance());
		
		//创建枚举对象，不能new,只能使用特殊方法，MAN之类即是枚举的实例，与平常理解的实例不同
		System.out.println(Enum.valueOf(EnumTest.class, "MAN").getId());
	}

}
