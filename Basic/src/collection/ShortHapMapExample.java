package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ShortHapMapExample {

	public static HashMap<String, Integer> sortOfvalue (HashMap<String, Integer> list) {
		List<Map.Entry<String ,Integer>> list1 = new ArrayList<Map.Entry<String, Integer>>(((HashMap<String, Integer>) list).entrySet());
		
		Collections.sort(list1, (i1, i2) -> i1.getValue().compareTo(i2.getValue()));
		
		HashMap<String, Integer> list2 = new HashMap<String, Integer>();
		
		for(Map.Entry<String, Integer> i : list1) {
			list2.put(i.getKey(), i.getValue());
		}
	}
	
	public static void main(String[] args) {
		Map<String, Integer> list = new HashMap<String, Integer> ();
		list.put("PineApple",2);
		list.put("Apple", 5);
		list.put("Mango", 5);
		list.put("Stroberry", 3);
		list.put("Lemon" ,4);
		  
		Map<String, Integer> s =sortOfvalue(list);
		for(Map.Entry<String, Integer> i1 : s.entrySet()) {
		
		}
		
		System.out.println(list);
		
	}
}

