package interfaceExamples;

public class Triangle implements Shape {
	private double Length, Base, hypotenuse;
	private String pattern;
	
	
	
	
	public Triangle() {
		super();
		
	}

	public Triangle(double length, double base, double hypotenuse, String pattern) {
		super();
		Length = length;
		Base = base;
		this.hypotenuse = hypotenuse;
		this.pattern = pattern;
	}

	public double getLength() {
		return Length;
	}

	public void setLength(double length) {
		Length = length;
	}

	public double getBase() {
		return Base;
	}

	public void setBase(double base) {
		Base = base;
	}

	public double getHypotenuse() {
		return hypotenuse;
	}

	public void setHypotenuse(double hypotenuse) {
		this.hypotenuse = hypotenuse;
	}

	public Double getArea() {
		double side = getPerimeter()/2;
		double area = Math.sqrt(side * (side-Length) *(side-Base) * (side - hypotenuse) );
	//	return Shape.getFormatter(area, pattern);
		return area;
	}

	public Double getPerimeter() {
		double perimeter = Length * Base * hypotenuse;
		//return Shape.getFormatter(perimeter, pattern);
		return perimeter;
	}



	
	public String toString() {
		return "Triangle [Length=" + Length + ", Base=" + Base + ", hypotenuse=" + hypotenuse + ", pattern=" + pattern
				+ ", getArea()=" + getArea() + ", getPerimeter()=" + getPerimeter() + "]";
	}



}
