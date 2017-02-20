package builder.origin;

public class Client {

	public static void main(String[] args) {
		Director director = new Director();
		
		Builder b1 = new ConcreteBuilder1();
		Builder b2 = new ConcreteBuilder2();
		
		director.construct(b1);
		b1.getResult().show();
		
		director.construct(b2);
		b2.getResult().show();
	}

}
