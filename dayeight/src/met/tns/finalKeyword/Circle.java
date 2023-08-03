package met.tns.finalKeyword;

public class Circle extends Shape{

	final float AREA = 32.7f;
	
//	cannot override final method
//	final void printShape() {
//		
//		System.out.println(SHAPENAME);
//	}
	
	void display() {
		super.printShape();
		System.out.println(AREA+"sq.cm");
	}
	
}
