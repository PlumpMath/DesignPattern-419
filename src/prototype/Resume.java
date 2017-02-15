package prototype;

/**
 * 
 * @author angelwhu
 * 简历类。
 * 实现Cloneable接口，即可自带拷贝。
 */
public class Resume implements Cloneable{
	
	private String name;
	private String age;
	private WorkExperience workExperience;
	
	public Resume(String name, String age, WorkExperience workExperience) {
		super();
		this.name = name;
		this.age = age;
		this.workExperience = workExperience;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public WorkExperience getWorkExperience() {
		return workExperience;
	}
	public void setWorkExperience(WorkExperience workExperience) {
		this.workExperience = workExperience;
	}
	@Override
	public String toString() {
		return "Resume [name=" + name + ", age=" + age + ", workExperience=" + workExperience + "]";
	}

	/**
	 * 简单一层的深拷贝实现。
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Resume resumeDeepClone = new Resume(this.name, this.age, (WorkExperience) workExperience.clone());//传入经过clone的workExperience。
		return resumeDeepClone;
	}
	
}
