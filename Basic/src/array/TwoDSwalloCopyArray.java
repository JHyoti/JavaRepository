package array;

public class TwoDSwalloCopyArray {

	public static void main(String[] args) {
		int a[][] =new int[2][2];
		a[0][0] = 10;
		a[0][1] = 11;
		a[1][0] =12;
		a[1][1] = 13;
		int b[][] =a.clone();
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.println(b[i][j]);
			}
		}

	}

}
