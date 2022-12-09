package inheritence;

import java.util.Arrays;

public class Class11 extends Student{
	private int marksOfSub[];
	private int marksOfPract[];
	public Class11(){
		
		
	}
	public Class11(int id , String name ,int[] marksOfSub, int[] marksOfPract) {
		
		setsId(id);
		setsName(name);
		this.marksOfSub = marksOfSub;
		this.marksOfPract = marksOfPract;
	}
	public int[] getMarksOfSub() {
		return marksOfSub;
	}
	public void setMarksOfSub(int[] marksOfSub) {
		this.marksOfSub = marksOfSub;
	}
	public int[] getMarksOfPract() {
		return marksOfPract;
	}
	public void setMarksOfPract(int[] marksOfPract) {
		this.marksOfPract = marksOfPract;
	}
	

	public double getPercentage()
	{
		int total = 0;
		int total1=0;
	for(int i=0;i<marksOfSub.length;i++)
	{
		 total=total+marksOfSub[i];
	}
		double percentage=(total*100)/500.0;
		return percentage;
	}
	
	
	
	
	public String toString() {
		return super.toString() +"Class11 [marksOfSub=" + Arrays.toString(marksOfSub) + ", marksOfPract=" + Arrays.toString(marksOfPract)
				+ ", getPercentage()=" + getPercentage() + "]";
	}
	
	
}
