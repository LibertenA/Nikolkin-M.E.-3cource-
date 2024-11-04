public class EmailSending {
    private Email email;

    public void prepareMessage(Email email) {
        this.email = email;
        System.out.println("Сообщение подготовлено для отправки:");
        System.out.println("Кому: " + email.getRecipient());
        System.out.println("Тема: " + email.getSubject());
        System.out.println("Текст письма: " + email.getBody());
    }

    public boolean isReadyToSend() {
        return email != null && !email.getBody().isEmpty();
    }

    public void sendEmail() {
        if (isReadyToSend()) {
            System.out.println("Отправляем сообщение на адрес: " + email.getRecipient());
        } else {
            System.out.println("Ошибка: сообщение не готово к отправке.");
        }
    }
}

