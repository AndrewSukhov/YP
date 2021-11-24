package basicsJava.methods.callingMethods.task;

import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {
        System.out.println("Робот-помощник v2.0.");
        // Вызовите ниже методы в правильном порядке
        sayHello();
        sayHelloByTime();
        welcomeUserByName();
        printSuccess();
    }

    public static void welcomeUserByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = scanner.next();
        printCity();
        String city = scanner.next();
        System.out.println("Рад познакомиться, " + name + " из " + city + "!");
    }

    public static void sayHello() { // Допишите метод sayHello(), который печатает: Привет!
        System.out.println("Привет!");
    }

    public static void printSuccess() {
        System.out.println("У вас уже неплохо получается программировать!");
    }

    public static void printCity() {// Допишите метод printCity(), который спрашивает: Из какого вы города?
        System.out.println("Из какого вы города?");
    }
    public static void sayHelloByTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Который час?");
        int currentHour = scanner.nextInt();
        if (currentHour < 6) {
            System.out.println("Доброй ночи!");
        } else if (currentHour > 22) {
            System.out.println("Доброй ночи!");
        } else if (currentHour < 12) {
            System.out.println("Доброе утро!");
        } else if (currentHour < 18) {
            System.out.println("Добрый день!");
        } else {
            System.out.println("Добрый вечер!");
        }
    }
}
/*
Условие задачи:
Ваш робот уже умеет знакомиться, здороваться в зависимости от времени суток и хвалить
за успехи в программировании. Научите его ещё начинать общение с короткого приветствия
и спрашивать у пользователя, из какого он города.
Сделайте это с помощью методов sayHello() и printCity(). Результат должен получиться таким:
Привет!
Который час?
> ввод текущего часа
Добрый день! (один из вариантов)
Как вас зовут?
> ввод имени
Из какого вы города?
> ввод города
Рад познакомиться, <ваше имя> из <вашего города>!
У вас уже неплохо получается программировать!
ПОДСКАЗКА:
Строки печатаются в порядке вызова методов — сначала приветствие, затем знакомство,
потом похвала за успехи в программировании.
Методы могут вызываться не только из главного метода программы.
Чтобы получить нужный результат, метод printCity() нужно вызвать из метода welcomeUserByName().
Введённый пользователем город нужно считать из консоли и сохранить в переменную city,
а затем подставить в итоговую фразу метода welcomeUserByName() вместе с переменной name.

 */
