package dayelevenmet.tns.execeptionHandling;

import java.io.IOException;

public class ThrowException {

	static void elegible(int age ,int weight)throws IOException {
		
		if(age>18 && weight>50) {
			
			System.out.println("elegible");
			
		}
		else
		{
			throw new IOException(" dont fit the critiria");
			
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		elegible(3,52);
	}

}
