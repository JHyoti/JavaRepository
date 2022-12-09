package methodprogram;
//with return type without return type method
public class Circle {
	int r =2;
	//with return type
	
	double areaOfcircle() { 
		double area = 3.14 * r *r;
		return area;
	}
	
	//without return type
	void perimeter() {
		double per =  2 *3.14 *r;
		System.out.println("Perimeter:"+per);
	}
	
	
	//without parameter
	
//	System.out.println("====================================");
	double areaOfcircle1(int r1) { 
		double area1 = 3.14 * r1 *r1;
		return area1;
	}
	
	//without return type
	void perimeter1(int r1) {
		double per1 =  2 *3.14 *r1;
		System.out.println("Perimeter:"+per1);
	}
	
	
	
}
