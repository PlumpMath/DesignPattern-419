package observer.delegate;

import java.util.Date;

public class ConcreteObserver2 extends Observer{
	
	public void stopPlayGame(Date date)
	{
		System.out.println("stop play game~ " + date);
	}
	
}
