package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		Vector <String>v=new Vector<String>();
		v.add("java");
		v.add("C");
		v.add("c++");
		v.add("c++");
		v.add("python");
		v.add("bigdata");
		System.out.println(v);
		System.out.println("=============================");
		Enumeration<String>e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}

}
