package met.tns.thisKeyword;

public class ThisKeywordConstructor {

	int x ,y ;
	
	public ThisKeywordConstructor(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x=x;
		this.y=y;
		
		
	}
void display() {
	
	System.out.println(x+" "+y);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeywordConstructor t = new ThisKeywordConstructor(2,2);
		t.display();
		
		
	}

}
