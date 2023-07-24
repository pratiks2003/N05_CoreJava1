package met.tns.decisionmaking;
import java.util.*;
public class NestedIfElse {

	public static void main(String[] args) {
//bunjee jumping eligibility ;
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		int weight= sc.nextInt();
		
		if(age>=12) {
				if(weight>=40 && weight<=110) {
					System.out.println("ready to jump");
				}
				else if(weight>110) {
					System.out.println("will need extra rope");
				}
		}
		else {
			System.out.println("cant jump");
		}
	}

}
