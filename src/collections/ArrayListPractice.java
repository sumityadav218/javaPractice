package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice {
	
	public static void main(String[] args) {
		
//		ArrayList<String> studentsName =  new ArrayList<>(); 
//		studentsName.add("sumit") ;
//		 
		int[] x = {1,2,3,4,4 } ; 
	
		List<int[]> y = Arrays.asList(x) ;
		
		List<int[]> ds =  Arrays.asList(x) ;
		
		
		
		List<Integer> numbers = new ArrayList<>() ;
		numbers.add(1); 
		numbers.add(2) ; 
		numbers.add(3) ; 
		numbers.add(4) ; 
		numbers.add(5) ; 
		numbers.add(6) ; 
		numbers.add(7) ; 
		System.out.println(numbers);
		numbers.add(2, 58);
		
		System.out.println(numbers);
		; 
		

	}
	
	
}
