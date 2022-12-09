package inheritence;

public class HDFCBank extends Bank{
	private int amount;
	
	public HDFCBank() {
		
	}
	public HDFCBank(int accNo, String CustomerName, int amount) {
		super(accNo, CustomerName);
		this.amount = amount;
		
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public double deposit() {
		int dp =amount +10000;
		return dp;
	}

	public String toString() {
		return super.toString() + "\nHDFCBank [amount=" + amount + ", \ndeposit()=" + deposit() + "]";
	}
	
	
}

