package met.tns.singleDarrays;
import java.util.*;
// 2d array
public class MultiArray {

	public static void main(String[] args) {

		
		int arr [][]= {{1,2},{3,4},{5,6}};
//		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		int arr1[][] = new int[x][y];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				
				System.out.print(arr[i][j]+" ");
//				arr1 [x][y] = sc.nextInt();
//				
//				System.out.print(arr1[i][j]+" ");

			}
			System.out.println(" \n");
		}
		
	}

}
