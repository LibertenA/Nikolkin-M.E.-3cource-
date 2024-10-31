public class DeleveryPizzaFactory implements PizzaFactory {
    public MeatProduct addMeat() {
        return new MeatPizza();
    }
    public SeaProduct addSea() {
        return new SeaPizza();
    }
    public VegetProduct addVegeteables() {
        return new VegetPizza();
    }
}

