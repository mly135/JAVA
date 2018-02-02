package test;

import java.lang.reflect.Field;

/**
 * <p>Title: ע�ʹ�����</p>
 * <p>Description: </p>
 * <p>Company: ����������Ϣ�������޹�˾</p> 
 * @author mengly
 * @date 2018-1-3 ����2:12:33
 */

public class Apple {
	
	@FruitName("Apple")
	private String appleName;
	
	@FruitProvider(id=1,name="�����츻ʿ����",address="����ʡ�������Ӱ�·89�ź츻ʿ����")
    private String appleProvider;

	public String getAppleName() {
		return appleName;
	}

	public void setAppleName(String appleName) {
		this.appleName = appleName;
	}

	public String getAppleProvider() {
		return appleProvider;
	}

	public void setAppleProvider(String appleProvider) {
		this.appleProvider = appleProvider;
	}
	
	public static void main(String[] args) {
		Field[] fields = Apple.class.getDeclaredFields();
		for (Field field : fields) {
			if(field.isAnnotationPresent(FruitName.class)){
				FruitName fruitName = (FruitName) field.getAnnotation(FruitName.class);
                System.out.println("ˮ�����ƣ�"+fruitName.value());

			}
			
			
			if(field.isAnnotationPresent(FruitProvider.class)){
                FruitProvider fruitProvider= (FruitProvider) field.getAnnotation(FruitProvider.class);
                String strFruitProvicer=" ��Ӧ�̱�ţ�"+fruitProvider.id()+" ��Ӧ�����ƣ�"+fruitProvider.name()+" ��Ӧ�̵�ַ��"+fruitProvider.address();
                System.out.println("��Ӧ�̣�"+strFruitProvicer);
            }

		}
		
		
		
	}
	
}



