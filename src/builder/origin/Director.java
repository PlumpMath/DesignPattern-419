package builder.origin;
/**
 * 指挥类，
 * 用于指挥对象的构建过程。
 * @author angelwhu
 *
 */
public class Director {
	
	public void construct(Builder builder)
	{
		builder.buildPartA();
		builder.buildPartB();
	}

}
