package forloop;

public class LeftTriangleParternExample {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++){ //i=1 1<=5 2<=5
			for(int j=1; j<=i; j++) { // 1<=1 1<=2
				System.out.print("*"+" "); //*
										// * *	
			}
			System.out.println();
		}
	}

}
