package select_problem;


/*
 * 选择问题：N个数，要去其中第K=7大的数值
 * 
 * 1.冒泡排序
 * 2.保存前K个数据，后续数据去比较
 * 
 */

public class _20170919_选择问题 {

	int k = 1;
	
	
	/**
	 * @Title: test1   
	 * @Description: 冒泡排序，实现选择问题
	 * @param 
	 * @return void 
	 * @throws
	 */
	@org.junit.Test
	public void test1(){
/*		String arrayA[] = new String[10];
		String arrayB[] = {"10","2"};*/
		int[] arrayC = new int[]{1,2,4,3,10,9,8,7,6,5};
		
		for (int i = 0; i < arrayC.length; i++) {
			for (int j = 0; j < arrayC.length-1-i; j++) {
				if(arrayC[j]>arrayC[j+1]){
					int temp = arrayC[j];
					arrayC[j] = arrayC[j+1];
					arrayC[j+1] = temp;
				}
			}
		}
		//第7大的数据，是第6位
		System.out.println(arrayC[k-1]);
		
	}
	
	@org.junit.Test
	public void test2() {
		int temp;
		// 目标数据
		int[] arrayA = new int[k];

		// 测试数据
		int[] arrayC = new int[] { 1, 2, 4, 3, 10, 9, 8, 7, 6, 5 };
		// 先读入前k=7个数据
		for (int i = 0; i < arrayA.length; i++) {
			arrayA[i] = arrayC[i];
		}
		
		//排序前k个元素，按照从小到大格式
		for (int i = 0; i < arrayA.length; i++) {
			for (int j = 0; j < arrayA.length-1-i; j++) {
				if(arrayA[j]>arrayA[j+1]){
					temp = arrayA[j];
					arrayA[j] = arrayA[j+1];
					arrayA[j+1] = temp;
				}
			}
		}
		
		//挤出去大的值
		for (int i = k; i < arrayC.length; i++) {
			for (int j = 0; j < arrayA.length; j++) {
				//存在这种情况
				if(arrayC[i] < arrayA[j]){
					//整个数组从j位置向后移动
					for (int k = arrayA.length-1; k > j ; k--) {
						arrayA[k] = arrayA[k-1];
					}
					//j位置赋值为 arrayC[i]
					arrayA[j] = arrayC[i];
					break;
				}
			}
		}
		System.out.println(arrayA[k-1] );

	}

}
