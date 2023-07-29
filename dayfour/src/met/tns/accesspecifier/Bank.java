package met.tns.accesspecifier;

public class Bank {
//	different access specifier
	
	public String bankName ;
	private int pin;
	long accNo = 231313131312l;

	public void displayPublic() {
		System.out.println("bank name is : "+bankName);
		
	}
	private void displayPrivate() {
		System.out.println("pin number is : "+pin);
	}
	
	private void displayAccNO() {
		
		System.out.println("account number is :"+accNo);
	}
}
