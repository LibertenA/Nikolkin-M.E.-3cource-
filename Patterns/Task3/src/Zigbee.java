public class Zigbee extends Connection{

    public Zigbee(Device device) {
        super(device);
    }

    @Override
    public void connect() {
        System.out.println("Вы подключаетесь к Zigbee...");
        device.chooseDevice();
    }
}
