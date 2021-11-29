package basicsJava.classesAndObjects.createAHamster.task4;

public class Hamster {
    public String name = "Хомяк";
    public int age = 0;
    public int weight = 0;
    public String color = "white";

    public int eat(int weight) {
        return this.weight += weight;
    }
}
