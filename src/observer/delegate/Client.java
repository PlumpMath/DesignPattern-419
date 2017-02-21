package observer.delegate;

import java.util.Date;

import org.junit.Test;

public class Client {
	
	@Test
	public void delegateObserverTest()
	{
		ConcreteSubject subject = new ConcreteSubject();
		ConcreteObserver1 observer1 = new ConcreteObserver1();
		ConcreteObserver2 observer2 = new ConcreteObserver2();
		
		subject.addListener(observer1, "stopWatchTV", new Date());
		subject.addListener(observer2, "stopPlayGame", new Date());     //使用字符串进行解耦合。
		
		subject.notifyObserver();
	}

}
