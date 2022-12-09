package methodprogram;

public class Practice {
	int length=2, width=3;
	
	double area() {
		double Area= length *width; //with return and without parameter
		return Area;
	}
	
	void Perimeter() {
		double peri=  2 * ( length +  width);  // without return and without perimeter
		System.out.println("Perimeter:" +peri);
	}
	
	
	void Perimeter1(int l , int b) {           //with parameter without parameter
		double peri1 = 2 * ( length +  width);
		System.out.println("Perimeter "+ peri1);  
		
	}
	
	double  area1(int l, int b) {                    // with return parametr and return
		double Area1= l*b;
		return Area1;
	}
	
	
	
	
	
	
	
}



