package met.tns.multilevel;

public class TeamLead extends Manager {

	private String leadName;
	private int empId;
	private String projectName;
	
	public TeamLead() {
		super();
	}
	
	
	public String getLeadName() {
		return leadName;
	}

	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}

	public int getEmpid() {
		return empId;
	}

	public void setEmpid(int empid) {
		this.empId = empid;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	public TeamLead(String deptName, String name, int empid,String leadName, int empId ,String projectName) {
		super(deptName, name, empId);
		// TODO Auto-generated constructor stub
		this.empId=empId;
		this.leadName=leadName;
		this.projectName=projectName;
		
	}


	@Override
	public String toString() {
		return "TeamLead [leadName=" + leadName + ", empId=" + empId + ", projectName=" + projectName + ", toString()="
				+ super.toString() + "]";
	}
	
	
//	parametarize constructor

	
	
	
	
	
}
