package adapter.origin;

/**
 * 
 * 通过在内部包装一个Adaptee对象，把源接口转换成目标接口。
 * 
 * @author angelwhu
 *
 */

public class Adapter extends Target{

	private Adaptee adaptee = new Adaptee();
	
	@Override
	public void request() {
		// TODO Auto-generated method stub
		adaptee.specificRequest();
	}
	
}

