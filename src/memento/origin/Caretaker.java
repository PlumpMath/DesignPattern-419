package memento.origin;

/**
 * 管理备忘录 类
 * 用来专门存储和管理备忘录  
 * @author angelwhu
 *
 */

public class Caretaker {  
	
	public Caretaker()
	{
		
	}
	
	public Caretaker(Memento memento) {
		this.memento = memento;
	}

	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
	
}
