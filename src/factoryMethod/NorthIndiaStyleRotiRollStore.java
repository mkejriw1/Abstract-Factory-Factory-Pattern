package factoryMethod;

public class NorthIndiaStyleRotiRollStore extends RotiRollMaker {

	@Override
	RotiRoll createRotiRoll(String item) {
		if (item.equals("veggie")) {
			return new NorthIndiaStyleVeggieRotiRoll();
		}
		else if (item.equals("cheese")) {
			return new NorthIndiaStyleCheeseRotiRoll();
		}
		else if (item.equals("chicken")) {
			return new NorthIndiaStyleChickenRotiRoll();
		}
		
		else return null;
		// TODO Auto-generated method stub

	}

}
