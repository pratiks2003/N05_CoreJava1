package met.tns.superKeyword;


class state {
	
	String statename="goa";
	String capital="panji";
}
class capital extends state{
	
	String statename="punjab";
	String capital="chandigarh";
	
	void display() {
		System.out.println(statename);
		System.out.println(super.statename);
	}
}


public class SuperVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		capital c = new capital();
		c.display();
		;
	}

}
