package met.tns.coustomexception;
import java.util.*;
public class LoginExe {

	public static void main(String[] args) throws LoginException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String email = sc.nextLine();
		String password = sc.nextLine();
		try {
		if(email.equals("pratik@gmail.com") && password.equals("123")) {
		System.out.println(" valid credential");
		}
		else {
			throw new LoginException ("invalid data");
		}
		}
		catch(LoginException e) {
			System.out.println(e);
			
		}
		
	
}
}
