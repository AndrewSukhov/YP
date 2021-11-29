package basicsJava.classesAndObjects.createAHamster.task4;

public class Praktikum {
    public static void main(String[] args) {
        Hamster homka = new Hamster();
        // Присвойте полям новые значения
        homka.name = "Хомка";
        homka.age = 1;
        homka.weight = 420;
        homka.color = "Чёрный";

        System.out.println("Имя: " + homka.name);
        System.out.println("Возраст: " + homka.age);
        System.out.println("Вес: " +  homka.weight);
        System.out.println("Цвет: " +  homka.color);

        // Покормите хомяка и напечатайте его вес
        System.out.println("Новый вес: " + homka.eat(15));
    }
}
/*
Хомка голодный! Покормите его с помощью метода eat. В качестве аргумента передайте число 15.
После этого проверьте значение его веса снова, чтобы убедиться, что он поужинал.
Для обращения к методам тоже используется точка.
 */
