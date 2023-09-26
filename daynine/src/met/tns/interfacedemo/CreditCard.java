package met.tns.interfacedemo;

public interface CreditCard {

	//variable by default final in interface keyword 
	
	 long cardNo = 2322424242l;
//	we cannot use concrete method inside the inteface so it is by default abstract 
	 
	
	 void diaplayi();

default void display() {
	System.out.println(" default ");
};

static void displayii() {
	System.out.println("static");
	
};

}
