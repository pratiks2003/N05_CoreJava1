package met.tns.coustomexception;

public class LoginException extends Exception{

	//private data member 
	
	private String str ;

	public LoginException(String str) {
		super();
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "LoginException [str=" + str + "]";
	}
	
	
}
