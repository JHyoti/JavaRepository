package interfaceExamples;
/*
 * WAP to create Bill interface:
===============================
calculateBill();
display();

EBIll:
serviceno:
noofunits
costperunit

WBIll:
houseno
litersconsumed
costperlitre

 */
public interface Bill {
	public double calculateBill();
	public void display();
}
