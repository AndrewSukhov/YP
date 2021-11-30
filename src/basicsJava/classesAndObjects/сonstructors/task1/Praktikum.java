package basicsJava.classesAndObjects.сonstructors.task1;

public class Praktikum {
    public static void main(String[] args) {
        Hamster bite = new Hamster();
        bite.name = "Байт";
        bite.age = 2;
        bite.color = "Рыжий";
        bite.weight = 350;

        Hamster ninja = new Hamster();
        ninja.name = "Ниндзя";
        ninja.age = 1;
        ninja.weight = 250;
        ninja.color = "Белый";

        Hamster kuzya = new Hamster();
        kuzya.name = "Кузя";
        kuzya.age = 3;
        kuzya.weight = 450;
        kuzya.color = "Пятнистый";

        Hamster paskal = new Hamster();
        paskal.name = "Паскаль";
        paskal.age = 2;
        paskal.weight = 320;
        paskal.color = "Чёрный";

        System.out.println(bite.name);
        System.out.println(ninja.name);
        System.out.println(kuzya.name);
        System.out.println(paskal.name);
    }
}
/*
Из-за того что мы добавили в класс Hamster конструктор с параметрами, код из предыдущего урока перестал работать. Перепишите его.
Конструктор по умолчанию больше не работает. Посмотрите на сигнатуру нового конструктора и укажите аргументы при создании объекта класса.
 */