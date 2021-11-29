package basicsJava.classesAndObjects.createAHamster.task3;

public class Praktikum {
    public static void main(String[] args) {
        Hamster homka = new Hamster();
        // Присвойте полям новые значения
    ...

        System.out.println("Имя: " + homka.name);
        System.out.println("Возраст: " + homka.age);
        System.out.println("Вес: " +  homka.weight);
        System.out.println("Цвет: " +  homka.color);
    }
}
/*
Переменная называется homka, но хомяка все еще зовут Байт.
Измените имя хомяка на Хомку, а заодно отредактируйте и другие атрибуты:
пусть ему будет 1 год, он будет весить 420 грамм, а его цвет будет не рыжий, а чёрный.

Сначала нужно обратиться к полю объекта по имени, а потом присвоить ему новое значение.
Проверьте, не ошиблись ли вы при написании имени или цвета.
 */