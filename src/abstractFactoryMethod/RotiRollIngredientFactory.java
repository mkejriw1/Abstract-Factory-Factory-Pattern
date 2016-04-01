package abstractFactoryMethod;

public interface RotiRollIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggie[] createVeggies();
   
}
