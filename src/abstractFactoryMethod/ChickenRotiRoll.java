package abstractFactoryMethod;

public class ChickenRotiRoll extends RotiRoll {

	RotiRollIngredientFactory ingredientFactory;
	public ChickenRotiRoll(RotiRollIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
	}
	
	void prepare() {
		System.out.println("Preparing " +name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	
	}


}
