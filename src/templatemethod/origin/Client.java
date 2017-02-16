package templatemethod.origin;

public class Client {
	public static void main(String[] args)
	{
		AbstractClass abstractClass1 = new ConcreteClassA();
		abstractClass1.templateMethod();
		
		AbstractClass abstractClass2 = new ConcreteClassB();
		abstractClass2.templateMethod();
		
	}
}
