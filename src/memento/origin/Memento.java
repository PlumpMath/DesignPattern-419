package memento.origin;

/**
 * 备忘录类,用来存储状态
 * @author angelwhu
 *
 */

public class Memento {
	
	private String state;
	
	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}
