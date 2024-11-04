import java.util.ArrayList;
import java.util.List;

class WorldMap implements DocumentPrototype {
    private List<String> terrainTypes;
    private int levelNumber;

    public WorldMap(int levelNumber) {
        this.levelNumber = levelNumber;
        this.terrainTypes = new ArrayList<>();
    }

    public void addTerrain(String terrain) {
        terrainTypes.add(terrain);
    }

    public List<String> getTerrainTypes() {
        return terrainTypes;
    }

    public int getLevelNumber() {
        return levelNumber;
    }

    @Override
    public DocumentPrototype cloneDocument() {
        WorldMap clonedMap = new WorldMap(this.levelNumber);
        clonedMap.terrainTypes.addAll(this.terrainTypes);
        return clonedMap;
    }

    @Override
    public String toString() {
        return "Карта Мира {" +
                "уровень = " + levelNumber +
                ", Виды местности = " + terrainTypes +
                '}';
    }
}

