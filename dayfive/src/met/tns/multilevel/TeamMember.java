package met.tns.multilevel;

public class TeamMember extends TeamLead {

	private int size;
	private int duration;
	
	public TeamMember(int size, int duration) {
		super();
		
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}

	public TeamMember() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TeamMember(String deptName, String name, int empid, String leadName, int empId2, String projectName, int size,int duration) {
		super(deptName, name, empid, leadName, empId2, projectName);
		// TODO Auto-generated constructor stub
		this.size = size;
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "TeamMember [size=" + size + ", duration=" + duration + ", toString()=" + super.toString() + "]";
	}
	
	
}
