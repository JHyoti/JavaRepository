package inheritence;

public class Bowler extends Player {
	private int wiketstaken;
	private int noOfBoll;
	
	public Bowler(int jersyno , String pname, String address, int wiketstaken, int noOfBoll) {
		super(jersyno , pname, address);
		this.wiketstaken = wiketstaken;
		this.noOfBoll = noOfBoll;
	}

	public int getWiketstaken() {
		return wiketstaken;
	}

	public void setWiketstaken(int wiketstaken) {
		this.wiketstaken = wiketstaken;
	}

	public int getNoOfBoll() {
		return noOfBoll;
	}

	public void setNoOfBoll(int noOfBoll) {
		this.noOfBoll = noOfBoll;
	}


	public String toString() {
		return super.toString() +"Bowler [wiketstaken=" + wiketstaken + ", noOfBoll=" + noOfBoll + "]";
	}
	
	
	
}
