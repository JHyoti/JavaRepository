package abstarction;

public abstract class Shape1 {
		protected String color;
		protected boolean filled;
		public Shape1() {	
			
		}
		public Shape1(String color, boolean filled) {
			this.color = color;
			this.filled =  filled;	
		}
		

		
		public boolean ifFilled()
		{
			if(filled)
			{
				return true;
			}
			else
			{
				return false;
			}
		}

		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public boolean isFilled() {
			return filled;
		}
		public void setFilled(boolean filled) {
			this.filled = filled;
		}
		public abstract double getArea();
		public abstract double getParimeter();
	
		public String toString() {
			return "Shape1 [color=" + color + ", filled=" + filled + ", ifFilled()=" + ifFilled() + "]";
		}
		
		
		
}
	
