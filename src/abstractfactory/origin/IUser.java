package abstractfactory.origin;
/**
 * 访问user表  抽象接口 
 * @author angelwhu
 *
 */
interface IUser {
	void insert(User user);
	User getUser(int id);
}
