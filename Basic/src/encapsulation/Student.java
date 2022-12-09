package encapsulation;

import java.util.Arrays;

public class Student {
	private int sId;
	private String sName;
	private int mark[];
	public Student()
	{
		
	}
	public Student(int sId, String sName, int[] mark) {
	  
		this.sId = sId;
		this.sName = sName;
		this.mark = mark;
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
	public int[] getMark() {
		return mark;
	}
	public void setMark(int[] mark) {
		this.mark = mark;
	}
	public double getPercentage()
	{
		int total = 0;
	for(int i=0;i<mark.length;i++)
	{
		 total=total+mark[i];
	}
		double percentage=(total*100)/500.0;
		return percentage;
	}

	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", mark=" + Arrays.toString(mark) + ", getPercentage()="
				+ getPercentage() + "]";
	}

}
