package java8;

import java.util.Arrays;
import java.util.List;

public class ConsumerDemo {

	public static void main(String[] args) {
		 List<Integer> numbers = Arrays.asList(1,2,3,4,5) ;
		 
		 numbers.stream().forEach(t->System.out.println("print: " + t));

	}

}
