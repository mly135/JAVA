package test;

public class Test {
	public static void main(String[] args){
        // ��ʼ��Bean1
 		Test test = new Test();
 		Test.Bean1 bean1 =test.new Bean1();
        bean1.I++;
        // ��ʼ��Bean2
        Test.Bean2 bean2 = new Test.Bean2();
        bean2.J++;
        //��ʼ��Bean3
        Bean bean = new Bean();
        Bean.Bean3 bean3 = bean.new Bean3();
        bean3.k++;
 }
 class Bean1{
        public int I = 0;
 }

 static class Bean2{
        public int J = 0;
 }
}


class Bean{
   class Bean3{
          public int k = 0;
   }
}
