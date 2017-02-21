package abstractfactory.origin;


/**
 * 
 * 利用反射机制 确定db类
 * 
 * @author angelwhu
 *
 */
public class DataAccess {
	//private final static String db = "Sqlserver";
	private final static String db = "Access";
	
	private final static String packageName = "abstractfactory.origin";
	
	public static IUser createUser() throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		String className = packageName + "." + db + "User";
		return (IUser)Class.forName(className).newInstance();
	}
	
	public static IDepartment createDepartment() throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		String className = packageName + "." + db + "Department";
		return (IDepartment)Class.forName(className).newInstance();
	}
	
}
