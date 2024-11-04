public class EmailFacade {
    private EmailSending emailSending;

    public EmailFacade() {
        this.emailSending = new EmailSending();
    }

    public void sendEmail(String recipient, String subject, String body) {
        Email email = new Email(recipient, subject, body);
        emailSending.prepareMessage(email);
        emailSending.sendEmail();
    }
}
