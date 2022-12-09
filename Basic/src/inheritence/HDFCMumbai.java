package inheritence;

public class HDFCMumbai extends HDFCBank {
private int loanno;
private String loanName;

	public HDFCMumbai() {
	
	}
	public HDFCMumbai(int loanno, String CustomerName, int accNo, String loanName, int amount) {
		super(accNo, CustomerName, amount);
		this.loanno=loanno;
		this.loanName= loanName;
			
	}
	public int getLoanno() {
		return loanno;
	}
	public void setLoanno(int loanno) {
		this.loanno = loanno;
	}
	public String getLoanName() {
		return loanName;
	}
	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}

	public String toString() {
		return super.toString() + "\nHDFCMumbai [loanno=" + loanno + ", \nloanName=" + loanName + "]";
	}
	
	
}
