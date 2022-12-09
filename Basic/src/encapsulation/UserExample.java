package encapsulation;

public class UserExample {

	private String userName;
	private String password;
	public UserExample()
	{
		
	}
	public UserExample(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String Validate()
	{
		if(userName.equals("admin")&& (password.equals("123")))
		{
			return "Welcome Gayathri";
		}
		else
		{
			return "Not a Valid User";
		}
	}
	
	public String toString() {
		return "UsernameExample [userName=" + userName + ", password=" + password + ", Validate()=" + Validate() + "]";
	}

}
