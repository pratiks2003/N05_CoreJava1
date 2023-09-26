package dayelevenmet.tns.execeptionHandling;
// aarray out of bound exception 
public class ArrayException {

	static void display(int arr[]) {
		
		try {
//			line that causes exception
			System.out.println(arr[8]);
		
		}
		catch(Exception e) {
//			line that handles the exception 
			System.out.println(" exception is there " + e);
		}
		finally {
//			default line that will always execute if exception there or not
			System.out.println("\n finally block is always executedd");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3};

		display(arr);
	}

}
