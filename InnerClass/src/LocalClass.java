
public class LocalClass {
	
	public int test(){
		return 0;
		
	}
	public static void main(String[] args) {
		Test test = new Test();
		LocalClass cla = test.getLocalClass();
		//������õ��Ǳ��ֲ��ڲ�����д�ķ���
		System.out.println(cla.test());
	}

}


class Test{
	public Test(){
		
	}
	
	public LocalClass getLocalClass(){
		class Test1 extends LocalClass{
			public int age = 1;
			
			//��д���෽��
			public int test(){
				return age;
			}
		}
		
		return new Test1();
	}
}