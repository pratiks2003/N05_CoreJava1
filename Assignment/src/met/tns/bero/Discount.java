package met.tns.bero;

public class Discount extends Bero{
double discount ;
	public Discount(String beroType, String beroColor, double price) {
		super(beroType, beroColor, price);

	if(beroType.equals("steel")) {
		discount = price * 10/100;
		double Dprice = price - discount;
		System.out.println("discount : "+ Dprice+" Rs");
		
	}else {
		discount = price * 15/100;
		double Dprice = price - discount;
		System.out.println("discount : "+ Dprice+" Rs");
	}
	
	
	
	}

	
}
