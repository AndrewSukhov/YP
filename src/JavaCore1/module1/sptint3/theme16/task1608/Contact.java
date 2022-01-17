package JavaCore1.module1.sptint3.theme16.task1608;

// Дополните объявление класса Contact
public abstract class Contact {
    // Класс должен содержать одно поля - имя пользователя name
    String name;

    public Contact(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // И два метода - sendMessage() для отправки сообщения и print() для печати информации о контакте
    abstract void sendMessage();

    abstract void print();
}
