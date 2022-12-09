package unCheckRuntimeException;

import java.util.Arrays;

public class StudentException {

	private int sId;
	private String sName;
	private int []marks;
	public StudentException()
	{
		
	}
	public StudentException(int sId, String sName, int[] marks) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.marks = marks;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
public double Percentage()
{
	int total=0;
	for(int i=0;i<marks.length;i++)
	{
		total=total+marks[i];
	}
	double percentage=(total*100)/500.0;
	return percentage;
}

public String toString() {
	return "Student [sId=" + sId + ", sName=" + sName + ", marks=" + Arrays.toString(marks) + ", Percentage()="
			+ Percentage() + "]";
}


	

}
