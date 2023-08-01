package met.tns.superKeyword;

class sports{
	 void display() {
	System.out.println("sports is cricket");
	 }
}
class cricket extends sports{
	
		
	void display() {
		super.display();
		System.out.println("11 players");
	}
}







public class SuperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cricket c = new cricket();
		c.display();
	}

}
