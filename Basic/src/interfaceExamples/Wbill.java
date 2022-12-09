package interfaceExamples;

public class Wbill implements Bill {
	private double houseno;
	private double litersconsumed;
	private double costperlitre;
	
	
	
	public double getHouseno() {
		return houseno;
	}

	public void setHouseno(double houseno) {
		this.houseno = houseno;
	}

	public double getLitersconsumed() {
		return litersconsumed;
	}

	public void setLitersconsumed(double litersconsumed) {
		this.litersconsumed = litersconsumed;
	}

	public double getCostperlitre() {
		return costperlitre;
	}

	public void setCostperlitre(double costperlitre) {
		this.costperlitre = costperlitre;
	}

	public Wbill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Wbill(double houseno, double litersconsumed, double costperlitre) {
		super();
		this.houseno = houseno;
		this.litersconsumed = litersconsumed;
		this.costperlitre = costperlitre;
	}

	public double calculateBill() {
		double bill = costperlitre * litersconsumed;
		return bill;
	}

	public void display() {
		System.out.println("The Water Bill is:" + calculateBill());
		
	}

	public String toString() {
		return "Wbill [houseno=" + houseno + ", litersconsumed=" + litersconsumed + ", costperlitre=" + costperlitre
				+ "]";
	}

	
	
	
	

}
