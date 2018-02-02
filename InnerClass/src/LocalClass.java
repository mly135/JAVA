
public class LocalClass {
	
	public int test(){
		return 0;
		
	}
	public static void main(String[] args) {
		Test test = new Test();
		LocalClass cla = test.getLocalClass();
		//父类调用的是被局部内部类重写的方法
		System.out.println(cla.test());
	}

}


class Test{
	public Test(){
		
	}
	
	public LocalClass getLocalClass(){
		class Test1 extends LocalClass{
			public int age = 1;
			
			//重写父类方法
			public int test(){
				return age;
			}
		}
		
		return new Test1();
	}
}