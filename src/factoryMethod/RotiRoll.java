package factoryMethod;

import java.util.ArrayList;

public abstract class RotiRoll {

	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>();
	

	void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing "+ dough + "      " );
		System.out.println("Flattening Dough .... ");
		System.out.println("Grilling the flattened dough for 6 minutes !");
		System.out.println("Adding Toppings... ");
		for (String topping : toppings) {
			System.out.println(" " + topping);
		}
		System.out.println("Adding "+sauce+ " to enhance taste");
	}
	void cut() {
		System.out.println( "Cutting the RotiRoll in two halves ");
	}
	void pack() {
		System.out.println("Placing RotiRoll in official RotiKitchen bag with extra sauce & yoghurt");
	}
	public String getName(){
		return name;
	}

}
