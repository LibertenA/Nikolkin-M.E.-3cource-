import java.util.ArrayList;
import java.util.List;

public class Playlist implements PackageMusic {
    private final List<PackageMusic> childrenComponents;
    private String playlistName;

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
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
        System.out.println("Плейлист: " + playlistName);
        for (PackageMusic music : childrenComponents) {
            music.showInfo();
        }
    }
}
