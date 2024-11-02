public class CalendarApp {
    public static void main(String[] args) {
        EvenstNotification notification = new EvenstNotification();

        notification.add("8 марта - Международный женский день");
        notification.add("9 мая - День Победы");

        Observer firstUser = new User("Mike");
        Observer secondUser = new User("notMike");

        notification.addEvent(firstUser);

        notification.add("13 сентября - День программиста");

        notification.remove("9 мая - День Победы");
    }
}