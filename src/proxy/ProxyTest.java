package proxy;

public class ProxyTest {
	
	public static void main(String[] args)
	{
		SchoolGirl schoolGirl = new SchoolGirl();
		schoolGirl.setName("小美");
		
		Proxy proxy = new Proxy(schoolGirl);
		
		proxy.giveDolls();
		proxy.giveFlowers();
		proxy.giveChocolate();
		
	}

}
