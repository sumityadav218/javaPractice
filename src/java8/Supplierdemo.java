package java8;

import java.util.Arrays;
import java.util.List;

public class Supplierdemo {

	public static void main(String[] args) {
		 
		List<String> list1=  Arrays.asList("a","b") ;
		System.out.println(	list1.stream().findAny().orElseGet(()->"no value is present") );
	

	}

}
