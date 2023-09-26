package dayelevenmet.tns.execeptionHandling;

import java.util.Scanner;

public class FinallyNotExe {

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int x = sc.nextInt();
		int y =sc.nextInt();
		try {
			System.out.println(x/y);
			//define where the exception is coming from
		}
		catch(Exception e) {
	
			System.out.println("exception hadling "+e);
//			System.exit(0);
			//	solve the exception
		}
		finally {
//			finally won't work in case of system.exit
			System.out.println(x/y);
			System.out.println("finally block ");
		}
	}
}

