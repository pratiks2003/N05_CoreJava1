package met.tns.thisKeyword;

public class ThisKeyword {

	int x,y;
	
//	we can change this parameter |
//								 V
								 
			void setData(int x , int y) {
				
//this.x represents the class variable and "x"	represent the parameter variable			
				
				this.x=x;
				this.y=y;
				
				
				
			}
			void Display() {
		
		System.out.println(x+" "+y);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ThisKeyword t = new ThisKeyword();
 
 t.setData(4, 5);
 t.Display();
		
		
		
	}

}
