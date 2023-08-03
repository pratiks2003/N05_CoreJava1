package met.tns.staticKeyword;

public class Tiger extends Animal{
	

		void eat () {
			super.eat();
			System.out.println("child eat");
			
		}
		
		 static void run() {
			
//			 super.run();
			System.out.println("child run");
		}
		
		
		

	
}
