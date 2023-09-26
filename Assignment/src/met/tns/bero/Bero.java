package met.tns.bero;

public abstract class Bero {

	protected String beroType ;
	protected	String beroColor;
	protected double price ;
	
	public Bero(String beroType, String beroColor, double price) {
		super();
		this.beroType = beroType;
		this.beroColor = beroColor;
		this.price = price;
	}

	public String getBeroType() {
		return beroType;
	}

	public void setBeroType(String beroType) {
		this.beroType = beroType;
	}

	public String getBeroColor() {
		return beroColor;
	}

	public void setBeroColor(String beroColor) {
		this.beroColor = beroColor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public  void calculatePrice() {
		System.out.println("\nAmount need to be paid : "+price+" Rs");
	}
	
}
