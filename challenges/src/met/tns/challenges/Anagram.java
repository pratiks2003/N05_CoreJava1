package met.tns.challenges;

public class Anagram {

// selection sort	
	 void sort(int arr[]) {
		
		int n = arr.length;
		
		for(int i=0 ; i<n-1 ; i++) {
			
			int minIndex = i;
			
			for(int j=i+1 ;j<n ;j++ ){
				
				if(arr[j]<arr[i]) {
					minIndex =j;
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
				}
				
			}
			
			
		}
		
		
	}
	 void printArr(int arr[]) {
		 
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
		 }
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Anagram ob = new Anagram();
		int arr[] = {3,2,6,4,7,9,5,1,34};
		ob.sort(arr);
		ob.printArr(arr);
		 
	}

}
