package unCheckRuntimeException;

public class StudentMain {

	public static void main(String[] args) throws NotEligibleForInterviewException 
	{
		int m1[]= {67,89,90,78,67};
		StudentException s1=new StudentException(1001,"rashmi",m1);
		System.out.println(s1);
		int m2[]= {88,99,90,78,67};
		StudentException s2=new StudentException(1002,"hari",m2);
		System.out.println(s2);
		calculateHighPercentage(s2);
	}
	
	public static void calculateHighPercentage(StudentException s) throws NotEligibleForInterviewException
	{
		
		if(s.Percentage()<90)
		{
			System.out.println("welcome to Capgemini");
		}
		else
		{
			throw new NotEligibleForInterviewException("not eligible for interview");
		}
	}
	
	/*if(s.Percentage()>s2.Percentage() )
	{
		System.out.println(" Rashmi high percentage");
	}
	else if(s.Percentage()<s2.Percentage())
	{
		System.out.println("Hari high percentage");
	}
	
	else
	{
		throw new NotEligibleForInterviewException("not eligible for interview");
	}
	*/
	
	/*
	
	int m3[]= {98,95,90,78,67};
	Student s3=new Student(1003,"sankalpa",m3);
	System.out.println(s3);
	double max=s1.Percentage();
	if(max<s2.Percentage())
	{
		max=s2.Percentage();
	}
	 if(max<s3.Percentage())
	{
		max=s3.Percentage();
	}
	 System.out.println("The Max Percentage is "+max);
	 if(max>=90)
	 {
		 System.out.println("Eligible to interview ");
	 }
	else
	{
		throw new LowPercentageException("Low percentage");
	}
	
	
*/

	
	
	
	}


