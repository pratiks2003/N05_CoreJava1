package met.tns.encapsulation;

public class EncapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hdfc h = new Hdfc();
//		setting values using setter
		
		h.setAccNO(23123123);
		h.setAccType("ca");
		h.setCvvNo(233);
		h.setPinNo(2323);
		
// getting values using geter
		
		System.out.println(h.getAccNO());
		System.out.println(h.getAccType());
		System.out.println(h.getCvvNo());
		System.out.println(h.getPinNo());
		
	}

}
