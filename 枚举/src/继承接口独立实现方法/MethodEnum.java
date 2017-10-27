package 继承接口独立实现方法;

/**
 * <p>Title: MethodEnum</p>
 * <p>Description: </p>
 * <p>Company: 北京华宇信息技术有限公司</p> 
 * @author mengly
 * @date 2017-8-1 下午2:23:02
 */

public enum MethodEnum implements IEnum{
	
	/**
	 * 枚举说明：一个类的对象有限且固定，例如是否、四季和行星，这些在java中成为枚举
	 * 
	 * 早起使用这些代表枚举
	 * public static final int SEASON_SPRING = 1;
	 * public static final int SEASON_SUMMER = 2;
	 * public static final int SEASON_FALL = 3;
	 * public static final int SEASON_WINTER = 4;
	 * 
	 * 缺点：
	 * 1、类型不安全，可以相加
	 * 2、如果没有命名空间，容易混淆
	 * 3、含义混乱，SEASON_SPRING = 1，实际这个没什么关联
	 * 
	 * java 5以后引入枚举类型，新增enum关键字与class interface地位相当
	 *  枚举特性：
	 *  1、枚举默认继承了java.lang.Enum 而不是Object，所以不能显示继承，其中java.lang.Enum继承了
	 *  java.lang.Serializable和java.lang.Comparbale
	 *  2、构造器私有化，可以使用默认类型，默认就是private，显示声明的也只能是private
	 *  3、枚举的所有实例必须在第一列，否则无法生成实例，实例类型为public static final
	 *  4、枚举类编译后就是个.class的文件
	 * 
	 *  相当于，
	 * 	public static fianl MethodEnum MAN = new MethodEnum("1");
	 * 	public static fianl MethodEnum WOMAN = new MethodEnum("2");
	 * 	并不是所有枚举都是final的，如果继承了抽象方法，就变成了抽象枚举,非final类型
	 */
	
	//创建了MethodEnum的匿名子类
	//该例子编译后会产生MethodEnum.class、MethodEnum$1.class和MethodEnum$2.class
	//并且为抽象枚举类
	MAN("1"){
		//实现继承的抽象方法
		@Override
		public String getTpye() {
			return "123";
		}
		
		//实现枚举自己的抽象方法
		@Override
		public String getMs() {
			return "男人";
		}
	},
	WOMAN("2"){
		@Override
		public String getTpye() {
			return "456";
		}

		@Override
		public String getMs() {
			return "女人";
		}
	};
	
	//枚举的常量建议为 private final类型
	private final String id;
	//由于上面的MAN和WOMAN对象，设置有默认值，所以需要显示特殊的private的带有参数的构造方法
	private MethodEnum(String id){
		this.id = id;
	}
	
	
	@Override
	public String getId() {
		return id;
	}
	
	//枚举自带抽象方法，枚举必须实现
	public abstract String getMs();
	
}
