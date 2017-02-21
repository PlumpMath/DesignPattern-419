package observer.delegate;

import java.util.Date;

public class ConcreteObserver1 extends Observer{
	
	public void stopWatchTV(Date date)
	{
		System.out.println("stop watch tv~ " + date);
	}
	
}
