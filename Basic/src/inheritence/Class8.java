package inheritence;

import java.util.Arrays;

public class Class8 extends Student {

	private int []marks;
	
	public Class8()
	{
		
	}
	public Class8(int id,String name,int []marks)
	{
		setsId(id);
		setsName(name);
		this.marks=marks;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public double getPercentage()
	{
		int total = 0;
	for(int i=0;i<marks.length;i++)
	{
		 total=total+marks[i];
	}
		double percentage=(total*100)/500.0;
		return percentage;
	}

	public String toString() {
		return super.toString()+"Class8 [marks=" + Arrays.toString(marks) + ", getPercentage()=" + getPercentage() + "]";
	}

}
