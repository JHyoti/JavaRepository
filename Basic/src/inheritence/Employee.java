package inheritence;

public class Employee {
	int id;
	String ename;
	public Employee(){
		
	}
	public Employee(int id, String ename){
		this.id=id;
		this.ename=ename;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + "]";
	}
	
	
	
}
