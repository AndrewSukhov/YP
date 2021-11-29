package basicsJava.classesAndObjects.createAHamster.task2;

public class Praktikum {
    public static void main(String[] args) {
        Hamster homka = new Hamster();

        System.out.println("Имя: " + homka.name);
        System.out.println("Возраст: " + homka.age);
        System.out.println("Вес: " + homka.weight);
        System.out.println("Цвет: " + homka.color);
    }
}
/*
Условие задачи:
Хотим знать о хомяке больше: добавьте информацию о нём — возраст, вес и цвет.
Для обращения к полю нужно использовать точечную нотацию, например, homka.name.
 */