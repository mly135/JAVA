package dxc.text;

public class TestMethod {
    public static synchronized void method1(){
        System.out.println("Method 1 start");
        try {
            System.out.println("Method 1 execute");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Method 1 end");
    }

    public static synchronized void method2(){
        System.out.println("Method 2 start");
        try {
            System.out.println("Method 2 execute");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Method 2 end");
    }

    public static void main(String[] args) {
        final TestMethod testMethod = new TestMethod();
        final TestMethod test1 = new TestMethod();

        new Thread(new Runnable() {
            @Override
            public void run() {
                testMethod.method1();
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