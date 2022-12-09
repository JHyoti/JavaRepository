package array;
import java.util.Scanner;
public class TwoDArray {

	public static void main(String[] args) {
		
		       Scanner sc=new Scanner(System.in);
		       System.out.println("enter the row");
		       int row=sc.nextInt();
		       System.out.println("enter the column");
		       int column=sc.nextInt();
		       int a[][]=new int[row][column];
		       System.out.println("enter the inputs ");
		       for(int i=0;i<row;i++)//0<2 1<2
		       {
		    	   for(int j=0;j<column;j++)//0<2 1<2 2<2
		    		                        //0<2 1<2
		    	   {
		    		   a[i][j]=sc.nextInt();//a[0][0]=1 a[0][1]=2
		    		                       //a[1][0]=3  a[1][1]=4
		    	   }
		       }
		       System.out.println("outputs");
		       for(int i=0;i<row;i++)
		       {
		    	   for(int j=0;j<column;j++)
		    	   {
		    		   System.out.print(a[i][j]+" ");
		    	   }
		    	   System.out.println();
		       }
		       
			

	}

}
