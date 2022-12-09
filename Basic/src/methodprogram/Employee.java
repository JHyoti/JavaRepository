package methodprogram;
/*
 * *id
name
address
salary
getAnuualSalry()
getPf:18%
toString();
constructor()

 */
public class Employee {
	int id;
	private String Name;
	private String address;
	private float Salary;

	//private double totalSal;
	public static int idgen=101;
	Employee()
	{
		id=idgen++;//id=101
	}

	Employee(String name, float sal,String l){
		this();
		Name=name;
		address =l;
		Salary =sal;
	}	
	//getter and setter 
	public void setName(String Name) {
		this.Name=Name;
	}
	public String getName() {
		return Name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getSalary() {
		return Salary;
	}

	public void setSalary(float salary) {
		Salary = salary;
	}

	float getAnnalSalry() {
		 float AnnualSalary= Salary * 12.0f;
		 return AnnualSalary;
	}
	
	float getpf() {
		
		float pf =(float) (Salary*0.18f);
		return pf;
	}
	public String toString() {
		return "\nID:" +id +"\nName:" +Name +"\naddress:" +address + "\nSalary:" +Salary + "\nAnnualSal:"+ getAnnalSalry()+ " \nPF:" +getpf();
	}
}
