package met.tns.bero;

public class SteelBero extends Bero {

	private int beroHeight;
	
	public SteelBero(String beroType, String beroColor, double price , int beroHeight) {
		super(beroType, beroColor, price);

		if (beroHeight == 3) {this.price = 5000;}
		if (beroHeight == 5) {this.price = 8000;}
		if (beroHeight == 7) {this.price = 10000;}

	
	}

	@Override
	public String toString() {
		return "SteelBero [beroHeight=" + beroHeight + ", price=" + price + "]";
	}

	public int getBeroHeight() {
		return beroHeight;
	}

	public void setBeroHeight(int beroHeight) {
		this.beroHeight = beroHeight;
	}
	

	
}
