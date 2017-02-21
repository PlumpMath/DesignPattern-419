package observer.origin;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 主题对象(被监听对象) 
 * 
 * @author angelwhu
 *
 */
public class Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	
	public void attach(Observer observer) // 增加观察者 
	{
		observers.add(observer);
	}
	
	public void dettach(Observer observer)
	{
		observers.remove(observer);
	}
	
	public void notifyObserver()
	{
		for(Observer observer : observers)
		{
			observer.update();
		}
	}
}
