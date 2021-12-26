package JavaCore1.module1.sptint1.finalSprintTask.task1;

import java.util.Scanner;

// Счетчик калорий.

/*
В классе Main реализован основной цикл приложения — считывание команд и
вызов соответствующих методов основного класса приложения — StepTracker.
 */
public class Main {

    // Метод реализует ввод данных пользователя, вывод меню и запрошенной информации
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();
        System.out.println("Добро пожаловать в \"Счетчик калорий\".");

        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("Введите название месяца в формате: \"Январь\", \"Февраль\" и т.д.");
                String month = scanner.next();
                System.out.println("Введите номер дня от 1 до 30.");
                int day = scanner.nextInt();
                System.out.println("Введите количество пройденных шагов.");
                int steps = scanner.nextInt();
                stepTracker.saveSteps(month, day, steps);
            } else if (command == 2) {
                System.out.println("Введите название месяца в формате: \"Январь\", \"Февраль\" и т.д.");
                String month = scanner.next();
                stepTracker.printStatistic(month);
            } else if (command == 3) {
                System.out.println("Введите требуемое количество шагов");
                int targetStepsCount = scanner.nextInt();
                stepTracker.changePurposeOfDailySteps(targetStepsCount);
            } else if (command == 0) {
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }

    // Печать меню приложения
    public static void printMenu() {
        System.out.println("Что вы хотите сделать? " +
                "Введите число, соответствующее пункту меню");
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Напечатать статистику за определённый месяц");
        System.out.println("3 - Изменить цель по количеству шагов в день");
        System.out.println("0 - Выйти из приложения");
    }
}