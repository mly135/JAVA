public class Test {
	public static void main(String[] args) {
		System.out.println(EnumTest.MAN.getId());
		System.out.println(EnumTest.MAN.getTpye());
		
		System.out.println(SingletonEnum.TEST.getInstance() == SingletonEnum.TEST.getInstance());
		
		//����ö�ٶ��󣬲���new,ֻ��ʹ�����ⷽ����MAN֮�༴��ö�ٵ�ʵ������ƽ������ʵ����ͬ
		System.out.println(Enum.valueOf(EnumTest.class, "MAN").getId());
	}

}
