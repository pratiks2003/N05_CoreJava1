package met.tns.thisKeyword;

public class ThisKeywordConstructor2 {
		int x ,y;

	 ThisKeywordConstructor2() {
		 this(19);
		 System.out.println("default construcotr");
		
	}
	  ThisKeywordConstructor2(int x ) {
		
		System.out.println("parameterize construcotr "+x);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ThisKeywordConstructor2 t = new  ThisKeywordConstructor2(); 
	}

}
