
package abstarction;

public class Circle1 extends Shape1 {
	protected double radius;
	
	public Circle1() {
			
	}
	
		public Circle1(double radius) {
			this.radius = radius;
	}
		
		public Circle1(double radius, String color, boolean filled) {
			super(color, filled);
			this.radius = radius;
	
		}

	
	public double getRadius() {
			return radius;
		}

		public void setRadius(double radius) {
			this.radius = radius;
		}


	public double getArea() {
		// TODO Auto-generated method stub
		return  (3.14 * radius *radius) ;
		
	}

	public double getParimeter() {
		// TODO Auto-generated method stub
		return (2 *3.24 * radius *radius) ;
	}


	public String toString() {
		return super.toString()+ "Circle1 [radius=" + radius + ", getArea()=" + getArea() + ", getParimeter()=" + getParimeter() + "]";
	}


	
}
