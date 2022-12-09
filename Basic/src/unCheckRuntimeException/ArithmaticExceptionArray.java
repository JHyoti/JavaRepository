package unCheckRuntimeException;

public class ArithmaticExceptionArray {

	public static void main(String[] args) {
		int z[] = {2,22,3,3};
		try
		{
			System.out.println(z[9]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}


	}

}
