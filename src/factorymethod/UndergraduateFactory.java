package factorymethod;

/**
 * 
 * @author angelwhu
 * 大学生工厂类
 */
public class UndergraduateFactory implements Factory{

	@Override
	public LeiFeng createLeifeng() {
		// TODO Auto-generated method stub
		return new Undergraduate();
	}

}
