package constuctor;

public class Emp {

	
	int id;
	String name;
	float salary;
	String address;
	Emp()  //default constructor for the universal code usese if any value not having to give that value 0
	{
		
	}
	Emp(int i,String j,float k,String l)
	{
		id=i;
		name=j;
		salary=k;
		address=l;
		
	}
	float getAnnualSalary()
	{
		float annualSalary=salary*12.0f;
		return annualSalary;
		
	}
	float calculatePf()
	{
		float pf=salary/0.18f;
		return pf;
	}
    public String toString()
    {
    	return "id=:"+id+"\nName=:"+name+"\nSalary=:"+salary+"\nAddress=:"+address+"\nAnnualSalary"+getAnnualSalary()+"\nPF+:"+calculatePf();
    }
}


