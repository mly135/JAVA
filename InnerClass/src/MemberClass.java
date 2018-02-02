
public class MemberClass {
	
	private int a = 0;
	
	public static int b = 1;

	public int getA() {
		return a;
	}

	public static int getB() {
		return b;
	}
	
	//可以当做一个类的成员来看
	class Test{
		@SuppressWarnings("static-access")
		public void test(){
			int b = 2;
			//调用外部类方法
			System.out.println("调用外部类方法"+getB());
			//调用私有方法
			System.out.println("调用外部私有方法"+a);
			//内部属性会覆盖外部属性
			System.out.println("内部属性会覆盖外部属性"+b);
			//外部类.this.成员变量 访问被覆盖外部类属性和方法
			System.out.println("外部类.this.成员变量"+MemberClass.this.b);
		}
		
	}
	//外部类想要方位内部类不是随心所欲，需要在普通方法里创建传递
	public Test getTest(){
		return  new Test();
	}
	
	public static void main(String[] args) {
		
		//访问自己的内部类
		MemberClass member =new MemberClass();
		Test test = member.getTest();
		test.test();
		
		
		//访问其他类的内部类
		//方式一
		Outter outter = new Outter();
		Outter.Inner inner = outter.new Inner();
		//方式二
		Outter.Inner inner1 = outter.getInnerInstance();
		
	}
	
}

//内部类也存在访问权限
class Outter {
    private Inner inner = null;
    public Outter() {
         
    }
     
    public Inner getInnerInstance() {
        if(inner == null)
            inner = new Inner();
        return inner;
    }
      
    class Inner {
        public Inner() {
             
        }
    }
}

