package comparatormultisorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee e1=new Employee(13,"gayathri",54000);
        Employee e2=new Employee(12,"ravi",64000);
        Employee e3=new Employee(14,"mohan",94000);
        
        
        ArrayList<Employee> list=new ArrayList<Employee>();
        
        
        list.add(e1);
        list.add(e2);
        list.add(e3);
        
        System.out.println(list);
        System.out.println("=====================================================");
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println("=========================sorting data=====================");
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the choice 1 or 2:");
        int choice=sc.nextInt();
        if(choice==1)
        {
        IDSort idsort=new IDSort();
        Collections.sort(list,idsort);
        }
        else
        {
            SalarySort s=new SalarySort();
            Collections.sort(list,s);
        }
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        } 
        
        System.out.println("=====================================================");
        
      
	}

}
