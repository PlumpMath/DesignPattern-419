package proxy;

/**
 * 
 * @author angelwhu
 * 追求者类，realSubject
 */

public class Pursuit implements GiveGiftInterface{

	private SchoolGirl mm;
			
	public Pursuit(SchoolGirl schoolGirl) {
		// TODO Auto-generated constructor stub
		this.mm = schoolGirl;
	}
	
	@Override
	public void giveDolls() {
		// TODO Auto-generated method stub
		System.out.println(mm.getName() + " 送你洋娃娃");
	}

	@Override
	public void giveFlowers() {
		// TODO Auto-generated method stub
		System.out.println(mm.getName() + " 送你鲜花");
	}

	@Override
	public void giveChocolate() {
		// TODO Auto-generated method stub
		System.out.println(mm.getName() + " 送你巧克力");
	}
	
}
