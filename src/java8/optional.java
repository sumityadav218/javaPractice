package java8;

import java.util.Optional;

public class optional {

	public static void main(String[] args) {
	
		String str = "sumit"  ;
		
		Optional <String> opt = Optional.ofNullable(str) ;  
		
		
		System.out.println(opt.orElse("default"));
	
		
		if (opt.isPresent()) {
		
		System.out.println("value is present and the value is : " + opt.get());
	}
	else {
		
	//	System.out.println(opt.orElse("default"));
		System.out.println("value is not present");

	}
	}

}
