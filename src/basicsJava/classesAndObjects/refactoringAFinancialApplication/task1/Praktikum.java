package basicsJava.classesAndObjects.refactoringAFinancialApplication.task1;

import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {
        double[] expenses = new double[7];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько денег у вас осталось до зарплаты?");
        double moneyBeforeSalary = scanner.nextDouble();
        System.out.println("Сколько дней до зарплаты?");
        int daysBeforeSalary = scanner.nextInt();

        Converter converter = new Converter(78.5,88.7,0.75);
        DinnerAdvisor dinnerAdvisor = new DinnerAdvisor(); // Создайте объект класса DinnerAdvisor

        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("Ваши сбережения: " + moneyBeforeSalary + " RUB");
                System.out.println("В какую валюту хотите конвертировать? Доступные варианты: 1 - USD, 2 - EUR, 3 - JPY.");
                int currency = scanner.nextInt();
                converter.convert(moneyBeforeSalary, currency);
            } else if (command == 2) {
                dinnerAdvisor.getAdvice(moneyBeforeSalary, daysBeforeSalary);// Вызовите метод класса DinnerAdvisor
            } else if (command == 3) {
                moneyBeforeSalary = saveExpense(scanner, moneyBeforeSalary, expenses);
            } else if (command == 4) {
                printAllExpenses(expenses);
            } else if (command == 5) {
                System.out.println("Самая большая сумма расходов на этой неделе составила " + findMaxExpense(expenses) + " руб.");
            } else if (command == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }

    public static double saveExpense(Scanner scanner, double moneyBeforeSalary, double[] expenses) {
        System.out.println("За какой день вы хотите ввести трату: 1-ПН, 2-ВТ, 3-СР, 4-ЧТ, 5-ПТ, 6-СБ, 7-ВС?");
        int day = scanner.nextInt();
        System.out.println("Введите размер траты:");
        double expense = scanner.nextDouble();
        moneyBeforeSalary = moneyBeforeSalary - expense;
        expenses[day - 1] = expenses[day - 1] + expense;
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
        if (moneyBeforeSalary < 1000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary;
    }

    public static void printAllExpenses(double[] expenses) {
        for (int i = 0; i < expenses.length; i++) {
            System.out.println("День " + (i + 1) + ". Потрачено " + expenses[i] + " рублей");
        }
    }

    public static double findMaxExpense(double[] expenses) {
        double maxExpense = 0;
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > maxExpense) {
                maxExpense = expenses[i];
            }
        }
        return maxExpense;
    }

    public static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Конвертировать валюту");
        System.out.println("2 - Получить совет");
        System.out.println("3 - Ввести трату");
        System.out.println("4 - Показать траты за неделю");
        System.out.println("5 - Показать самую большую сумму расходов за неделю");
        System.out.println("0 - Выход");
    }
}
/*
В отдельной вкладке создайте новый класс — DinnerAdvisor (англ. «советник по ужину»).
У него не будет полей и будет только один метод getAdvice(double moneyBeforeSalary,
int daysBeforeSalary) — перенесите в него код из соответствующего метода класса Praktikum.
В классе Praktikum создайте объект класса DinnerAdvisor, воспользовавшись конструктором
по умолчанию. Вызовите метод getAdvice класса DinnerAdvisor в блоке ветвления,
который отвечает за реализацию пункта меню «Получить совет». Из класса Praktikum
удалите метод getAdvice(double moneyBeforeSalary, int daysBeforeSalary).

Удалите перед названием метода внутри класса DinnerAdvisor слова public и static —
их теперь не нужно указывать.
Для создания объекта класса DinnerAdvisor используйте конструктор по умолчанию —
new DinnerAdvisor();.
Вызов метода класса происходит с помощью имени класса и точки.
Не забудьте указать аргументы в круглых скобках.
Проверьте, не забыли ли вы удалить из класса Praktikum код метода
getAdvice(double moneyBeforeSalary, int daysBeforeSalary),
который вы перенесли в класс DinnerAdvisor.
 */
