package met.tns.polymorphism;
import java.util.*;
class laptop{
	
	 void specs(String gen1 , String gen2 ) {
		 
		 System.out.println("specs :"+gen1);
	 }
	 
}
class hp extends laptop{
	
	String gen2 , gen1 ;
	
	
	
    void specs(String gen2,String gen1) {
    	super.specs(gen1,gen2);
		System.out.println("specs :"+gen2);
	}
	
	
	
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String gen1 = sc.nextLine();
		String gen2 = sc.nextLine();
		hp h = new hp();
		h.specs(gen2,gen1);
	}

}
