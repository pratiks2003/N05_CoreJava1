package met.tns.thisKeyword;

public class ThisKeywordMethod {

//	non-parameter get meter
//	to overcome that we use this keyword
	
	void print(ThisKeywordMethod  t) {
		
		System.out.println("this is invoke by using display");
	}
	void display() {
		
		print(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeywordMethod  t = new ThisKeywordMethod();
		
		t.display();
	}

}
