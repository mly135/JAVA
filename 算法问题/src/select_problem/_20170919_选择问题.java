package select_problem;


/*
 * ѡ�����⣺N������Ҫȥ���е�K=7�����ֵ
 * 
 * 1.ð������
 * 2.����ǰK�����ݣ���������ȥ�Ƚ�
 * 
 */

public class _20170919_ѡ������ {

	int k = 1;
	
	
	/**
	 * @Title: test1   
	 * @Description: ð������ʵ��ѡ������
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
		//��7������ݣ��ǵ�6λ
		System.out.println(arrayC[k-1]);
		
	}
	
	@org.junit.Test
	public void test2() {
		int temp;
		// Ŀ������
		int[] arrayA = new int[k];

		// ��������
		int[] arrayC = new int[] { 1, 2, 4, 3, 10, 9, 8, 7, 6, 5 };
		// �ȶ���ǰk=7������
		for (int i = 0; i < arrayA.length; i++) {
			arrayA[i] = arrayC[i];
		}
		
		//����ǰk��Ԫ�أ����մ�С�����ʽ
		for (int i = 0; i < arrayA.length; i++) {
			for (int j = 0; j < arrayA.length-1-i; j++) {
				if(arrayA[j]>arrayA[j+1]){
					temp = arrayA[j];
					arrayA[j] = arrayA[j+1];
					arrayA[j+1] = temp;
				}
			}
		}
		
		//����ȥ���ֵ
		for (int i = k; i < arrayC.length; i++) {
			for (int j = 0; j < arrayA.length; j++) {
				//�����������
				if(arrayC[i] < arrayA[j]){
					//���������jλ������ƶ�
					for (int k = arrayA.length-1; k > j ; k--) {
						arrayA[k] = arrayA[k-1];
					}
					//jλ�ø�ֵΪ arrayC[i]
					arrayA[j] = arrayC[i];
					break;
				}
			}
		}
		System.out.println(arrayA[k-1] );

	}

}
