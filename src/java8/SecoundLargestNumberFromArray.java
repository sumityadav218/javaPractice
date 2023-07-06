package java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SecoundLargestNumberFromArray {

	
	public static void main (String[]args) {
		
	int[] numbers = {1,2,3,4,8,4,0,76,6};
	int size = 	numbers.length ;
	Arrays.asList(numbers).stream().sorted();
	System.out.println(numbers[size-3]);
	
	
	
	    
	 Arrays.sort(numbers);
	
	System.out.println(numbers);
	
		
		
	}
	
	
}
