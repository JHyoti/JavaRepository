package collection;

public class Employee  implements Comparable <Employee>
  {
	private int id;
	private String name;
	private double Salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	} 
	public double totalsalary() {
		return Salary *12;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Salary=" + totalsalary()  + "]";
	}
	public int compareTo(Employee e1) {
		
		return name.compareTo(e1.getName());
	}
	
}
