package JavaCore1.module1.sptint2.theme10.task1005;

public class Practicum {
    public static void main(String[] args) {
        Fox foxAlica = new Fox();
        System.out.println("Это лиса Алиса");
        System.out.println("Цвет - " + foxAlica.color); // поле класса Fox
        System.out.println("Вес - " + foxAlica.weight + " кг"); // конструктор Fox
        System.out.println("Она дикая - " + foxAlica.isWild); // поле класса Animal
        System.out.println("Хищник - " + foxAlica.isPredator); // поле класса Canidae
        System.out.println("Она умеет говорить - " + foxAlica.say()); // метод класса Animal
        System.out.println("И может зарычать " + foxAlica.growl()); // метод класса Canidae
    }
}

class Animal {
    protected double weight;
    protected int age;
    protected int heartRate;
    protected boolean isWild;

    public Animal() {
        weight = 0.0;
        age = 0;
        heartRate = 100;
        isWild = true;
    }

    public String say() {
        return "Я животное!";
    }
}

class Canidae extends Animal { // здесь происходит наследование
    protected boolean isPredator;

    public Canidae() {
        isPredator = true;
    }

    public String growl() {
        return "Р-р-р-р-р!";
    }
}

class Fox extends Canidae { // здесь происходит наследование и Canidae, и Animal
    protected String color;

    public Fox() {
        color = "рыжий";
        weight = 2.0;
    }
}