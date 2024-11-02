public class Singleton {
    public static void main(String[] args) {
        ResourceManager resourceManager1 = ResourceManager.getInstance();

        resourceManager1.loadResource("image", new Object());
        resourceManager1.loadResource("font", new Object());
        resourceManager1.loadResource("sound", new Object());

        resourceManager1.loadResource("image", new Object());

        Object image = resourceManager1.getResource("image");

        Object missingResource = resourceManager1.getResource("missing.png");

        ResourceManager resourceManager2 = ResourceManager.getInstance();
        System.out.println(resourceManager1 == resourceManager2);
    }
}
