package collections;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class PracticeCloudTech {

	
	public static void main(String[] args) {
		  List<Integer> list1 =  Arrays.asList(1,2,3,4,5) ; 
	       List<Integer> list2 =  Arrays.asList(4,6,7,8,2) ; 
	       
	    Stream<Integer> st =    Stream.concat(list1.stream(), list2.stream()) ; 
	 
	    
	    Set<Integer> set =  st.collect(Collectors.toSet()) ; 
	    
Integer x = set.stream().min((o1,o2)->o2-o1).get(); 
	    
	  System.out.println(set) ;   
	}
	
	 
	
}
