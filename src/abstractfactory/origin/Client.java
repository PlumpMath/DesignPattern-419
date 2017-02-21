package abstractfactory.origin;

public class Client {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		User user = new User();
		Department department = new Department();
		
		IUser iUser = DataAccess.createUser();
		iUser.insert(user);
		iUser.getUser(1);
		
		IDepartment iDepartment = DataAccess.createDepartment();
		iDepartment.insert(department);
		iDepartment.getDepartment(1);
		
	}

}
