package test;

import java.io.IOException;

import org.jdom.Document;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

public class Test {
	
	public static void main(String[] args) throws JDOMException, IOException {
		
		
		SAXBuilder xml = new SAXBuilder();
		Document doc = xml.build(Test.class.getClassLoader().getResource("corp.xml"));
		
		System.out.println(doc.getRootElement());
		
	}

}
