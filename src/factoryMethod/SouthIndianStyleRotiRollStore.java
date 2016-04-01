package factoryMethod;

public class SouthIndianStyleRotiRollStore extends RotiRollMaker {

	@Override
	RotiRoll createRotiRoll(String item) {
		if (item.equals("veggie")) {
			return new SouthIndianStyleVeggieRotiRoll();
		}
		else if (item.equals("cheese")) {
			return new SouthIndianStyleCheeseRotiRoll();
		}
		else if (item.equals("chicken")) {
			return new SouthIndianStyleChickenRotiRoll();
		}
		
		else return null;
		
	}

}
