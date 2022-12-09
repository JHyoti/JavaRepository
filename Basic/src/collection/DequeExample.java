package collection;
import java.util.LinkedList;
import java.util.Deque;
public class DequeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> d=new LinkedList<Integer>();
		d.add(12);
		d.add(13);
		d.add(45);
		d.add(89);
		d.add(10);
		System.out.println(d);
		d.addFirst(23);
		d.addLast(34);
		System.out.println(d);
		d.removeFirst();
		d.removeLast();
		System.out.println(d);
	

	}

}
