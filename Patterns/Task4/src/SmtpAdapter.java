public class SmtpAdapter implements NetworkProtocol{
    SmtpProtocol smtpProtocol;

    public SmtpAdapter(SmtpProtocol smtpProtocol) {
        this.smtpProtocol = smtpProtocol;
    }

    @Override
    public void connect() {
        smtpProtocol.connectSmtp();
    }

    @Override
    public void disConnect() {
        smtpProtocol.disconnectSmtp();
    }

    @Override
    public void updConnect() {
        smtpProtocol.updateConnectionSmtp();
    }
}

