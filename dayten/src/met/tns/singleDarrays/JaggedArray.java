package met.tns.singleDarrays;
import java.util.*;
public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr [][]= new int [2][];
//on 0th index its storing 3 elemets
arr[0] = new int[3];
arr[1]=new int[4];
Scanner sc = new Scanner(System.in);
 
//arr[0]=sc.nextInt();

for(int i = 0; i<arr.length;i++) {
	for(int  j = 0; j<arr[i].length;j++) {
		
		arr[i][j]=sc.nextInt();

		System.out.println(arr[i][j]);
	}
	
}



	}

}
