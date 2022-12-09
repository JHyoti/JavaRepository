package foreach;

public class ForeachBasic1 {

	public static void main(String[] args) {
		int arry[] = new int[5];
		arry[0] = 12;
		arry[1] = 13;
		arry[2] = 14;
		arry[3] =15;
		arry[4] = 23;
		for(int i=0; i<5; i++) {
			System.out.println("arry"+"["+i+"]" + "="+arry[i]);
		//	System.out.println("arr"+"["+i+"]"+"="+arr[i]);

		}
	}

}
