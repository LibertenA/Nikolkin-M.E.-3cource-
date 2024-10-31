public class DeliveryApp {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new DeleveryPizzaFactory();
        MeatProduct meatPizza = pizzaFactory.addMeat();
        SeaProduct seaPizza = pizzaFactory.addSea();
        VegetProduct vegetPizza = pizzaFactory.addVegeteables();

        System.out.println("Выбираем пиццу...");
        meatPizza.cooked();
        seaPizza.cooked();
        vegetPizza.cooked();
    }
}
