package collection;

import java.util.PriorityQueue;

public class PriorityIfNull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue<Integer>p=new PriorityQueue<Integer>();
		
		System.out.println(p);
		System.out.println(p.peek());//null
		//System.out.println(p.element());//exception
		System.out.println(p.poll());//null
		System.out.println(p.remove());//exception

		System.out.println(p);
	}

}
