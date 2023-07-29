package met.tns.hirarchical;

public class Androidten extends Android {

	private int Version ;

	public int getVersion() {
		return Version;
	}

	public void setVersion(int version) {
		Version = Version;
	}

	public Androidten(String brandType, String slotType,int Version) {
		
		super(brandType, slotType);
		this.Version=Version;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Androidten [Version=" + Version + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
