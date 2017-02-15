package factorymethod;

/**
 * 
 * @author angelwhu
 * 志愿者工厂类
 */
public class VolunteerFactory implements Factory{

	@Override
	public LeiFeng createLeifeng() {
		// TODO Auto-generated method stub
		return new Volunteer();
	}

}
