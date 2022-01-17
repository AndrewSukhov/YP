package JavaCore1.module1.sptint3.theme16.task1608;

// Унаследуйте класс от базового класса, описывающего контакт Contact
public class SocialNetworkContact extends Contact {
    private final String socialNetwork;
    private final String username;

    public SocialNetworkContact(String name, String socialNetwork, String username) {
        super(name);
        this.socialNetwork = socialNetwork;
        this.username = username;
    }

    public String getSocialNetwork() {
        return socialNetwork;
    }

    public String getUsername() {
        return username;
    }

    // Метод sendMessage переопределяет метод базового класса
        ...

    public void sendMessage() {
        System.out.println("Отправим забавный стикер одногруппнику в соцсети " + socialNetwork + ", имя пользователя " + username);
    }

        ...

    public void print() {
        System.out.println("Социальная сеть: " + socialNetwork);
        System.out.println("Имя пользователя: " + username);
    }
}
