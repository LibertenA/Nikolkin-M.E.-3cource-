public class WIFI extends Connection{

    public WIFI(Device device) {
        super(device);
    }

    @Override
    public void connect() {
        System.out.println("Вы подключаетесь к WiFi...");
        device.chooseDevice();
    }
}
