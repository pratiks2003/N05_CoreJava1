package met.tns.thisKeyword;

class Flower {
	
	String name = "rose";
	
	
}
class Rose extends Flower {
	
	String color ="red";
	
}
public class InstanceOfOperator {

	
	public static void main(String[] args) {
		
		Rose r = new Rose();
		boolean req = r instanceof Flower;
		
		System.out.println(req);
		
		
		
	}
}
