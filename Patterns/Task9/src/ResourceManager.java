import java.util.HashMap;
import java.util.Map;

class ResourceManager {
    private static ResourceManager instance;
    private final Map<String, Object> resourceCache;

    private ResourceManager() {
        resourceCache = new HashMap<>();
    }

    public static ResourceManager getInstance() {
        if (instance == null) {
            instance = new ResourceManager();
        }
        return instance;
    }

    public void loadResource(String resourceName, Object resource) {
        if (!resourceCache.containsKey(resourceName)) {
            resourceCache.put(resourceName, resource);
            System.out.println("Ресурс загружен: " + resourceName);
        } else {
            System.out.println("Ресурс уже в кэше: " + resourceName);
        }
    }

    public Object getResource(String resourceName) {
        if (resourceCache.containsKey(resourceName)) {
            System.out.println("Ресурс получен из кэша: " + resourceName);
            return resourceCache.get(resourceName);
        } else {
            System.out.println("Ресурс не найден в кэше: " + resourceName);
            return null;
        }
    }
}

