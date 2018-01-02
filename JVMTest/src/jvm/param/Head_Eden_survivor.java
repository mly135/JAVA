package jvm.param;

public class Head_Eden_survivor {
	
	private static final int _1Mb = 1024*1024;
	
	public static void testAllocation(){
		byte[] allocation1, allocation2, allocation3, allocation4;
		
		allocation1 = new byte[2*_1Mb];
		allocation2 = new byte[2*_1Mb];
		allocation3 = new byte[2*_1Mb];
		allocation4 = new byte[4*_1Mb];
	}
	public static void main(String[] args) {
		
		testAllocation();
		
	}

}
