package templatemethod.origin;

public abstract class AbstractClass {
	
	/**
	 * 具体步骤，使用抽象方法定义。由子类去实现。
	 */
	public abstract void primitiveOperation1(); //原始操作1
	public abstract void primitiveOperation2(); //原始操作2
	
	public void templateMethod()
	{
		System.out.println("start");
		primitiveOperation1();
		primitiveOperation2();
		System.out.println("end");
	}
}
