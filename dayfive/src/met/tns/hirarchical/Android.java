package met.tns.hirarchical;

public class Android {

	private String brandType ;
	private String slotType;
	public String getBrandType() {
		return brandType;
	}
	public void setBrandType(String brandType) {
		this.brandType = brandType;
	}
	public String getSlotType() {
		return slotType;
	}
	public void setSlotType(String slotType) {
		this.slotType = slotType;
	}
	
	public Android(String brandType, String slotType) {
		super();
		this.brandType = brandType;
		this.slotType = slotType;
	}
	
	@Override
	public String toString() {
		return "Android [brandType=" + brandType + ", slotType=" + slotType + "]";
	}
	
	
	
	
	
}
