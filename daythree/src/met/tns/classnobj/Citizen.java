package met.tns.classnobj;

public class Citizen {

	String citizenType;
	long adharcard;
	String gender;
	String city;
	
	public Citizen() {
		System.out.println("demonstraion of default constructor");
	}

	public Citizen(String citizenType, long adharcard, String gender, String city) {
		super();
		this.citizenType = citizenType;
		this.adharcard = adharcard;
		this.gender = gender;
		this.city = city;
		
		
	}

	@Override
	public String toString() {
		return "Citizen [citizenType=" + citizenType + ", adharcard=" + adharcard + ", gender=" + gender + ", city="
				+ city + "]";
	}
	
	
	
}
