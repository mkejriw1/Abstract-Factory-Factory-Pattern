package abstractFactoryMethod;

public abstract class RotiRollMaker {


	public RotiRoll orderRotiRoll(String item){
		RotiRoll rotiRoll =  createRotiRoll(item);
		System.out.println("--- Making a " +rotiRoll.getName() + " ---" );
		
		rotiRoll.prepare();
		rotiRoll.cut();
		rotiRoll.pack();
		return rotiRoll;
	
	}
	abstract RotiRoll createRotiRoll(String item);	
}


