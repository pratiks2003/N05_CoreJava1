package met.tns.singleDarrays;

public class EmployeeExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee  arr [] = new Employee[2];

arr[0] = new Employee(002, "pratik", 34566.9);
arr[1]=  new Employee(003, "ritesh", 24566.9);

for(int i = 0; i<arr.length;i++) {
	System.out.println(arr[i]);
}

	}

}
