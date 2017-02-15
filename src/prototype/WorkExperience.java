package prototype;
/**
 * 
 * @author angelwhu
 * 工作精力类，测试深拷贝
 */
public class WorkExperience implements Cloneable{

	private String workDate;
	private String company;
	
	public WorkExperience(String workDate, String company) {
		super();
		this.workDate = workDate;
		this.company = company;
	}
	
	public String getWorkDate() {
		return workDate;
	}
	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "WorkExperience [workDate=" + workDate + ", company=" + company + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
