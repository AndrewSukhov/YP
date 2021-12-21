package JavaCore1.module1.sptint1.theme05.task0508.task01;

import java.util.ArrayList;
import java.util.HashMap;

public class ExpensesManager {
    HashMap<String, ArrayList<Double>> expensesByCategories; // Замените на таблицу с именем expensesByCategories

    ExpensesManager() {
        expensesByCategories = new HashMap<>(); // Создайте таблицу
    }

    // Добавьте в метод ещё один параметр — category
    double saveExpense(double moneyBeforeSalary, double expense, String category) {
        moneyBeforeSalary = moneyBeforeSalary - expense;
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
        if (expensesByCategories.containsKey(category)){ // Проверьте наличие категории
            ArrayList<Double> spending = expensesByCategories.get(category); // Получите список трат в этой категории
            spending.add(expense); // Добавьте трату
            expensesByCategories.put(category, spending);
    } else {
            ArrayList<Double> spending = new ArrayList<>(); // Создайте новый список трат и добавьте в него сумму
            spending.add(expense);
            expensesByCategories.put(category, spending); // Сохраните категорию и новый список трат в хеш-таблицу
    }
        if (moneyBeforeSalary < 1000) {
        System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
    }
        return moneyBeforeSalary;
}


    void printAllExpensesByCategories() {
        // Замените логику для работы с таблицами
        for (String category : expensesByCategories.keySet()) {
            System.out.println(category);
            for (Double expense : expensesByCategories.get(category))
                    System.out.println(expense);
        }
    }

    // Метод должен принимать название категории и называться findMaxExpenseInCategory
    double findMaxExpenseInCategory(String category) {
        double maxExpense = 0;
        /* Замените логику для работы с таблицами
        Если категория есть, то ищем максмальную трату.
        Иначе печатаем "Такой категории пока нет." */
        if (expensesByCategories.containsKey(category)) {
            for (ArrayList<Double> expenses : expensesByCategories.values()){
                for (Double exp : expenses) {
                    if (exp > maxExpense) {
                        maxExpense = exp;
                    }
                }
            }
        }
        return maxExpense;
    }

    void removeAllExpenses() {
        expensesByCategories.clear(); // Таблица называется иначе
        System.out.println("Траты удалены.");
    }
}
