package javaInterviewPractice;
import java.util.*;
public class JavaInterviewQuestions {

	
	
		
public static void main(String[] args) {
	
	 int [] arr = {1,2,2,3,3} ;
	
	 ArrayList<Integer> list =  new ArrayList<>() ;
	 
	int[] arr2 = new int[5] ;
	 
	 for (int i = 0 ; i <= arr.length-1 ; i++) {
		 
		 if(arr[i]!=arr2[i]) {
			 
			 arr2[i] = arr[i] ;
		 }
		
		
		  
		
	 }
	 for (int i = 0 ; i <= arr2.length-1 ; i++) {
		 System.out.println(arr2[i]);
	 }
	
	
	
	
}
	
	
	
	
	

		 
		
		
	}


