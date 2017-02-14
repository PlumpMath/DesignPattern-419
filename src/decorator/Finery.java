package decorator;

/**
 * 
 * @author angelwhu
 * 服饰类，装饰模式的Decorator类
 */
public class Finery extends Person{
	
	private Person component;
	
	public Finery() 
	{
		
	}
	
	public void decorate(Person component)
	{
		this.component = component;
	}
	
	@Override
	public void show()
	{
		if(component != null)
		{
			component.show();
		}
	}
	
	

}
