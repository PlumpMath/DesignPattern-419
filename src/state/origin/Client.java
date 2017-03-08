package state.origin;

public class Client {
	
	public static void main(String[] args)
	{
		Context context = new Context(new ConcreteStateA());
		context.request();
		context.request();
		context.request();
		context.request();
		context.request();
	}

}
