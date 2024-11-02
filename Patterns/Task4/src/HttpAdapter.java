public class HttpAdapter implements NetworkProtocol{

    HttpProtocol httpProtocol;

    public HttpAdapter(HttpProtocol httpProtocol) {
        this.httpProtocol = httpProtocol;
    }

    @Override
    public void connect() {
        httpProtocol.connectHttp();
    }

    @Override
    public void disConnect() {
        httpProtocol.disconnectHttp();
    }

    @Override
    public void updConnect() {
        httpProtocol.updateConnectionHttp();
    }
}
