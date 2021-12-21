package JavaCore1.module1.sptint1.theme05.task0508.task01;

import java.util.ArrayList;

public class ExpensesManager {
    ArrayList<Double> expenses; // Замените на таблицу с именем expensesByCategories

    ExpensesManager() {
        expenses = new ArrayList<>(); // Создайте таблицу
    }

    // Добавьте в метод ещё один параметр — category
    double saveExpense(double moneyBeforeSalary, double expense) {
        moneyBeforeSalary = moneyBeforeSalary - expense;
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
        expenses.add(expense); // Замените на работу с таблицей
        if ... // Проверьте наличие категории
            ... // Получите список трат в этой категории
            ... // Добавьте трату
    } else {
            ... // Создайте новый список трат и добавьте в него сумму
            ... // Сохраните категорию и новый список трат в хеш-таблицу
    }
        if (moneyBeforeSalary < 1000) {
        System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
    }
        return moneyBeforeSalary;
}


    void printAllExpenses() {
        // Замените логику для работы с таблицами
        for (int i = 0; i < expenses.size(); i++) {
            System.out.println("Трата № " + (i + 1) + ". Потрачено " + expenses.get(i) + " рублей");
        }
    }

    // Метод должен принимать название категории и называться findMaxExpenseInCategory
    double findMaxExpense() {
        double maxExpense = 0;
        /* Замените логику для работы с таблицами
        Если категория есть, то ищем максмальную трату.
        Иначе печатаем "Такой категории пока нет." */
        for (Double exp : expenses) {
            if (exp > maxExpense) {
                maxExpense = exp;
            }
        }
        return maxExpense;
    }

    void removeAllExpenses() {
        expenses.clear(); // Таблица называется иначе
        System.out.println("Траты удалены.");
    }
}
