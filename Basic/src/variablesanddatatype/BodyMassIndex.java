package variablesanddatatype;

import java.util.*;

public class BodyMassIndex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the weight and height");
		int weight=sc.nextInt();
		int height=sc.nextInt();
		double bmi=(double)weight/(height*height);
		System.out.println("The BMI is=:"+bmi);

	}

}
