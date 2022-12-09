package collection;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>s=new Stack<Integer>();
		s.add(13);
		s.add(19);
		s.add(12);
		
		s.add(11);
		s.add(14);
		System.out.println(s);
		s.push(23); //add  from front
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();//remove from last
		System.out.println(s);

	}

}
