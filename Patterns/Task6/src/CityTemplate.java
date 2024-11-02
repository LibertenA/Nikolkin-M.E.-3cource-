public abstract class CityTemplate {
    public void build() {
        System.out.println("Создаем планировку...");
        System.out.println("Проводим подготовку...");
        buildSomething();
    }

    public abstract void buildSomething();
}
