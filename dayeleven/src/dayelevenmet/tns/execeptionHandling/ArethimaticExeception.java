package dayelevenmet.tns.execeptionHandling;
import java.util.*;
public class ArethimaticExeception {

	public static void main(String[] args) {
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
//	solve the exeption
}
	}

}
