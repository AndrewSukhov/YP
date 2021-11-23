package basicsJava.methods.declaringMethod.task;

import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {
        System.out.println("Робот-помощник v1.0.");
    }

    public static void welcomeUserByName() { // Объявите ниже метод welcomeUserByName
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = scanner.nextLine(); // Сохраните введённое пользователем имя в переменную name
        System.out.println("Рад познакомиться, " + name + "!");
    }

    // Объявите метод sayHelloByTime
    // Спросите у пользователя "Который час?" и сохраните ответ в переменную currentHour
    // В зависимости от времени предусмотрите печать приветствий
    public static void sayHelloByTime() {
        System.out.println("Который час?");
        Scanner scanner = new Scanner(System.in);
        int currentHour = scanner.nextInt();
        if (currentHour >= 6 && currentHour < 12)
            System.out.println("Доброе утро!");
        else if (currentHour >= 12 && currentHour < 18)
            System.out.println("Добрый день!");
        else if (currentHour >= 18 && currentHour <= 22)
            System.out.println("Добрый вечер!");
        else
            System.out.println("Доброй ночи!");
    }

    // Объявите метод printSuccess
    // Он должен печатать строку: У вас уже неплохо получается программировать!
    public static void printSuccess() {
        System.out.println("У вас уже неплохо получается программировать!");
    }
}
/*
Условие задачи:
Вам нужно запрограммировать робота, который должен познакомиться с пользователем, поздороваться с ним в зависимости
от времени суток и поздравить с успехами в программировании. Для этого нужно объявить и реализовать такие методы:
Метод welcomeUserByName() должен спрашивать у пользователя имя, а потом сообщать, что рад знакомству.
Метод sayHelloByTime() должен спрашивать у пользователя время и в зависимости от ответа печатать приветствие.
Если позже 22 часов и раньше 6 утра — "Доброй ночи!". С 6 до 12 часов утра — "Доброе утро!", с 12 до 18 — "Добрый день!", а с 18 до 22 — "Добрый вечер!".
Третий метод printSuccess() должен печать только одну строку — "У вас уже неплохо получается программировать!".
ПОДСКАЗКА:
Чтобы объявить методы, используйте перед их именами служебные слова public static void.
Не забудьте, что после имени метода обязательно идут круглые скобки, а тело метода пишется внутри фигурных скобок.
Чтобы вывести приветствие в зависимости от времени, напишите пятиступенчатое ветвление:
if — else if— else if — else if —else.
Чтобы охватить все временные промежутки, нужно написать четыре условия с переменной currentHour.
Она должна быть строго меньше 6, 12, 18 и строго больше 22.
Для печати воспользуйтесь методом System.out.println().
Ваши методы пока не будут выводить информацию на экран — это нормально.
 */
