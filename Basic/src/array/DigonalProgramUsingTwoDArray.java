package array;

import java.util.Scanner;

public class DigonalProgramUsingTwoDArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row");
		int row=sc.nextInt();//2
		System.out.println("enter the column");
		int col=sc.nextInt();//2
		int a[][]=new int[row][col];
		System.out.println("inputs");
		for(int i=0;i<row;i++)//0<2 1<2
		{
			for(int j=0;j<col;j++)//0<2 1<2 2<2=f
			{
				a[i][j]=sc.nextInt();//a[0][0]=12,a[0][1]=13
				                    //a[1][0]=14  a[1][1]=14
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i==j)//12 space
					      //space  14
				{
					System.out.print(a[i][j]+" ");
				}
				else
				{
					System.out.print(" ");
				}
 			}
			System.out.println();
		}


	}

}
