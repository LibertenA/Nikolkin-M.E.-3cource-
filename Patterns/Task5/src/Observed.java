public interface Observed {
    public void addEvent(Observer observer);

    public void removeEvent(Observer observer);

    public void notifyAboutEvents();
}
