package abstractfactory.origin;

/**
 * 
 * 访问Department表，抽象接口类 
 * @author angelwhu
 *
 */

interface IDepartment {
	
	void insert(Department department);
	Department getDepartment(int id);
	
}
