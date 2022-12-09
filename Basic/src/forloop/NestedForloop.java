package forloop;

public class NestedForloop {

	public static void main(String[] args) {
		for(int i=1; i<=3; i++) { //i=1 1<=3 2<=3
			for(int j=1; j<=3; j++) { // j=1 1<=1 2<=1 j=1 1<=3
				System.out.print(j+ " ");  //1 2 3
									  //1 2 3
									  //1 2 3
			}
			System.out.println();
		}
	}

}
