package unCheckRuntimeException;

public class throwExceptionExample {
	public static void Validate(int age)
	{
		if(age>=18)
		{
			System.out.println("welcome to vote");
		}
		else
		{
			try
			{
			throw new Exception("Invalid Age");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
	}

	public static void main(String[] args) {
		Validate(12);

	}

}
