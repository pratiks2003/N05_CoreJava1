package met.tns.accessspecifierdayone;

import met.tns.accesspecifier.Bank;

public class BankExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank();
		b.bankName="sbi";
		b.displayPublic();
		
// pin number are private therefore it is not visible 
// we can access private data member into same class
		
//		b.pin;
//	    b.displayPrivate();
		
//	accNo and displaydefault cannot be accesed  because its in a differnt 
//	package bcz its set to default
		
//		b.accNo;
//		b.displayDefault();
		
	}
	

}
