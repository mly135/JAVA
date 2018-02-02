
public class MemberClass {
	
	private int a = 0;
	
	public static int b = 1;

	public int getA() {
		return a;
	}

	public static int getB() {
		return b;
	}
	
	//���Ե���һ����ĳ�Ա����
	class Test{
		@SuppressWarnings("static-access")
		public void test(){
			int b = 2;
			//�����ⲿ�෽��
			System.out.println("�����ⲿ�෽��"+getB());
			//����˽�з���
			System.out.println("�����ⲿ˽�з���"+a);
			//�ڲ����ԻḲ���ⲿ����
			System.out.println("�ڲ����ԻḲ���ⲿ����"+b);
			//�ⲿ��.this.��Ա���� ���ʱ������ⲿ�����Ժͷ���
			System.out.println("�ⲿ��.this.��Ա����"+MemberClass.this.b);
		}
		
	}
	//�ⲿ����Ҫ��λ�ڲ��಻��������������Ҫ����ͨ�����ﴴ������
	public Test getTest(){
		return  new Test();
	}
	
	public static void main(String[] args) {
		
		//�����Լ����ڲ���
		MemberClass member =new MemberClass();
		Test test = member.getTest();
		test.test();
		
		
		//������������ڲ���
		//��ʽһ
		Outter outter = new Outter();
		Outter.Inner inner = outter.new Inner();
		//��ʽ��
		Outter.Inner inner1 = outter.getInnerInstance();
		
	}
	
}

//�ڲ���Ҳ���ڷ���Ȩ��
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

