// Класс, представляющий музыкальный трек
public class Music implements PackageMusic {
    private String name;

    public Music(String name) {
        this.name = name;
    }

    @Override
    public void addMusic() {
        // Ничего не делает, так как это конечный элемент
    }

    @Override
    public void showInfo() {
        System.out.println("Трек: " + name);
    }
}
