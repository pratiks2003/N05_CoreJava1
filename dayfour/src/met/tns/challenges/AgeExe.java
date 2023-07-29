package met.tns.challenges;
import java.util.*;
public class AgeExe {

	static void AgeCalci(int by, int cy) {
		
		if(by> cy) {
			
			int age =(100 - by)+cy;
			System.out.println(age);
			
			
		}
		else {
			
			int age = cy - by;
			System.out.println(age);
		}
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int by = sc.nextInt();
		int cy = sc.nextInt();
		AgeCalci(by,cy);

	}

}
