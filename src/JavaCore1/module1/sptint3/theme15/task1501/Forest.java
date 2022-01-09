package JavaCore1.module1.sptint3.theme15.task1501;

import java.util.List;

public class Forest {
    private List<MountainHare> hares;
    // объявите недостающие переменные и добавьте конструктор
    private static String season;

    public Forest(List<MountainHare> hares) {
        this.hares = hares;
    }

    // добавьте метод setSeason(String newSeason)
    // в этом методе реалищуйте логику смены цвета шубок зайцев-беляков
    public static void setSeason(String newSeason) {
        if (newSeason.equals("зима")) {
            MountainHare.setColor("белый");
        } else if (newSeason.equals("лето")) {
            MountainHare.setColor("серо-рыжий");
        }
    }

    // добавьте метод printHares()
    public void printHares() {
        for (MountainHare hare : hares) {
            System.out.println(hare);
        }
    }
}
