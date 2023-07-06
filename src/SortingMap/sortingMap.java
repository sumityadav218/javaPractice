package SortingMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class sortingMap {

	public static void main(String[] args) {
		
	Map<String,Integer> map =  new HashMap<>() ;
	map.put("eight", 8) ;
	map.put("five", 5) ;
	map.put("ten", 10) ;
	map.put("two", 2) ;
	
	List<Entry<String,Integer>> entries =  new ArrayList<> (map.entrySet()) ; 
	
	Collections.sort(entries,(a,b) -> a.getKey().compareTo(a.getKey()));
	System.out.println(entries);
	}

}
