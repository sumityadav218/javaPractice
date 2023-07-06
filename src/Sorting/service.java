package Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class service {
	

	public static void main(String[] args) {
		
		List<Integer> nos = Arrays.asList(1,2236,4,7,5)  ;
		
		//primitive Data type 
		
	//	nos.stream().sorted().forEach(System.out :: println);
		
	//	nos.stream().sorted(Comparator.reverseOrder()).forEach(System.out :: println);
		
		
		
		//custom class
		
		
		List<EmployeeDAO> employee = Database.getEmployees() ; 
		
		Collections.sort(employee,(o1,o2) -> o2.getSalary()-o1.getSalary());
		System.out.println(employee);
		
		
		employee.stream().sorted((o1,o2) -> o2.getSalary()-o1.getSalary() ).forEach(System.out :: println);
		
		
		//---------->>>>>>above one is the c
		//employee.stream().sorted(Comparator.comparing(emp->emp.getSalary())).forEach(System.out :: println);
		
		//------>>>>>this below is method reference 
		employee.stream().sorted(Comparator.comparing(EmployeeDAO::getDept)).forEach(System.out :: println);
		
//	Collections.sort(employee ,new MyComparator()  );
	
	//System.out.println(employee);
	
	
	
	}
	

}
//class MyComparator implements  Comparator<EmployeeDAO> {
//
//	@Override
//	public int compare(EmployeeDAO o1, EmployeeDAO o2) {
//		// TODO Auto-generated method stub
//		return o1.getSalary()-o2.getSalary();
//	}
//	
//	

