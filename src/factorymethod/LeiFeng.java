package factorymethod;

/**
 * 
 * @author angelwhu
 * 雷锋类
 *
 */
public class LeiFeng {
	
	private String name;
	
	public void sweep()
	{
		System.out.println(name + "扫地");
	}

	public void wash()
	{
		System.out.println(name + "洗衣服");
	}
	
	public void buyRice()
	{
		System.out.println(name + "买米");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
