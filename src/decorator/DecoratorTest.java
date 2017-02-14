package decorator;

public class DecoratorTest {
	
	public static void main(String[] args)
	{
		Person person = new Person("小菜");
		BigTrouser bigTrouser = new BigTrouser();
		Shoes shoes = new Shoes();
		TShirt tShirt = new TShirt();
		TShirt tShirt2 = new TShirt();
		Shoes shoes2 = new Shoes();
		
		tShirt.decorate(person);
		shoes.decorate(tShirt);
		bigTrouser.decorate(shoes);
		tShirt2.decorate(bigTrouser);
		shoes2.decorate(tShirt2);
		
		shoes2.show();
	}
}
