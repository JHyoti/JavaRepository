package collection;


import java.util.Map;
import java.util.TreeMap;

public class OderSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order o1=new Order(1006,"chair",45);
		Order o2=new Order(1008,"Table",145);
		Order o3=new Order(1001,"KidsChair",95);
		Order o4=new Order(1004,"Swing",56);
		Order o5=new Order(1008,"TablMate",35);
		TreeMap<Integer,Order>map=new TreeMap<Integer,Order>();
		map.put(o1.getOrderid(), o1);
		map.put(o2.getOrderid(), o2);
		map.put(o3.getOrderid(), o3);
		map.put(o4.getOrderid(), o4);
		map.put(o5.getOrderid(), o5);
		for(Map.Entry<Integer, Order>m:map.entrySet())
		{
			System.out.println(m);
		}
	}

}
