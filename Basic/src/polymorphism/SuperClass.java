package polymorphism;

public class SuperClass {
	 SuperClass(String name){
		 System.out.println("This is super class construcotr"+name);//

	 }
}
 class SubClass extends SuperClass {
	 SubClass(String name){
		 super(name);
		// System.out.println(name +"This is super class construcotr");//


	 }
}