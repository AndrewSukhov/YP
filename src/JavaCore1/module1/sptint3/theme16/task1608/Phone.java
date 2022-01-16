package JavaCore1.module1.sptint3.theme16.task1608;

// Унаследуйте класс от базового класса, описывающего контакт Contact
public class Phone ... {
private final String phoneNumber;

public Phone(String name, String phoneNumber) {
        ...
        this.phoneNumber = phoneNumber;
        }

public String getPhoneNumber() {
        return phoneNumber;
        }

        // Метод sendMessage переопределяет метод базового класса
        ...
public void sendMessage() {
        System.out.println("Звоним другу по номеру " + phoneNumber + " и зовем на кофе.");
        }

        ...
public void print() {
        System.out.println("Номер телефона: " + getPhoneNumber());
        }
        }
