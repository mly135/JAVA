package ԭ��ģʽ;

public class Test implements Cloneable{
	
	public static void main(String[] args) {
		A aa = new A();
		
		aa.setIds("123");
		aa.setName("mly");
		
		try {
			A bb = (A)aa.clone();
			
			System.out.println(bb.getIds());
			System.out.println(bb.getName());
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

class A implements Cloneable{

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	String ids;
	
	String name;

	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
