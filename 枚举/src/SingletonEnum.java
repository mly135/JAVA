

/**
 * 1.ö����Ĭ�ϼ̳�java.lang.Enum�ࣨʵ����java.lang.Serizlizable 
 * �� java.lang.Comparable�����޷���ʾ�̳�������
 * 2.ʹ��ö�ٶ���ģ��ǳ���Ĭ�϶���final
 * 3.ö�ٵĹ�����Ĭ����private���Σ�Ҳֻ����private����
 * 4.ö�ٵ�����ʵ��������ڵ�һ����ʾ�������޷�����ʵ��������ϵͳ���Զ���� public static final���Σ�������ʾ�Զ����
 */
public enum SingletonEnum {
	TEST;
	
	Test test;
	
	private SingletonEnum(){
		test = new Test();
	}
	
	public Test getInstance(){
		return test;
	}

}
