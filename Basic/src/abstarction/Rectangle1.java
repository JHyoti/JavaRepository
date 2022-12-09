package abstarction;

import java.text.DecimalFormat;

public class Rectangle1 extends Shape1 {
	double width;
	double length;
	

	
	
	public Rectangle1(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	public Rectangle1(double width, double length,String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}

	public double getArea() {
		return length * width;
		
	}

	public double getParimeter() {
		// TODO Auto-generated method stub
		return (2 *(length + width));
	}
	
	
	public double getFormatted(String pattern, double value) {
		
		DecimalFormat d = new DecimalFormat(pattern);
		return Double.parseDouble(d.format(value));
		
	}
	
	public String toString() {
		return super.toString() + "Rectangle1 [width=" + width + ", length=" + length + ", getArea()=" + getArea() + ", getParimeter()="
				+ getParimeter() + "]";
	}

	
	
	
	

}