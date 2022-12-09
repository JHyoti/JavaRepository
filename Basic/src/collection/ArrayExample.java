package collection;

import java.util.ArrayList;

public class ArrayExample {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer> ();
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		System.out.println(list);
		list.add(0, 11);
		System.out.println(list);
		list.remove(4);
		System.out.println("first list"+list);
		ArrayList<Integer> list1=new ArrayList<Integer> ();
		list1.addAll(list);
		System.out.println("second list"+list1);
		System.out.println(list.contains(22));
		System.out.println(list.get(2));
		System.out.println(list.isEmpty());
		list.set(2, 78);
		System.out.println(list);


	}

}
