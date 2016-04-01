package abstractFactoryMethod;

public class SouthStyleIngredientFactory implements RotiRollIngredientFactory{

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new RiceDough();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new CoconutChutney();
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new GariCheese();
	}
	public Veggie[] createVeggies() {
		Veggie veggies[] = { new Coconut() , new Onion(), new Mushroom() , new Capcisum() };
		return veggies;
	}

	

}
