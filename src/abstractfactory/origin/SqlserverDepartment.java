package abstractfactory.origin;

public class SqlserverDepartment implements IDepartment{

	@Override
	public void insert(Department department) {
		// TODO Auto-generated method stub
		System.out.println("sqlserver 在department表增加了一条记录~");
	}

	@Override
	public Department getDepartment(int id) {
		// TODO Auto-generated method stub
		System.out.println("sqlserver 根据ID在Department表中获取一条记录");
		return null;
	}
	
}
