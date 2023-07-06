package Sorting;

import java.util.ArrayList;
import java.util.List;
//dao layer 

public class Database {

	public static List<EmployeeDAO> getEmployees () {
		List<EmployeeDAO> list = new ArrayList<>();
		list.add(new EmployeeDAO(176, "Roshan", 600000, "IT"));
		list.add(new EmployeeDAO(388, "Bikash", 900000, "CIVIL"));
		list.add(new EmployeeDAO(470, "Bimal", 500000, "DEFENCE"));
		list.add(new EmployeeDAO(624, "Sourav", 400000, "CORE"));
		list.add(new EmployeeDAO(176, "Prakash", 1200000, "SOCIAL"));
		return list;
		

	} 
	
	
	

}
