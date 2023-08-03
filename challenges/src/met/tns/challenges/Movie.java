package met.tns.challenges;
import java.util.*;
public class Movie {

	public static void main(String[] args) {

		//movie ticket price management system
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int age = sc.nextInt();
		System.out.println("enter your time slot from 10.15 , 13.30 , 18.00 , 22.00 ");
		double time = sc.nextDouble();
		int aRent = 8;
		int cRent = 4;
		int aRentM = 5;
		int cRentM =2;
		
		if (age<=13 && age!=0) {
			
//			 for child
				
				if( time == 10.15 || time == 18.00 || time == 22.00) {
					System.out.println("total amount :"+cRent+"$");
				}
				else if(time == 13.30) {
					System.out.println("total amount :"+cRentM+"$");
				}
				else {
					System.out.println("enter a valid time .");
				}
			
			
		}
				else if(age!=0) {
					
//					for adult
					
					if(time == 10.15 || time == 18.00 || time == 22.00) {
						System.out.println("total amount :"+aRent+"$");
					}
					else if(time == 13.30) {
						System.out.println("total amount :"+aRentM+"$");
					}
					else {
						System.out.println("enter a valid time");
					}
				}
		
				else {
					System.out.println("enter valid age");
				}
		
	}

}
