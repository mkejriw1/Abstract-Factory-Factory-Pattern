package abstractFactoryMethod;

public class NorthIndianStyleRotiRoll extends RotiRollMaker {
	protected RotiRoll createRotiRoll(String item) {
		RotiRoll rotiroll = null;
		RotiRollIngredientFactory ingredientFactory = new NorthStyleIngredientFactory();
		if (item.equals("cheese")){
			rotiroll = new CheeseRotiRoll(ingredientFactory);
			rotiroll.setName("NorthIndian style cheese Roti Roll");	
		}
		else if (item.equals("veggie")){
			rotiroll = new VeggieRotiRoll(ingredientFactory);
			rotiroll.setName("NorthIndian style veggie Roti Roll");	
		}
		else if (item.equals("chicken")){
			rotiroll = new ChickenRotiRoll(ingredientFactory);
			rotiroll.setName("NorthIndian style chicken Roti Roll");	
		}	
		return rotiroll;
	}

	
}
