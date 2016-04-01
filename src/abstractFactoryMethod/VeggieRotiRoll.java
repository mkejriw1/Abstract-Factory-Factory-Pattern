package abstractFactoryMethod;

public class VeggieRotiRoll extends RotiRoll {

	RotiRollIngredientFactory ingredientFactory;
	public VeggieRotiRoll(RotiRollIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
	}
	
	void prepare() {
		System.out.println("Preparing " +name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	
	}



}
