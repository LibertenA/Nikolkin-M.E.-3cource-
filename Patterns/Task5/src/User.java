import java.util.List;

public class User implements Observer{

    String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> events) {
        System.out.println(name + " вот список событий на которые вы подписаны:\n" + events + "\n");
    }
}
