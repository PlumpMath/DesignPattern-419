package builder.origin;

public class ConcreteBuilder1 extends Builder{

	private Product product;
	
	public ConcreteBuilder1() {
		// TODO Auto-generated constructor stub
		product = new Product();
	}
	
	@Override
	public void buildPartA() {
		// TODO Auto-generated method stub
		product.add("部件A");
	}

	@Override
	public void buildPartB() {
		// TODO Auto-generated method stub
		product.add("部件B");
	}

	@Override
	public Product getResult() {
		// TODO Auto-generated method stub
		return product;
	}
	
}
