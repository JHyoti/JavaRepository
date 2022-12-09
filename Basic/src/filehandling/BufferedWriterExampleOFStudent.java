package filehandling;

public class BufferedWriterExampleOFStudent {

	private int dno;
	private String dname;
	private String sname;
	private int s1;
	private int s2;
	private int s3;
	private int s4;
	private int s5;
	public BufferedWriterExampleOFStudent() {
		super();
		
	}
	public BufferedWriterExampleOFStudent(int dno, String dname, String sname, int s1, int s2, int s3, int s4, int s5) {
		super();
		this.dno = dno;
		this.dname = dname;
		this.sname = sname;
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
		this.s5 = s5;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getS1() {
		return s1;
	}
	public void setS1(int s1) {
		this.s1 = s1;
	}
	public int getS2() {
		return s2;
	}
	public void setS2(int s2) {
		this.s2 = s2;
	}
	public int getS3() {
		return s3;
	}
	public void setS3(int s3) {
		this.s3 = s3;
	}
	public int getS4() {
		return s4;
	}
	public void setS4(int s4) {
		this.s4 = s4;
	}
	public int getS5() {
		return s5;
	}
	public void setS5(int s5) {
		this.s5 = s5;
	}
	@Override
	public String toString() {
		return "BufferedWriterExampleOFStudent [dno=" + dno + ", dname=" + dname + ", sname=" + sname + ", s1=" + s1
				+ ", s2=" + s2 + ", s3=" + s3 + ", s4=" + s4 + ", s5=" + s5 + "]";
	}
	
	
	
}
