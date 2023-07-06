package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

//		Predicate<Integer> demo = t->t%2 == 0;
//		System.out.println(demo.test(9));
//		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,5,6,7,87,8,8,9) ; 
		
		//printing only even numbers 
		
		numbers.stream().filter( t->t%2 == 0).forEach(t -> System.out.println("printing only the even nos" + t));
		
		
	};


}

	
	//without lambda expression 
//	@Override
//	public boolean test(Integer t) {
//		 if (t%2 == 0) {
//			 
//			 return true ;
//		 }
//		
//		 else {return false;
//	} 
//		 
//
//	}


