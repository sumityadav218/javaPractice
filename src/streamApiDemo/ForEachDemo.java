package streamApiDemo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("sumit" ,"Renu" ,"Amit" ,"Charu") ;

		list.stream().forEach(t->System.out.println(t));

		Map<Integer,String> mapping = new HashMap<>() ;
		mapping.put(1, "sumit") ; 
		mapping.put(2, "renu") ; 
	
	//mapping.forEach((key,value)->System.out.println("key:" + key + "value:" + value));
	mapping.entrySet().stream().forEach(t->System.out.println(t));
	
	}


}
