package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ListSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer> ();
		list.add(19);
		list.add(13);
		list.add(17);
		list.add(15);
		list.add(16);
		System.out.println(list);
		System.out.println("sort the list data");
		Collections.sort(list);
		System.out.println(list);


	}

}
