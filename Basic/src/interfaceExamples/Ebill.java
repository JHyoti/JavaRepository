package interfaceExamples;

public class Ebill implements Bill{
	private double serviceno;
	private double noofunits;
	private double costperunit;
	

	public Ebill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ebill(double serviceno, double noofunits, double costperunit) {
		super();
		this.serviceno = serviceno;
		this.noofunits = noofunits;
		this.costperunit = costperunit;
	}
	
	
	

	public double getServiceno() {
		return serviceno;
	}

	public void setServiceno(double serviceno) {
		this.serviceno = serviceno;
	}

	public double getNoofunits() {
		return noofunits;
	}

	public void setNoofunits(double noofunits) {
		this.noofunits = noofunits;
	}

	public double getCostperunit() {
		return costperunit;
	}

	public void setCostperunit(double costperunit) {
		this.costperunit = costperunit;
	}

	public double calculateBill() {
		double bill = costperunit * noofunits;
		return bill;
		
		
	}

	public void display() {
		System.out.println("The E Bill is:" + calculateBill());
		
	}

	public String toString() {
		return "Ebill [serviceno=" + serviceno + ", noofunits=" + noofunits + ", costperunit=" + costperunit + "]";
	}
	

}
