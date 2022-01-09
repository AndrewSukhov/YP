package JavaCore1.module1.sptint3.theme15.task1501;

public class MountainHare {

    // добавьте переменные и конструктор
    private Integer age;
    private Double weight;
    private Integer jumpLength;
    private static String color;

    public MountainHare(Integer age, Double weight, Integer jumpLength) {
        this.age = age;
        this.weight = weight;
        this.jumpLength = jumpLength;
    }

    public static void setColor(String color) {
        MountainHare.color = color;
    }

    @Override
    public String toString() {
        return "Заяц-беляк: " +
                "age=" + age +
                ", weight=" + weight +
                ", jumpLength=" + jumpLength +
                ", color=" + color +
                '.';
    }
}
