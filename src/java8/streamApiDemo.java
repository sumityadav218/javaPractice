package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//intermediate opertaion
//map
//filter
//sorted

//terminated Opertion
//for each 
//collect


public class streamApiDemo {
	
	public static void main (String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,9,5,6);
		
		
		int max = numbers.stream().max((x,y) -> x-y).get() ;
		System.out.println(max);
		
	
		
			numbers.stream().filter(c->c%2==0).forEach(System.out :: println);	
	
	}		
	

	
}
