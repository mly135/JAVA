package �̳нӿڶ���ʵ�ַ���;

/**
 * <p>Title: MethodEnum</p>
 * <p>Description: </p>
 * <p>Company: ����������Ϣ�������޹�˾</p> 
 * @author mengly
 * @date 2017-8-1 ����2:23:02
 */

public enum MethodEnum implements IEnum{
	
	/**
	 * ö��˵����һ����Ķ��������ҹ̶��������Ƿ��ļ������ǣ���Щ��java�г�Ϊö��
	 * 
	 * ����ʹ����Щ����ö��
	 * public static final int SEASON_SPRING = 1;
	 * public static final int SEASON_SUMMER = 2;
	 * public static final int SEASON_FALL = 3;
	 * public static final int SEASON_WINTER = 4;
	 * 
	 * ȱ�㣺
	 * 1�����Ͳ���ȫ���������
	 * 2�����û�������ռ䣬���׻���
	 * 3��������ң�SEASON_SPRING = 1��ʵ�����ûʲô����
	 * 
	 * java 5�Ժ�����ö�����ͣ�����enum�ؼ�����class interface��λ�൱
	 *  ö�����ԣ�
	 *  1��ö��Ĭ�ϼ̳���java.lang.Enum ������Object�����Բ�����ʾ�̳У�����java.lang.Enum�̳���
	 *  java.lang.Serializable��java.lang.Comparbale
	 *  2��������˽�л�������ʹ��Ĭ�����ͣ�Ĭ�Ͼ���private����ʾ������Ҳֻ����private
	 *  3��ö�ٵ�����ʵ�������ڵ�һ�У������޷�����ʵ����ʵ������Ϊpublic static final
	 *  4��ö����������Ǹ�.class���ļ�
	 * 
	 *  �൱�ڣ�
	 * 	public static fianl MethodEnum MAN = new MethodEnum("1");
	 * 	public static fianl MethodEnum WOMAN = new MethodEnum("2");
	 * 	����������ö�ٶ���final�ģ�����̳��˳��󷽷����ͱ���˳���ö��,��final����
	 */
	
	//������MethodEnum����������
	//�����ӱ��������MethodEnum.class��MethodEnum$1.class��MethodEnum$2.class
	//����Ϊ����ö����
	MAN("1"){
		//ʵ�ּ̳еĳ��󷽷�
		@Override
		public String getTpye() {
			return "123";
		}
		
		//ʵ��ö���Լ��ĳ��󷽷�
		@Override
		public String getMs() {
			return "����";
		}
	},
	WOMAN("2"){
		@Override
		public String getTpye() {
			return "456";
		}

		@Override
		public String getMs() {
			return "Ů��";
		}
	};
	
	//ö�ٵĳ�������Ϊ private final����
	private final String id;
	//���������MAN��WOMAN����������Ĭ��ֵ��������Ҫ��ʾ�����private�Ĵ��в����Ĺ��췽��
	private MethodEnum(String id){
		this.id = id;
	}
	
	
	@Override
	public String getId() {
		return id;
	}
	
	//ö���Դ����󷽷���ö�ٱ���ʵ��
	public abstract String getMs();
	
}
