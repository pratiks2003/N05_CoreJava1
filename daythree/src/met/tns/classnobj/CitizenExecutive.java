package met.tns.classnobj;

public class CitizenExecutive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Citizen c = new Citizen();
		 c.citizenType="old";
		 c.adharcard=78979677596l;
		 c.gender="male";
		 c.city="nashik";
		 
		 Citizen c1= new Citizen("adult",787676879l,"male","nashik");
		 
		 System.out.println(c1);
	}

}
