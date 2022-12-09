package inheritence;

public class Bank {
	private int accNo;
	private String CustomerName;
	public Bank() {
		
	}
	public Bank(int accNo, String CustomerName) {
		super();
		this.accNo=accNo;
		this.CustomerName=CustomerName;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	
	public String toString() {
		return "Bank [accNo=" + accNo + ", \nCustomerName=" + CustomerName + "]";
	}
	
	
	
}
