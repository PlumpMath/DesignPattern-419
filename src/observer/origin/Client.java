package observer.origin;

import org.junit.Test;

public class Client {
	
	public static void main(String[] args)
	{
		ConcreteSubject concreteSubject = new ConcreteSubject();
		
		concreteSubject.attach(new ConcreteObserver("X",concreteSubject));
		concreteSubject.attach(new ConcreteObserver("Y",concreteSubject));
		concreteSubject.attach(new ConcreteObserver("Z",concreteSubject)); // 有双向关联  
		
		concreteSubject.setSubjectState("ABC");
		concreteSubject.notifyObserver();
		
	}
	
}
