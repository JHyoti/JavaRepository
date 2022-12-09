package variablesanddatatype;
import java.text.DecimalFormat;
//WAP to get employee id,name ,salary calculate annual salary and pf? using Scanner
import java.util.*;
public class Emp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the employee id");
		int id=sc.nextInt();
		System.out.println("enter the employee name");
		String employeename=sc.next();
		System.out.println("enter the employee =salary");
		float salary=sc.nextFloat();
		
		System.out.println("The Employee id"+id);

		System.out.println("The Employee name"+employeename);
		System.out.println("The Employee salary"+salary);
		
		float annualSalary=salary*12;
		System.out.println("The Annual Salary=:"+annualSalary);
		
		double pf=(salary*0.18);
		System.out.println("The Pf=:"+pf);
		DecimalFormat d=new DecimalFormat("0.##");
		System.out.println(d.format(pf));


		
	}

}
