package array;

import java.util.Scanner;

public class DigonalElementArray {

	public static void main(String[] args) {
		int a[][] =new int[3][3];
		System.out.println("Enter the inpute:");
    	Scanner scan =new Scanner(System.in);
    	for(int i=0; i<3; i++) {
    		for(int j=0; j<3; j++) {
    			a[i][j]= scan.nextInt();
    		}
    	}
    	System.out.println("Array is:");
    	for(int i=0; i<3; i++) {
    		for(int j=0; j<3; j++) {
    			System.out.print(a[i][j]+ " ");
    		}
    		System.out.println();
    	}
    	System.out.println("Digonal Elements Are:");
    	for(int i=0; i<3; i++) {
    		for(int j=0; j<3; j++) {
    			if(i==j) {
    					System.out.println(a[i][j]);
    			}
    			
    		}
    	}
	    
	}

}
