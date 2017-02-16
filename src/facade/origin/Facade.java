package facade.origin;

/**
 * 
 * @author angelwhu
 * 外观模式，外观类。提供一个简单的接口，减少子系统之间的依赖。  
 * 
 */

public class Facade {
	
	SubSystemOne subSystemOne;
	SubSystemTwo subSystemTwo;
	SubSystemThree subSystemThree;
	
	public Facade()
	{
		subSystemOne = new SubSystemOne();
		subSystemTwo = new SubSystemTwo();
		subSystemThree = new SubSystemThree();
	}

	/**
	 * 方案A
	 */
	public void methodA()
	{
		System.out.println("\n方法组A() --------- ");
		subSystemOne.methodOne();
		subSystemTwo.methodTwo();
	}
	
	/**
	 * 方案B
	 */
	public void methodB()
	{
		System.out.println("\n方法组B() --------- ");
		subSystemThree.methodThree();
		subSystemOne.methodOne();
	}
	
}
