package basicsJava.endlessLoop.task1;

import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Оцените работу приложения Зеленоглазое-Такси по шкале от 1 до 3");

        while (true) { // Запускаем бесконечный цикл
            int x = scanner.nextInt(); // Получаем оценку от пользователя

            if (x == 1) { //Если пользователь вводит 1
                System.out.println("Спасибо за вашу оценку. Мы станем лучше!"); // Благодарим
                break; // Выходим из цикла
            }
            if (x == 2) { // Если оценка равна 2
                System.out.println("Спасибо за вашу оценку. Есть куда расти!");
                break; // И выходим из цикла
            }
            if (x == 3) { // Если оценка равна 3
                System.out.println("Спасибо за высокую оценку! Рады, что вы выбрали нас!");
                break; // И выходим из цикла
            }
            // Пользователь ввёл не 1, 2 или 3 - повторяем просьбу
            System.out.println("Ваша оценка должна быть в диапазоне от 1 до 3");
        }
    }
}

/*
Условие задачи:
Прочитайте код. Пользователю предлагается оценить работу приложения для вызова такси
по шкале от одного до трёх. Для каждой оценки предусмотрен свой вариант ответа.
После того как пользователь ввёл 1, 2 или 3, программа будет печатать соответствующий
ответ и завершать цикл с помощью break. Если введены другие цифры — вопрос будет повторяться
в бесконечном цикле. Позапускайте приложение и поставьте разные оценки, в том числе
за пределами требуемого диапазона. Программа будет снова и снова предлагать вам
выбрать только 1, 2 или 3 — это всё заслуга бесконечного цикла.
В этом тренажёре нет правильных ответов — мы добавили его специально,
чтобы вы смогли попробовать, как работает бесконечный цикл с прерыванием break.

ПОДСКАЗКА:
Бесконечным называется цикл while с условием (true)
На break цикл сразу завершится, а программа перейдёт к выполнению следующего кода.
 */