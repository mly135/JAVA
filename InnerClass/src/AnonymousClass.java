
public class AnonymousClass {
	public static void main(String[] args) {
		final int a = 0 ;
		AnonymousClass ano = new AnonymousClass();
		ano.test(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				//匿名和局部内部类只能方法final对象
				System.out.println(a);
			}
			
		});
		
	}
	
	public void test(Runnable run){
		System.out.println(11);
		
	}
	

}
