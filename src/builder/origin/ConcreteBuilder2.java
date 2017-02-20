package builder.origin;

public class ConcreteBuilder2 extends Builder{

	private Product product;
	
	public ConcreteBuilder2() {
		// TODO Auto-generated constructor stub
		product = new Product();
	}
	
	@Override
	public void buildPartA() {
		// TODO Auto-generated method stub
		product.add("部件X");
	}

	@Override
	public void buildPartB() {
		// TODO Auto-generated method stub
		product.add("部件Y");
	}

	@Override
	public Product getResult() {
		// TODO Auto-generated method stub
		return product;
	}
	
}
