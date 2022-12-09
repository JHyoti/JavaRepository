package collection;
//import java.util.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		

		LinkedList <Float>list=new LinkedList<Float>();
		list.add(12.3f);
		list.add(13.3f);
		list.add(14.3f);
		list.add(15.3f);
		list.add(16.3f);
		list.add(13.3f);
		System.out.println(list);
		System.out.println("===================================");
		ListIterator<Float>it=list.listIterator();
		System.out.println("next data");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("previous data");
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}
       list.addFirst(11.3f);
       list.addLast(15.3f);
       System.out.println(list);
       list.removeFirst();
       list.removeLast();
       System.out.println(list);
	}

}


