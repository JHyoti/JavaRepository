package interfaceExamples;

public class Class8  extends Student implements Percentage{

	private int[] marks;
	
	public Class8() {
		super();
		
	}

	public Class8(int id, String name, int[] marks) {
		super(id, name);
		this.marks = marks;
		
	}

	
	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public double calculatePercentage() {

			double  total=0;
			for(int i=0; i<marks.length; i++) {
				 total = total + marks[i];  
			}	
			 double percentage = total *100 /500.0d; 
			 return percentage;
			
		}

	public String toString() {
		return super.toString() + "Class8 ["+ "calculatePercentage()=" + calculatePercentage() + "]";
	}

	

	

}
