package met.tns.operator;

import java.util.Scanner;

public class BloodBank {

	public static void main(String[] args) {
	
		// blood donation eligible program
		
     Scanner sc = new Scanner(System.in);
     System.out.println("enter your age and weight :");
     int age = sc.nextInt();
     int weight = sc.nextInt();
     
     
     
     if(age>=18 && weight > 50) {
    	 
    	 System.out.println("--can donate blood--");
    	 
     }
     else {
    	 System.out.println("--cannot donate blood--");
     }
     
	}

}
