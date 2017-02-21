package observer.delegate;

/**
 * 
 * 主题对象(被监听对象) 
 * 
 * @author angelwhu
 *
 */
public abstract class Subject {
	private EventHandler eventHandler = new EventHandler();
	
	public abstract void addListener(Object object, String methodName, Object...args);//添加需要通知对象及其方法~
	
	public abstract void notifyObserver();

	public EventHandler getEventHandler() {
		return eventHandler;
	}

	public void setEventHandler(EventHandler eventHandler) {
		this.eventHandler = eventHandler;
	}
	
}
