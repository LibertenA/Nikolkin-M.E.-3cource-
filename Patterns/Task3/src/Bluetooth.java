public class Bluetooth  extends Connection{

    public Bluetooth(Device device) {
        super(device);
    }

    @Override
    public void connect() {
        System.out.println("Вы подключаетесь к Bluetooth...");
        device.chooseDevice();
    }
}
