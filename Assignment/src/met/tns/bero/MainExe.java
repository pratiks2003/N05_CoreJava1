package met.tns.bero;

import java.util.Scanner;

public class MainExe {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String s = sc.next();
		System.out.println("Enter Mobile Number");
		long n = sc.nextLong();
		System.out.println("Enter Your Adress");
		String a = sc.next();
//		sc.close();
	CustomerDetails c = new CustomerDetails(s,n,a);
	c.setCustomerName(s);
	c.setPhoneNo(n);
	c.setAdress(a);
//	System.out.println(c.toString());
	
	System.out.println("Enter bero type");
	String t = sc.next();
	
		if(t.equals("steel")) {
		System.out.println("Enter bero color");
		String co = sc.next();
		
		System.out.println("Enter height");
		int h = sc.nextInt();
		SteelBero b = new SteelBero(t,co,0,h);
		
		b.setBeroType(t);
		b.setBeroColor(co);
		b.setBeroHeight(h);
		
//		System.out.println(b.toString());
		b.calculatePrice();
		Discount d = new Discount(t,co,b.getPrice());
		}
		else {
			System.out.println("Enter bero color");
			String co = sc.next();
			
			System.out.println("Enter Wood Type");
			String w = sc.next();
			WoodenBero wb = new WoodenBero(t,co,0,w);
			
			wb.setBeroType(t);
			wb.setBeroColor(co);
			wb.setWoodType(w);
			
//			System.out.println(wb.toString());
			wb.calculatePrice();
			
			Discount d = new Discount(t,co,wb.getPrice());
		}
		
	}

}
