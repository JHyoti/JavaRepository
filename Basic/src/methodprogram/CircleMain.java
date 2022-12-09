package methodprogram;
//with return type without return type method
public class CircleMain {
	public static void main(String[] args) {
	Circle c = new Circle();
	System.out.println("Area of circle is:" +c.areaOfcircle()); //without parameter with return type double for that 
	//we need to use sop statment in main class
	
	c.perimeter(); // without return type without parameter
	
	
	System.out.println("=================with parametr=================");
	Circle c1 = new Circle();
	System.out.println("Area of circle is:" +c1.areaOfcircle1(55)); //without parameter with return type double for that 
	//we need to use sop statment in main class
	
	c1.perimeter1(5); // without return type without parameter
}
}
