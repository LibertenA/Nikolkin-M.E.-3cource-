public class Main {
    public static void main(String[] args) {
        EmailFacade emailFacade = new EmailFacade();
        
        emailFacade.sendEmail("lol@java.com", "Тестовое письмо", "Само письмо собственно.");
    }
}