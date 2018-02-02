package test;

import java.lang.reflect.Field;

/**
 * <p>Title: 注释处理器</p>
 * <p>Description: </p>
 * <p>Company: 北京华宇信息技术有限公司</p> 
 * @author mengly
 * @date 2018-1-3 下午2:12:33
 */

public class Apple {
	
	@FruitName("Apple")
	private String appleName;
	
	@FruitProvider(id=1,name="陕西红富士集团",address="陕西省西安市延安路89号红富士大厦")
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
                System.out.println("水果名称："+fruitName.value());

			}
			
			
			if(field.isAnnotationPresent(FruitProvider.class)){
                FruitProvider fruitProvider= (FruitProvider) field.getAnnotation(FruitProvider.class);
                String strFruitProvicer=" 供应商编号："+fruitProvider.id()+" 供应商名称："+fruitProvider.name()+" 供应商地址："+fruitProvider.address();
                System.out.println("供应商："+strFruitProvicer);
            }

		}
		
		
		
	}
	
}



