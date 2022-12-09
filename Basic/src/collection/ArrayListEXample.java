package collection;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListEXample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Float> list = new ArrayList <Float> ();
		list.add(12.3f);
		list.add(13.3f);
		list.add(14.3f);
		list.add(15.3f);
		list.add(16.3f);
		list.add(13.3f);
		System.out.println(list);
		System.out.println("============================");
		Iterator <Float> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
