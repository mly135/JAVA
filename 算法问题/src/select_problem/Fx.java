package select_problem;

public class Fx {
	
	/**
	 * @Title: findMax   
	 * @Description: 添加泛型方法，查找最大值
	 * @param arr
	 * @return    设定文件   
	 * @return T    返回类型   
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
	 * 测试泛型方法
	 * @Title: testFindMax   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param     设定文件   
	 * @return void    返回类型   
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
	 * @Description: 完善上边的测试方法
	 * @param @param arr
	 * @param @return    设定文件   
	 * @return T    返回类型   
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

//普通泛型对象
class Test <T>{
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}

