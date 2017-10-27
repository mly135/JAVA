package ¼¯ºÏ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Test {
	public Test(int a){
		
	}
	public Test(){
		this(10);
	}
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
			
			ite.remove();
		}
		System.out.println(list.size());
		
		
	}

}
