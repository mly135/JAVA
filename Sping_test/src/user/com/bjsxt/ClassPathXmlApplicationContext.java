package user.com.bjsxt;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

public class ClassPathXmlApplicationContext implements BeanFactory{
	
	
	public static void main(String[] args) {
		try {
			new ClassPathXmlApplicationContext();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private Map<String, Object> beans = new HashMap<String, Object>();
	
	@SuppressWarnings("unchecked")
	public ClassPathXmlApplicationContext() throws Exception{
		 SAXBuilder sb=new SAXBuilder();
	     Document doc=sb.build(this.getClass().getClassLoader().getResource("bean.xml")) ;
	     Element root=doc.getRootElement(); //��ȡ��Ԫ��
	     List list=root.getChildren("bean");//ȡ����Ϊbean������Ԫ��
	     for(int i=0;i<list.size();i++){
	        Element element=(Element)list.get(i);
	        String id =element.getAttributeValue("id");//ȡbean��Ԫ��calss������
	        String classs =element.getAttributeValue("class");//ȡbean��Ԫ��calss������
	        System.out.println(id+" "+classs);
	        
	        Object o = Class.forName(classs).newInstance();
	        beans.put(id, o);
	        if(element.getChild("property") != null ){
	        	 for (Element e : (List<Element>)element.getChildren("property")) {
	 	    	  	String name =e.getAttributeValue("name");//ȡbean��Ԫ��calss������
	 		        String bean =e.getAttributeValue("bean");//ȡbean��Ԫ��calss������
	 		        
	 		        Object obj = beans.get(bean);
	 		        String methodName = "set"+name.substring(0,1).toUpperCase()+name.substring(1);
	 		        Method m = o.getClass().getMethod(methodName, obj.getClass().getInterfaces()[0]);
	 		        m.invoke(o, obj);
	 		}
	        }
	     
	}
	}
	
	
	
	
	@Override
	public Object getBean(String name) {
		// TODO Auto-generated method stub
		return beans.get(name);
	}

}
