package prototype;

public class PrototypeTest {
	
	public static void main(String[] args) throws CloneNotSupportedException
	{
		WorkExperience workExperience1 = new WorkExperience("1998-2000","XX公司");
		Resume resume1 = new Resume("大鸟", "25", workExperience1);
		
		Resume resume2 = (Resume) resume1.clone();
		System.out.println(resume2);
		resume2.getWorkExperience().setCompany("YY公司");
		resume2.getWorkExperience().setWorkDate("1997-1998");
		
		System.out.println(resume1);
		System.out.println(resume2);
		
	}
	
}
