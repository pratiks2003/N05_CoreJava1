package met.tns.challenges;

import java.util.Scanner;

public class Microwave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter total item number :");
		int item = sc.nextInt();
		System.out.println("heating Time : ");
		float heatingTime = sc.nextInt();
		float recommendedTime ;
		
		switch(item) {
		
		case 1 :
			System.out.println("recommemded heating time "+heatingTime+" c");
			break;
		case 2 :
			recommendedTime = heatingTime + (heatingTime*50/100);
			System.out.println("recommemded heating time "+recommendedTime+" c");
			break;
		case 3 :
			recommendedTime = heatingTime*heatingTime;
			System.out.println("recommemded heating time "+recommendedTime+" c");
			break;
		default :
			System.out.println(" max 3 item recommended ");
		
		}
		
		
		
	}

}
