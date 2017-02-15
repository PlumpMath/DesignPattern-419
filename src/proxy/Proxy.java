package proxy;

/**
 * 
 * @author angelwhu
 * 代理类，代理realSubject。
 * 保存一个引用使得代理可以访问实体。这样代理就可以替代实体了。
 * 
 */

public class Proxy implements GiveGiftInterface{
	
	private Pursuit pursuit;
	
	public Proxy(SchoolGirl schoolGirl) {
		// TODO Auto-generated constructor stub
		this.pursuit = new Pursuit(schoolGirl);
	}
	
	@Override
	public void giveDolls() {
		// TODO Auto-generated method stub
		pursuit.giveDolls();
	}

	@Override
	public void giveFlowers() {
		// TODO Auto-generated method stub
		pursuit.giveFlowers();
	}

	@Override
	public void giveChocolate() {
		// TODO Auto-generated method stub
		pursuit.giveChocolate();
	}
	
}
