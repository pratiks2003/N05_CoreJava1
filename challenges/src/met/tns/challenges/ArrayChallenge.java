package met.tns.challenges;

public class ArrayChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int arr[] = {1,2,3,4};
 int product =1;
//to remove product of all elements in array
 for(int i=0;i<arr.length;i++) {
	  product *= arr[i];
	  
 }
 
// System.out.println(product); 
// product of all element leaving the "i"th element
// int arrp[]=new int[arr.length];
 
 for(int i=0;i<arr.length;i++) {
	
	 System.out.print(product/arr[i]+" ");
	 
}
 
	}

}
