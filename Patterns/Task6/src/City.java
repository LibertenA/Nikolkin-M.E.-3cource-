public class City {
    public static void main(String[] args) {
        CityTemplate house =  new House();
        CityTemplate road =  new Road();
        CityTemplate mall =  new Mall();

        house.build();
        road.build();
        mall.build();
    }
}