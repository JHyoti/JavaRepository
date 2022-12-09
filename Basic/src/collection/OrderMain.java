package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OrderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order o1=new Order(1001,"chair",45);
		Order o2=new Order(1002,"Table",145);
		Order o3=new Order(1003,"KidsChair",95);
		Order o4=new Order(1004,"Swing",56);
		Order o5=new Order(1005,"TablMate",35);
		HashMap<Integer,Order>map=new HashMap<Integer,Order>();
		map.put(o1.getOrderid(), o1);
		map.put(o2.getOrderid(), o2);
		map.put(o3.getOrderid(), o3);
		map.put(o4.getOrderid(), o4);
		map.put(o5.getOrderid(), o5);
		for(Map.Entry<Integer, Order>m:map.entrySet())
		{
			System.out.println(m);
		}
//To get Value from if entering from user
		System.out.println("enter the order id");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();//1005
		for(Map.Entry<Integer, Order>m:map.entrySet())
		{
			if(m.getKey()==id)
                {
                	System.out.println(m.getValue());
	
                  }


		}

	}

}
