package met.tns.operator;
import java.util.*;
public class OperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//operator
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(num1);
		
		System.out.println("addition - "+(num1+num2));
		System.out.println("subtraction - "+(num1-num2));
		System.out.println("division - "+num1/num2);
		System.out.println("modulo - "+num1%num2);
		System.out.println("multiplication - "+num1*num2);
		
//		Relation operator 
		
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
		System.out.println(num1<=num2);
		System.out.println(num1>=num2);
		
		System.out.println(num1&&num2);


		
		
	}

}
