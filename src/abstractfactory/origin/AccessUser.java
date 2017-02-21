package abstractfactory.origin;

public class AccessUser implements IUser{

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("access 在user表增加了一条记录~");
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("access 根据ID在user表中获取一条记录");
		return null;
	}
	
}
