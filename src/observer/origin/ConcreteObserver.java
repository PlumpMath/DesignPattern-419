package observer.origin;

public class ConcreteObserver extends Observer{

	private String name;
	private String observerState;
	private ConcreteSubject subject;
	
	public ConcreteObserver(String name, ConcreteSubject subject) {
		super();
		this.name = name;
		this.subject = subject;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		observerState = subject.getSubjectState();
		System.out.println("观察者" + name + "状态是" + observerState);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getObserverState() {
		return observerState;
	}

	public void setObserverState(String observerState) {
		this.observerState = observerState;
	}

	public ConcreteSubject getSubject() {
		return subject;
	}

	public void setSubject(ConcreteSubject subject) {
		this.subject = subject;
	}
	
}
