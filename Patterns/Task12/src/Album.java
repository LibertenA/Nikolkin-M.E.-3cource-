import java.util.ArrayList;
import java.util.List;

public class Album implements PackageMusic {
    private final List<PackageMusic> childrenComponents;
    private String albumName;

    public Album(String albumName) {
        this.albumName = albumName;
        this.childrenComponents = new ArrayList<>();
    }

    public void add(PackageMusic packageMusic) {
        childrenComponents.add(packageMusic);
    }

    public void remove(PackageMusic packageMusic) {
        childrenComponents.remove(packageMusic);
    }

    @Override
    public void addMusic() {
        for (PackageMusic music : childrenComponents) {
            music.addMusic();
        }
    }

    @Override
    public void showInfo() {
        System.out.println("Альбом: " + albumName);
        for (PackageMusic music : childrenComponents) {
            music.showInfo();
        }
    }
}
