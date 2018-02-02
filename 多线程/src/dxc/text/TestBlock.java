package dxc.text;

public class TestBlock {
    public static void method1(){
        
        try {
             synchronized (TestBlock.class) {
            	System.out.println("Method 1 start");
            	//System.out.println(this);
                System.out.println("Method 1 execute");
                Thread.sleep(3000);
                System.out.println("Method 1 end");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       
    }

    public static void method2(){
       
        try {
            synchronized (TestBlock.class) {
            	 System.out.println("Method 2 start");
            	//System.out.println(this);
                System.out.println("Method 2 execute");
                Thread.sleep(1000);
                System.out.println("Method 2 end");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       
    }

    public static void main(String[] args) {
        final TestBlock test = new TestBlock();
        final TestBlock test1 = new TestBlock();

        new Thread(new Runnable() {
            @Override
            public void run() {
                test.method1();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
            	test1.method2();
            }
        }).start();
    }
}
