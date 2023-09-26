package met.tns.coustomexception;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
public class FileNF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileInputStream f = new FileInputStream("C:\\Users\\Pratik Shinde\\Downloads\\riteshViewResult1.pdf");
	System.out.println("file there");
}
catch (FileNotFoundException e) {
	System.out.println("file not found "+e);
}

}

}
