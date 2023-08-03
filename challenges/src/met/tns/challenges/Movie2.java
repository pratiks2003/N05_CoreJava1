package met.tns.challenges;

import java.util.Scanner;

public class Movie2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int age = sc.nextInt();
		System.out.println("enter your time slot from 10.15 , 13.30 , 18.00 , 22.00 ");
		String time = sc.next();
		int aRent = 8;
		int cRent = 4;
		int aRentM = 5;
		int cRentM =2;
		
		switch(time) {
		
		case "10.15" :
		case "18.00" :
		case "22.00" :
			if (age<=13 && age>0) {
				System.out.println("total amount :"+cRent+" $");

			}
			else {
				System.out.println("total amount :"+aRent+" $");

				}
		break;
		case "13.30" :
			
			if (age<=13 && age>0) {
				System.out.println("total amount :"+cRentM+" $");

			}
			else {
				System.out.println("total amount :"+aRentM+" $");

				}
		break;
		default :
			System.out.println("enter valid time slot");
		
		
		
		}
	}

}
