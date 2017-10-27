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
	     Element root=doc.getRootElement(); //获取根元素
	     List list=root.getChildren("bean");//取名字为bean的所有元素
	     for(int i=0;i<list.size();i++){
	        Element element=(Element)list.get(i);
	        String id =element.getAttributeValue("id");//取bean子元素calss的内容
	        String classs =element.getAttributeValue("class");//取bean子元素calss的内容
	        System.out.println(id+" "+classs);
	        
	        Object o = Class.forName(classs).newInstance();
	        beans.put(id, o);
	        if(element.getChild("property") != null ){
	        	 for (Element e : (List<Element>)element.getChildren("property")) {
	 	    	  	String name =e.getAttributeValue("name");//取bean子元素calss的内容
	 		        String bean =e.getAttributeValue("bean");//取bean子元素calss的内容
	 		        
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
