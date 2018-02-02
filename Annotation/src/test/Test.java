package test;

public class Test {
	public static void main(String[] args) {
		String a = new String("1")+new String("1");
		System.out.println(a);
		a.intern();
		String b = "11";
		System.out.println(a == b);
	}

}
