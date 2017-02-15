package factorymethod;

public class FactoryMethodTest {
	
	public static void main(String[] args)
	{
		//Factory factory = new UndergraduateFactory();
		Factory factory = new VolunteerFactory();
		LeiFeng leiFeng = factory.createLeifeng();
		
		leiFeng.sweep();
		leiFeng.wash();
		leiFeng.buyRice();
		
	}

}
