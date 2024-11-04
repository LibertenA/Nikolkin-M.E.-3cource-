import java.util.Random;

class RandomMapGenerator {
    private static final String[] SAMPLE_TERRAINS = {
            "Джунгли", "Холмы", "Саввана", "Водоем", "Пустыня", "Деревня"
    };

    public static WorldMap generateRandomMap(WorldMap prototype) {
        Random random = new Random();
        WorldMap newMap = (WorldMap) prototype.cloneDocument();

        int numberOfTerrains = random.nextInt(3) + 3; // От 3 до 5 типов местности
        for (int i = 0; i < numberOfTerrains; i++) {
            String randomTerrain = SAMPLE_TERRAINS[random.nextInt(SAMPLE_TERRAINS.length)];
            newMap.addTerrain(randomTerrain);
        }

        return newMap;
    }

    public static void main(String[] args) {
        WorldMap prototype = new WorldMap(1);
        System.out.println("Исходная карта: " + prototype);

        WorldMap map1 = generateRandomMap(prototype);
        System.out.println("Карта уровня 1: " + map1);

        WorldMap prototype1 = new WorldMap(2);
        WorldMap map2 = generateRandomMap(prototype1);
        System.out.println("Карта уровня 2: " + map2);

        WorldMap map3 = generateRandomMap(prototype1);
        System.out.println("Карта уровня 3: " + map3);
    }
}
