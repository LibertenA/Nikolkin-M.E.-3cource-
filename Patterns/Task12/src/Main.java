public class Main {
    public static void main(String[] args) {

        Music track1 = new Music("Hero");
        Music track2 = new Music("Crazy On You");
        Music track3 = new Music("Кошкодевочка с лазганом");


        Album album = new Album("Skillet Vol.1");
        album.add(track1);
        album.add(track2);


        Playlist playlist = new Playlist("Плейлист Для Настоящих Людей");
        playlist.add(track3);
        playlist.add(album);


        album.showInfo();
    }
}