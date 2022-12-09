package encapsulation;
//WAP to get username and password property using encapsulation code?

public class EncapsulationExample {
	private String username;
	private int password;
	
	/*
	EncapsulationExample(String user, int pass){
		username = user;
		password = pass;
		
	}
	*/
	public String getUsername() {
		return username;
	}
	public String setUsername(String username) {
		return username;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}

	public String toString() {
		return "EncapsulationExample [username=" + username + ", password=" + password + "]";
	}
	
}
