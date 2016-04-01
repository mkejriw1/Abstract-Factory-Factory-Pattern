package abstractFactoryMethod;

public abstract class RotiRoll {
		String name;
		
		Dough dough;
		Sauce sauce;
		Veggie veggies[];
		Cheese cheese;
		
		abstract void prepare();
		
		void cut() {
			System.out.println( "Cutting the  " +name+ "in two halves ");
		}
		void pack() {
			System.out.println("Placing " +name+ " in official RotiKitchen bag with extra sauce & yoghurt");
		}
		void setName(String name){
			this.name = name;	
		}
		public String getName(){
			return name;
		}
		public String toString() {
			StringBuffer result = new StringBuffer();
			
			if (dough != null) {
				result.append(dough);
				result.append("\n");
			}
			if (sauce != null) {
				result.append(sauce);
				result.append("\n");
			}
			if (cheese != null) {
				result.append(cheese);
				result.append("\n");
			}
			if (veggies != null) {
				for (int i = 0; i < veggies.length; i++) {
					result.append(veggies[i]);
					if (i < veggies.length-1) {
						result.append(", ");
					}
				}
				result.append("\n");
			}
			
			return result.toString();
		}
		
		
		
		
		
}
