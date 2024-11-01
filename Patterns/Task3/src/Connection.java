public abstract class Connection {
    public Device device;

    public Connection(Device device){
        this.device = device;
    }
    public abstract void connect();
}
