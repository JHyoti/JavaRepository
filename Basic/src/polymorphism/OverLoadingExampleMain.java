package polymorphism;

public class OverLoadingExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoadingExample o1=new OverLoadingExample();
		System.out.println("overload int data" + " "+o1.add(6, 7));
		System.out.println("overload double data"+ " " +o1.add(6.5));
		System.out.println("overload float data" + " " +o1.add(6.3f, 7.6f,9.0f));
		

	}

}
