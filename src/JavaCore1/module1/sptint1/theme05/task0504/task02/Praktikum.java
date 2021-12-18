package JavaCore1.module1.sptint1.theme05.task0504.task02;

import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько денег у вас осталось до зарплаты?");
        double moneyBeforeSalary = scanner.nextDouble();
        System.out.println("Сколько дней до зарплаты?");
        int daysBeforeSalary = scanner.nextInt();

        Converter converter = new Converter(78.5, 88.7, 0.75);
        DinnerAdvisor dinnerAdvisor = new DinnerAdvisor();
        ExpensesManager expensesManager = new ExpensesManager();

        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("Ваши сбережения: " + moneyBeforeSalary + " RUB");
                System.out.println("В какую валюту хотите конвертировать? Доступные варианты: 1 - USD, 2 - EUR, 3 - JPY.");
                int currency = scanner.nextInt();
                converter.convert(moneyBeforeSalary, currency);
            } else if (command == 2) {
                dinnerAdvisor.getAdvice(moneyBeforeSalary, daysBeforeSalary);
            } else if (command == 3) {
                System.out.println("Введите размер траты:");
                double expense = scanner.nextDouble();
                moneyBeforeSalary = expensesManager.saveExpense(moneyBeforeSalary, expense);
            } else if (command == 4) {
                expensesManager.printAllExpenses();
            } else if (command == 5) {
                System.out.println("Самая большая сумма расходов составила " + expensesManager.findMaxExpense() + " руб.");
            } else if (command == 6) { // Добавьте реализацию команды 6
                expensesManager.removeAllExpenses(); // Вызовите соответствующий метод
            } else if (command == 7) { // Добавьте реализацию команды 7
                if (!expensesManager.expenses.isEmpty()) { // Проверьте наличие значений в списке
                    System.out.println("Введите трату:");
                    double expense = scanner.nextDouble(); // Считайте значение траты
                  expensesManager.removeExpense(expense); // Вызовите соответствующий метод
                } else {
                    System.out.println("Список трат пуст.");
                }
            } else if (command == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }

    public static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Конвертировать валюту");
        System.out.println("2 - Получить совет");
        System.out.println("3 - Ввести трату");
        System.out.println("4 - Показать траты");
        System.out.println("5 - Показать самую большую сумму расходов");
        // Добавьте новые пункты в меню:
        System.out.println("6 - Очистить список трат");
        System.out.println("7 - Найти и удалить трату");
        System.out.println("0 - Выход");
    }
}
/*
Теперь, когда приложение работает со списками, можно расширить его функционал.

Добавьте в класс Praktikum две новые команды меню:
«6 — Очистить список трат»;
«7 — Найти и удалить трату».
Новые команды должны обращаться к методам класса ExpensesManager — напишите их:
метод removeAllExpenses() должен очищать список трат и печатать фразу «Список трат пуст.».
метод removeExpense(double expense) должен проверять, содержится ли указанное
пользователем значение в списке. Если в списке нет ни одной траты, то нужно сообщить
пользователю, что «Список трат пуст.». Если трата найдена, то её нужно удалить и
сообщить об этом. Если указанной суммы расходов в списке нет, то нужно вывести
на экран, что «Такой траты нет».
Чтобы удалить элемент, вам потребуется вычислить его индекс — используйте для
этого цикл и не забудьте его прервать. Найденный индекс сохраните в переменную index.

    Методы removeAllExpenses() и removeExpense(double expense) ничего не возвращают —
    их тип void.
Внутри removeAllExpenses() должен вызываться метод для очистки списка — expenses.clear().
Внутри removeExpense(double expense) нужно написать ветвление, где сначала проверить,
если ли значения в списке — expenses.isEmpty().
Если список не пустой, то нужно проверить, есть ли в нём нужный элемент —
expenses.contains(expense).
Чтобы удалить элемент, нужно вычислить его индекс с помощью полной формы цикла
for (int i = 0; i < expenses.size(); i++). Если expenses.get(i) == expense,
то можно сохранить значение переменной итерирования index = i и прервать цикл с помощью break.
Проверьте, не забыли ли вы объявить переменную int index. Её начальное значение равно 0.
Удалить элемент нужно так — expenses.remove(index).

 */
