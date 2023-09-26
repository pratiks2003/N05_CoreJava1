package met.tns.bank;

public class Account implements Bank{

	private int accNo;
	private String name;
	private int balance;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
	
}
