package met.tns.operator;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
		System.out.println(num1);
		
		System.out.println("result = "+((num1%2==0)?"even":"odd"));
		
		
	}

}
