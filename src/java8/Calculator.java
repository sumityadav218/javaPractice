package java8;


interface Operations {
	//functional interface can have only one abstract method . 
	int sum (int a,int b);

}

public class Calculator {


	public static void main(String[] args) {


		Operations operation = (a ,b) -> a+b ;

		System.out.println(operation.sum(2, 5));
	}

}
