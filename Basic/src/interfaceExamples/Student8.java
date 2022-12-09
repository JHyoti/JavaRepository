package interfaceExamples;

public class Student8 {
	private int[] marks;
	
	
	public Student8() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Student8(int[] marks) {
		super();
		this.marks = marks;
	}



	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	
	
	
	public String toString() {
		return "Student8 [marks=" + marks + "]";
	}

/*	public double calculatePercentage() {
		double  total=0;
		for(int i=0; i<=marks.length; i++) {
			 total = total + marks[i];  
		}	
		 double percentage = total *100 /500.0d; 
		 return percentage;
		
	}
*/


	

}
