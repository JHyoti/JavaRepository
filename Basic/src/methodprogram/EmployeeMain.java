package methodprogram;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee emp1 = new Employee(1, "Jo", 5000.0f, "abcsdf");
		Employee emp1 = new Employee("Jo", 5000.0f, "abcsdf");
		System.out.println(emp1);
		Employee emp2 = new Employee("Joyti", 8000.0f, "xyz");
		System.out.println(emp2);
		/*Employee emp3=new Employee();
		emp3.setid=14;
		emp3.setName="varsha";
		System.out.println(emp3.getid);
		System.out.println(emp3.getName);
		*/
		Employee emp3=new Employee();
		emp3.setId(14);
		
		emp3.setName("varsha");
		System.out.println(emp3.getId());
		System.out.println(emp3.getName());

		
	}

}
