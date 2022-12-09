package collection;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(12,"Gayathri",54000);
		Employee e2=new Employee(13,"Ravi",64000);
		Employee e3=new Employee(14,"Mohan",94000);
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		System.out.println(list);
		System.out.println("============================================================");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("========================Sorting ===================================");
		Collections.sort(list);
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}

}
