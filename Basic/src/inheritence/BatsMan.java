package inheritence;

public class BatsMan extends Player {
	private double  centuries;
	private double halfcenturies;
	private int sixes;
	private int fours;
	
	public BatsMan() {
		
	}
	
	public BatsMan(int jersyno , String pname, String address, double centuries, double halfcenturies, int sixes, int fours) {
		super(jersyno , pname, address);
		this.centuries=centuries;
		this.halfcenturies = halfcenturies;
		this.sixes=sixes;
		this.fours =fours;
	}

	public double getCenturies() {
		return centuries;
	}

	public void setCenturies(double centuries) {
		this.centuries = centuries;
	}

	public double getHalfcenturies() {
		return halfcenturies;
	}

	public void setHalfcenturies(double halfcenturies) {
		this.halfcenturies = halfcenturies;
	}

	public int getSixes() {
		return sixes;
	}

	public void setSixes(int sixes) {
		this.sixes = sixes;
	}

	public int getFours() {
		return fours;
	}

	public void setFours(int fours) {
		this.fours = fours;
	}


	public String toString() {
		return super.toString() + "BatsMan [centuries=" + centuries + ", halfcenturies=" + halfcenturies + ", sixes=" + sixes + ", fours="
				+ fours + "]";
	}
	
	
}
