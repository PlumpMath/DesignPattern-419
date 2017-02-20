package builder.origin;
/**
 * 建造者类。  
 * 指定建造步骤的抽象方法。具体实现在子类。
 * @author angelwhu
 *
 */
public abstract class Builder {
	public abstract void buildPartA();
	public abstract void buildPartB();
	public abstract Product getResult();
}
