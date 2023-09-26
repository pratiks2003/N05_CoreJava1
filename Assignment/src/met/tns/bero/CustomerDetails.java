package met.tns.bero;


 class CustomerDetails {

private     String customerName ;
private 	long phoneNo;
private 	String adress ;
	
public CustomerDetails(String name , long number ,String adress){
	this.customerName = name;
	this.phoneNo = number; 
	this.adress=adress;
}

public String getCustomerName() {
	return customerName;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public long getPhoneNo() {
	return phoneNo;
}

public void setPhoneNo(long phoneNo) {
	this.phoneNo = phoneNo;
}

public String getAdress() {
	return adress;
}

public void setAdress(String adress) {
	this.adress = adress;
}

@Override
public String toString() {
	return "CustomerDetails [customerName=" + customerName + ", phoneNo=" + phoneNo + ", adress=" + adress + "]";
}

}
