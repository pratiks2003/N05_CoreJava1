package met.tns.bero;

public class WoodenBero extends Bero {
String woodType;
	public WoodenBero(String beroType, String beroColor, double price , String woodType) {
		super(beroType, beroColor, price);


		if (woodType.equals("ply")) {this.price = 15000;}
		if (woodType.equals("teak")) {this.price = 12000;}
		if (woodType.equals("oak")) {this.price = 10000;}

	}
	public String getWoodType() {
		return woodType;
	}
	public void setWoodType(String woodType) {
		this.woodType = woodType;
	}
	@Override
	public String toString() {
		return "WoodenBero [woodType=" + woodType + ", price=" + price + "]";
	}

	
	
}
