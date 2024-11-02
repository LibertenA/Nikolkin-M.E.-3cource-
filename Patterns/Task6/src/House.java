public class House extends CityTemplate {
    @Override
    public void buildSomething() {
        System.out.println("Возводим стены...");
        System.out.println("Добавлем разные атрибуты дома...");
        System.out.println("Дом построен!");
    }

   /* public void build() {
        System.out.println("Создаем планировку...");
        System.out.println("Проводим подготовку...");
        System.out.println("Возводим стены...");
        System.out.println("Добавлем разные атрибуты дома...");
        System.out.println("Дом построен!");
    }*/
}
