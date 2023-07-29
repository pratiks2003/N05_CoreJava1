// program to demonstrate encapsulation 
// use for hiding data use private access specifier

package met.tns.encapsulation;

public class Hdfc {

	private long accNO ;
	private int cvvNo;
	private String accType;
	private int pinNo;
	
	
//	getter is used to return the value 
//	setter is used to set the value
	
	public long getAccNO() {
		return accNO;
	}
	public void setAccNO(long accNO) {
		this.accNO = accNO;
	}
	public int getCvvNo() {
		return cvvNo;
	}
	public void setCvvNo(int cvvNo) {
		this.cvvNo = cvvNo;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	
	
	
	
	
	
}
