import java.util.ArrayList;
import java.util.List;

public class EvenstNotification implements Observed{
    List<String> events = new ArrayList<>();

    List<Observer> users = new ArrayList<>();

    public void add(String event) {
        this.events.add(event);
        notifyAboutEvents();
    }

    public void remove(String event) {
        this.events.remove(event);
        notifyAboutEvents();
    }

    @Override
    public void addEvent(Observer observer) {
        this.users.add(observer);
    }

    @Override
    public void removeEvent(Observer observer) {
        this.users.remove(observer);
    }

    @Override
    public void notifyAboutEvents() {
        for(Observer observer: users) {
            observer.handleEvent(this.events);
        }
    }
}
