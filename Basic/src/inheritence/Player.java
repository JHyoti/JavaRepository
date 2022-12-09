package inheritence;
/*
 * TASK:
==========
player:
==========
jersyno
pname
address


bowler                             BatsMan
======                             =========
1)wiketsTaken                     1)centuries,2)halfcenturies,sixes,fours,

2)noofBallsBowled

 */
public class Player {
	private int jersyno;
	private String pname;
	private String address;
	public Player() {
		
	}
	public Player(int jersyno , String pname, String address) {
		this.jersyno=jersyno;
		this.pname=pname;
		this.address=address;
	}
	public int getJersyno() {
		return jersyno;
	}
	public void setJersyno(int jersyno) {
		this.jersyno = jersyno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return "Player [jersyno=" + jersyno + ", pname=" + pname + ", address=" + address + "]";
	}
	
	
}
