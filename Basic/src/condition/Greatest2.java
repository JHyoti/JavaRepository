package condition;

import java.util.Scanner;

public class Greatest2 {

	public static void main(String[] args) {
	Scanner SC = new Scanner(System.in);
	System.out.println("Enter your num:");
	int NUM1=SC.nextInt();
	int NUM2 = SC.nextInt();
	int NUM3 =SC.nextInt();
	int max =NUM1;
	if(max<NUM2) {
		max =NUM2;
	}
	if(max<NUM3){
		max =NUM3;
	}
	System.out.println("The Grestest num is" +max);
	

	}

}
