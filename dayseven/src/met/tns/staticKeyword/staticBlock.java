package met.tns.staticKeyword;

public class staticBlock {

	static float salary ;
	String companyName;
	
	static {
//		companyName= "accenture";
		salary = 23234;
		
	}
	static void print() {
		System.out.println(salary);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();
	}

}
