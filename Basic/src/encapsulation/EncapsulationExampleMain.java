package encapsulation;

public class EncapsulationExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationExample User = new EncapsulationExample();
		User.setUsername("admin");
		User.setPassword(123);
		System.out.println(User.getUsername());
		System.out.println(User.getPassword());
	
	}

}
