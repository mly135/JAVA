import java.util.ArrayList;
import java.util.List;



public class Test {
	
	public static void main(String[] args) {
		
		
		List<String> a = new ArrayList<String>();
		
		for (int i = 0; i < 100; i++) {
			a.add(i+"");
		}
		
		averageAssign(a, 30);
	}
	
	
	 /**
     * list分段
     * @param source
     * @param n
     * @return
     */
    public static <T> List<List<T>> averageAssign(List<T> source,int n){  
        List<List<T>> result=new ArrayList<List<T>>();  
        int remaider=source.size()%n;  //(先计算出余数)  
        int number=source.size()/n;  //然后是商 
            for(int i=0;i<number;i++){  
                List<T> value=null;  
                if(i != number-1){  
                    value=source.subList(i*n, (i+1)*n);  
                }else{
             	   value=source.subList(i*n, (i+1)*n + remaider);  
                }
                result.add(value);  
            }   
      
        return result;  
    } 

}
