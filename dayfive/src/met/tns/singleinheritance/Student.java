package met.tns.singleinheritance;

public class Student extends Citizen {
	
	private int rollNo;
	private String collegeName;
	
	public Student(String string, int i, long l, long m, String string2, int j) {
		super();
		System.out.println("child class default constructor");	
}
	
	
	public Student(String city, int pinCode, long aadharNo, long contactNo, int rollNo, String collegeName) {
		
		super(city, pinCode, aadharNo, contactNo);
		// TODO Auto-generated constructor stub
		this.collegeName=collegeName;
		this.rollNo=rollNo;
		
		
		
	}


	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getCollegeName() {
		return collegeName;
	}


	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", toString()=" + super.toString() + "]";
	}


	
	
	

}
