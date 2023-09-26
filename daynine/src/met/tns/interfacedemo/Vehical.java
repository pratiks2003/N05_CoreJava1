package met.tns.interfacedemo;

public class Vehical implements Car , Bike {

	@Override
	public void ShowVehicalName() {
		// TODO Auto-generated method stub
		System.out.println(CarName+" "+bikeName);
	}

}
