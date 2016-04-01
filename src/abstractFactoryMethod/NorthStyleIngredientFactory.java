package abstractFactoryMethod;

public class NorthStyleIngredientFactory implements RotiRollIngredientFactory{

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new WholeWheatDough();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new SpicyGreenChutney();
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new AmulCheese();
	}

	
	public Veggie[] createVeggies() {
		Veggie veggies[] = { new Tomato() , new Onion(), new Mushroom() , new Capcisum() };
		return veggies;
	}

	
	
}
