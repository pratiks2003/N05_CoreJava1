package met.tns.challenges;

import java.util.Scanner;

public class Hotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter month number :");
		int month = sc.nextInt();
		System.out.println("how many days you want to stay : ");
		int days = sc.nextInt();
		int rent = 1000;
		int totalrent ;
		
		System.out.print("your total rent is : ");
		switch(month) {
		
		case 1 :
			 totalrent = rent * days;
			 System.out.print(totalrent); 
			 break;
		case 2 :
			 totalrent = rent * days;
			 System.out.print(totalrent); 
			 break;
		case 3 :
			 totalrent = rent * days;
			 System.out.print(totalrent); 
			 break;
		case 4 :
			 totalrent = (rent+(rent*20/100)) * days;
			 System.out.print(totalrent); 
			 break;
		case 5 :
			 totalrent = rent * days;
			 System.out.print(totalrent); 
			 break;
		case 6 :
			 totalrent = (rent+(rent*20/100)) * days;
			 System.out.print(totalrent); 
			 break;
		case 7 :
			 totalrent = rent * days;
			 System.out.print(totalrent); 
			 break;
		case 8 :
			 totalrent = rent * days;
			 System.out.print(totalrent); 
			 break;
		case 9 :
			 totalrent = rent * days;
			 System.out.print(totalrent); 
			 break;
		case 10 :
			 totalrent = rent * days;
			 System.out.print(totalrent); 
			 break;
		case 11 :
			 totalrent = (rent+(rent*20/100)) * days;
			 System.out.print(totalrent); 
			 break;
		case 12 :
			 totalrent = (rent+(rent*20/100)) * days;
			 System.out.print(totalrent); 
			 break;
			 
		
		
		
		
		
		
		
		}
		
		
		
		

	}

}
