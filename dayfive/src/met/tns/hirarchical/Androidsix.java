package met.tns.hirarchical;

public class Androidsix extends Android{

	private int version;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Androidsix(String brandType, String slotType,int version) {
		super(brandType, slotType);
		
		this.version=version;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Androidsix [version=" + version + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
