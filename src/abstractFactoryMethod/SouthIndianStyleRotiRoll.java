package abstractFactoryMethod;

public class SouthIndianStyleRotiRoll extends RotiRollMaker {
	protected RotiRoll createRotiRoll(String item) {
		RotiRoll rotiroll = null;
		RotiRollIngredientFactory ingredientFactory = new SouthStyleIngredientFactory();
		if (item.equals("cheese")){
			rotiroll = new CheeseRotiRoll(ingredientFactory);
			rotiroll.setName("SouthIndian style cheese Roti Roll");	
		}
		else if (item.equals("veggie")){
			rotiroll = new VeggieRotiRoll(ingredientFactory);
			rotiroll.setName("SouthIndian style veggie Roti Roll");	
		}
		else if (item.equals("chicken")){
			rotiroll = new ChickenRotiRoll(ingredientFactory);
			rotiroll.setName("SouthIndian style chicken Roti Roll");	
		}	
		return rotiroll;
	}
}
