package java8;

public class LambdaExpression {

	public static void main(String[] args) {
		
//		Perimeter peri =  new Perimeter() {
//			
//			@Override
//			public	 void  perimeter(int a, int b) {
//			return a*b ; 
////				System.out.println( a*b ); 
//			}
//		};	
//		
		
		
		Perimeter p = (x , y) -> {
			
			System.out.println(x+y);
		} ;
		
		p.perimeter(2, 4);
		
	}

}
