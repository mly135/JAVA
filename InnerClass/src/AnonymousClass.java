
public class AnonymousClass {
	public static void main(String[] args) {
		final int a = 0 ;
		AnonymousClass ano = new AnonymousClass();
		ano.test(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				//�����;ֲ��ڲ���ֻ�ܷ���final����
				System.out.println(a);
			}
			
		});
		
	}
	
	public void test(Runnable run){
		System.out.println(11);
		
	}
	

}
