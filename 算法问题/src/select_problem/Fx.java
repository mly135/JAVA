package select_problem;

public class Fx {
	
	/**
	 * @Title: findMax   
	 * @Description: ��ӷ��ͷ������������ֵ
	 * @param arr
	 * @return    �趨�ļ�   
	 * @return T    ��������   
	 * @throws
	 */
	
	public static <T extends Comparable<T> >T findMax(T[] arr){
		int maxIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].compareTo(arr[maxIndex]) > 0){
				maxIndex = i;
			}
		}
		return arr[maxIndex];
	}
	
	/**
	 * ���Է��ͷ���
	 * @Title: testFindMax   
	 * @Description: TODO(������һ�仰�����������������)   
	 * @param     �趨�ļ�   
	 * @return void    ��������   
	 * @throws
	 */
	@org.junit.Test
	public void testFindMax(){
		Integer[] arr = {1,2,3,45,9};
		System.out.println(findMax(arr));
	}
	
	/**
	 * 
	 * @Title: findMaxWs   
	 * @Description: �����ϱߵĲ��Է���
	 * @param @param arr
	 * @param @return    �趨�ļ�   
	 * @return T    ��������   
	 * @throws
	 */
	public static <T extends Comparable<? super T> >T findMaxWs(T[] arr){
		int maxIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].compareTo(arr[maxIndex]) > 0){
				maxIndex = i;
			}
		}
		return arr[maxIndex];
	}
	
	public static void main(String[] args) {
		Integer number = 10;
		Test<Integer> test = new Test<Integer>();
		test.setValue(number);
		System.out.println(test.getValue());
	}
}

//��ͨ���Ͷ���
class Test <T>{
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}

