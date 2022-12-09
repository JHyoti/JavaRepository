package constuctor;



public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp emp1 = new Emp(1, "Jo", 5000.0f, "abcsdf");
		System.out.println(emp1);
		System.out.println("==============================================");
		Emp emp2 = new Emp(2, "Joyti", 8000.0f, "xyz");
		System.out.println(emp2);
		System.out.println("==============================================");
		Emp emp3 = new Emp();
		emp3.id=1;
		emp3.name="Soni";
		System.out.println(emp3.id);
		System.out.println(emp3.name);
		
	}
	

}
