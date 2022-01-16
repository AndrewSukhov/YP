package JavaCore1.module1.sptint3.theme16.task1604;

// Допишите реализацию класса Smartphone
public class Smartphone extends MobilePhone {
    public Smartphone(String number) {
        super(number);
    }

    public void makeCall(String targetNumber, String appName) {
        System.out.println("Позвоним через приложение " + appName + " по номеру " + targetNumber + ".");
        makeCall(targetNumber);
    }

    public final void sendEmail(String email, String messageText) {
        System.out.println("Напишем другу сообщение " + messageText + " по email " + email);
    }
}