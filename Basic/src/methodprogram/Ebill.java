package methodprogram;
/*TASK:
EBill:
====
billno
noofunits
cosperunits

calculateBill();

toString
cosntructor
static variable 
setter 
getter

Main:
2 objects 
 * */
public class Ebill {
	private int billno;
	private int noofunits;
	private double cosperunits;
	private static int billNo=101;
	Ebill(){
		billno = billNo;
		
	}
	
	Ebill(int no, double cost ){
		this();
		noofunits = no;
		cosperunits = cost;

	}
	
	public int getBillno() {
		return billno;
	}
	public void setBillno(int billno) {
		this.billno = billno;
	}
	public int getNoofunits() {
		return noofunits;
	}
	public void setNoofunits(int noofunits) {
		this.noofunits = noofunits;
	}
	public double getCosperunits() {
		return cosperunits;
	}
	public void setCosperunits(double cosperunits) {
		this.cosperunits = cosperunits;
	}
	public double calculateBill() {
		double calculatebill = cosperunits * noofunits;
		return calculatebill;
	}

	
	public String toString() {
		return "Ebill [billno=" + billno + ", noofunits=" + noofunits + ", cosperunits=" + cosperunits
				+ ", calculateBill()=" + calculateBill() + "]";
	}
	
	
	
	
}
