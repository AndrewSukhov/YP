package JavaCore1.module1.sptint3.theme16.task1604;

public class MobilePhone extends Phone {

    public MobilePhone(String number) {
        super(number);
    }

    public final void sendSms(String targetNumber, String messageText) {
        System.out.println("Отправляем сообщение " + messageText + " по номеру " + targetNumber);
    }
}
