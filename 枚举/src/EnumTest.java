
/**
 * 继承了接口，实现的方法，MAN和WOMAN实例公用，没有表现出特殊化
 * 
 *
 */
public enum EnumTest implements IEnum{
	/**男*/
	MAN("1"),
	/**女*/
	WOMAN("2");
	
	private final String id;
	
	private EnumTest(String code){
		this.id = code;
	}
	/**
	 * 上面的代码等同于
	 *  public static final EnumTest MAN = new EnumTest(1);
	 *  public static final EnumTest WOMAN = new EnumTest(2);
	 */

	@Override
	public String getTpye() {
		//单值代码
		return "1232323";
	}

	@Override
	public String getId() {
		return id;
	}

}
