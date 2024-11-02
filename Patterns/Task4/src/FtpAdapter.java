public class FtpAdapter implements NetworkProtocol{

    FtpProtocol ftpProtocol;

    public FtpAdapter(FtpProtocol ftpProtocol) {
        this.ftpProtocol = ftpProtocol;
    }

    @Override
    public void connect() {
        ftpProtocol.connectFtp();
    }

    @Override
    public void disConnect() {
        ftpProtocol.disconnectFtp();
    }

    @Override
    public void updConnect() {
        ftpProtocol.updateConnectionFtp();
    }
}
