
/**
 * �̳��˽ӿڣ�ʵ�ֵķ�����MAN��WOMANʵ�����ã�û�б��ֳ����⻯
 * 
 *
 */
public enum EnumTest implements IEnum{
	/**��*/
	MAN("1"),
	/**Ů*/
	WOMAN("2");
	
	private final String id;
	
	private EnumTest(String code){
		this.id = code;
	}
	/**
	 * ����Ĵ����ͬ��
	 *  public static final EnumTest MAN = new EnumTest(1);
	 *  public static final EnumTest WOMAN = new EnumTest(2);
	 */

	@Override
	public String getTpye() {
		//��ֵ����
		return "1232323";
	}

	@Override
	public String getId() {
		return id;
	}

}
