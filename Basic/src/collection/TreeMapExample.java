package collection;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String>map=new TreeMap<Integer,String>();
		map.put(9, "eight");
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(1, "four");
		map.put(4, "five");
		map.put(5, "six");
		map.put(6, "seven");
		System.out.println(map);

	}

}
