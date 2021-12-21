package JavaCore1.module1.sptint1.theme05.task0508.task02;

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
                System.out.println("К какой категории относится трата?");
                String category = scanner.next();
                moneyBeforeSalary = expensesManager.saveExpense(moneyBeforeSalary, category, expense);
            } else if (command == 4) {
                expensesManager.printAllExpensesByCategories();
            } else if (command == 5) {
                System.out.println("В какой категории искать?");
                String category = scanner.next();
                System.out.println("Самая большая трата в категории " + category + " составила "
                        + expensesManager.findMaxExpenseInCategory(category) + " руб.");
            } else if (command == 6) {
                expensesManager.removeAllExpenses();
            } ... { // Допишите остальные пункты меню
                System.out.println("Всего потрачено: " + ...);
            } ... {
                System.out.println("Какую категорию вы хотите удалить?");
                String category = scanner.next();
                ...
            } ... {
                // Напечатайте фразу "В категории ИМЯ_КАТЕГОРИИ вы потратили больше всего.");
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
        System.out.println("4 - Показать траты по категориям");
        System.out.println("5 - Показать самую большую трату в выбранной категории");
        System.out.println("6 - Очистить таблицу трат");
        System.out.println("7 - Вернуть сумму всех трат");
        System.out.println("8 - Удалить категорию");
        System.out.println("9 - Получить имя самой дорогой категории");
        System.out.println("0 - Выход");
    }
}
/*
Расширьте функционал финансового приложения. Добавьте в класс ExpensesManager новые методы:
Метод getExpensesSum() должен возвращать сумму всех трат в таблице. Используйте для этого
вложенные циклы.
Метод removeCategory() должен удалять категорию по запросу пользователя.
Метод getMaxCategoryName() должен возвращать название категории, где самый большой
размер сохранённых трат. Для этого вам также понадобятся два цикла: внешний для того,
чтобы проходить по всем ключам в таблице, а внутренний для подсчёта суммарного количества
трат в категории. Для сохранения промежуточных значений сумм трат по категориям и их
названий используйте переменные maxCategorySum и maxCategoryName.
В конце в них будет сохранён результат.
Допишите код в классе Praktikum. Вызовите в нём новые методы.

Для реализации метода double getExpensesSum() нужно использовать values() и цикл for.
С их помощью просуммируйте все траты в таблице и сохраните — result += expense.
Значение result верните с помощью return.
Метод для удаления категории должен иметь такую сигнатуру: void removeCategory(String name).
Его логика простая — нужно использовать метод remove().
Метод String getMaxCategoryName() должен иметь похожую логику с методом для печати
трат по категориям. Во внешнем цикле нужно получить названия категорий через keySet()
и списки по каждой категории. Во внутреннем цикле нужно суммировать траты в списке и
сохранить sum += expense. Затем используйте логику нахождения максимального числа:
если sum > maxCategorySum, то maxCategorySum = sum, а maxCategoryName = category.
В конце метод должен вернуть maxCategoryName.

 */
