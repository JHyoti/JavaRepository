package interfaceExamples;

public class IndianBank implements Bank {

	int dp;
	public void deposit() {
		 dp=Bank.amount+2000;
		 System.out.println("deposit amount=:"+dp);

	}

	public void withDraw() {
		int wd=dp-3000;
		System.out.println("Withdraw amount=:"+wd);

		
	}
	
}
