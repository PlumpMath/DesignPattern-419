package observer.delegate;

public class ConcreteSubject extends Subject{

	@Override
	public void addListener(Object object, String methodName, Object... args) {
		// TODO Auto-generated method stub
		System.out.println("添加观察者");
		this.getEventHandler().addEvent(object, methodName, args);
	}
	
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		System.out.println("通知观察者");
		try {
			this.getEventHandler().notifyX();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
