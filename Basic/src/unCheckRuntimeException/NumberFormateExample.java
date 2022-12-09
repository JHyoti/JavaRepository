
package unCheckRuntimeException;

public class NumberFormateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
		String s="hello";
		int i=Integer.parseInt(s);
		System.out.println(i);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}

	}

}
