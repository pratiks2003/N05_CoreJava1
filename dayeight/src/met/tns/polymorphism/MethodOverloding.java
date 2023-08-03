package met.tns.polymorphism;

class Bollywood{
	
static String s1 , s2 ;
static int s3 ;
static void display(String s1 ,String s2) {
	
	System.out.println(s1+" kills "+s2);
}
	static void display(String s1, int s3) {
		
		System.out.println(s1+" kills "+s3+" deers ");
	}
}

// driver class
public class MethodOverloding {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bollywood.display("salman","deer");
//		display()
		
	}

	

}
