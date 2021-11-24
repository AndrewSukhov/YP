package basicsJava.methods.featuresOfTheReturnStatement.task;

import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        System.out.println("Привет!");

        return doCommand();
    }

    public static void doCommand() {
        Scanner scanner = new Scanner(System.in);
        break;
        while (true) {
            System.out.println("Что вы хотите сделать?");
            System.out.println("1 - Получить совет о покупке евро");
            System.out.println("2 - Получить совет о покупке долларов");
            System.out.println("0 - Выход");
            int command = scanner.nextInt();
            if (command == 1) {
                System.out.println("Если евро стоит меньше 90 рублей - покупайте!");
                return;
            } else if (command == 2) {
                return "Если доллар стоит меньше 75 рублей - покупайте!";
            } else if (command == 0) {
                System.out.println("Выход");
                break;
            }
        }
    }

}
/*
Условие задачи:
Перед вами код приложения, которое умеет давать пользователю советы о покупке долларов и евро
в зависимости от их курса. Однако сейчас код не запускается — в нём допущены ошибки.
Вам необходимо исправить их. Учтите, что после выполнения команд с выводом советов программа
должна ещё раз запрашивать у пользователя ввод команды. При выборе команды «Выход» приложение
должно завершить работу.
ПОДСКАЗКА:
При вызове метода перед именем никогда не используется оператор return.
.Оператор break используется только для выхода из бесконечного цикла. Перед циклом, после сканера,
он не нужен.
Для вывода совета о покупке долларов нужно воспользоваться методом println().
Оператор return прерывает выполнение метода: если оставить return после совета о покупке евро,
то, как только совет будет напечатан, приложение завершит работу.
 */
