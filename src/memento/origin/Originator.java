package memento.origin;

/**
 * 需要存储状态的发起者
 * @author angelwhu
 *
 */
public class Originator {
	
	private String state;
	
	public Originator(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Memento createMemento()  //只创建备忘录，而不存储
	{
		return new Memento(state);
	}
	
	public void setMemento(Memento memento)  //使用备忘录恢复状态  
	{
		this.state = memento.getState();
	}
	
	public void show()  //显示自己的状态  
	{
		System.out.println("State=" + state);
	}
}
