package abstractFactoryMethod;

public class CheeseRotiRoll extends RotiRoll {
	RotiRollIngredientFactory ingredientFactory;
	public CheeseRotiRoll(RotiRollIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
	}
	
	void prepare() {
		System.out.println("Preparing " +name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	
	}

}
