package met.tns.superKeyword;

class nationName {
	
	String name ;

	public nationName(String name) {
		super();
		this.name = name;
		System.out.println(name);
	}
	
}

class person extends nationName{
	
	String language;

	public person(String name,String language) {
		super(name);
		System.out.println(language);
		// TODO Auto-generated constructor stub
	}
	
	
	
}


public class SuperConstructor {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p = new person("germany","german");
	}

}
