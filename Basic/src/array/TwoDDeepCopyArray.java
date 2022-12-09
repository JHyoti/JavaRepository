package array;

public class TwoDDeepCopyArray{

	public static void main(String[] args) {
		int a[][] = new int[2][2];
		a[0][0] = 11;
		a[0][1] = 12;
		a[1][0] = 13;
		a[1][1] = 14;
		int b[][] =a;// assining the array to another array 
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.println(b[i][j]);
			}
		}
		

	}

}
