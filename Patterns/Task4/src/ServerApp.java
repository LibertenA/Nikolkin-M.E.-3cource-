public class ServerApp {
    public static void main(String[] args) {
        NetworkProtocol httpAdapter = new HttpAdapter(new HttpProtocol());
        NetworkProtocol ftpAdapter = new FtpAdapter(new FtpProtocol());
        NetworkProtocol smtpAdapter = new SmtpAdapter(new SmtpProtocol());

        httpAdapter.connect();
        httpAdapter.disConnect();
        httpAdapter.updConnect();

        ftpAdapter.connect();
        ftpAdapter.disConnect();
        ftpAdapter.updConnect();

        smtpAdapter.connect();
        smtpAdapter.disConnect();
        smtpAdapter.updConnect();
    }
}
