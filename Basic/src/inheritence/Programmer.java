package inheritence;

public class Programmer extends Employee{
	private int Salary;
	public Programmer(){
		
	}
	public Programmer(int id, String ename, int Salary) {
		this.Salary=Salary;
		setId(id);
		setEname(ename);
		
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	
	
	public double AnnualSalary() {
		double AnualSalary = Salary *12;
		return AnualSalary;
	}

	public String toString() {
		return super.toString() + "Programmer [Salary=" + Salary + ", AnnualSalary()=" + AnnualSalary() + "]";
		
	}
	
	
}
