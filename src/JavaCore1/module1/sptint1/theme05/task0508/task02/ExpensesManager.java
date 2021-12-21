package JavaCore1.module1.sptint1.theme05.task0508.task02;

import java.util.ArrayList;
import java.util.HashMap;

public class ExpensesManager {
    HashMap<String, ArrayList<Double>> expensesByCategories;

    ExpensesManager() {
        expensesByCategories = new HashMap<>();
    }

    double saveExpense(double moneyBeforeSalary, String category, double expense) {
        moneyBeforeSalary = moneyBeforeSalary - expense;
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
        if (expensesByCategories.containsKey(category)) {
            ArrayList<Double> expenses = expensesByCategories.get(category);
            expenses.add(expense);
        } else {
            ArrayList<Double> expenses = new ArrayList<>();
            expenses.add(expense);
            expensesByCategories.put(category, expenses);
        }
        if (moneyBeforeSalary < 1000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary;
    }

    void printAllExpensesByCategories() {
        for (String category : expensesByCategories.keySet()) {
            System.out.println(category);
            ArrayList<Double> expenses = expensesByCategories.get(category);
            for (Double expense : expenses) {
                System.out.println(expense);
            }
        }
    }

    double findMaxExpenseInCategory(String category) {
        double maxExpense = 0;
        if (expensesByCategories.containsKey(category)) {
            ArrayList<Double> expenses = expensesByCategories.get(category);
            for (Double expense : expenses) {
                if (expense > maxExpense) {
                    maxExpense = expense;
                }
            }
        } else {
            System.out.println("Такой категории пока нет.");
        }
        return maxExpense;
    }

    void removeAllExpenses() {
        expensesByCategories.clear();
        System.out.println("Траты удалены.");
    }

    // Напишите метод для удаления категории
    public void removeCategory(String category) {
//        if (expensesByCategories.containsKey(category)) {
            expensesByCategories.remove(category);
//        } else {
//            System.out.println("Категории " + category + " нет в списке");
//        }
    }

    // Напишите метод для получения суммы всех трат
    public Double getExpensesSum() {
        Double sum = 0d;
        for (String expense : expensesByCategories.keySet()) {
            for (Double spend : expensesByCategories.get(expense)) {
                sum += spend;
            }
        }
        return sum;
    }

    // Напишите метод для получения категории, где размер трат больше всего
    public String getMaxCategoryName() {
        // Используйте эти переменные для сохранения промежуточных значений
        double maxCategorySum = 0;
        String maxCategoryName = "";
        for (String caregory : expensesByCategories.keySet()) {
            Double sum = 0d;
            for (Double expense : expensesByCategories.get(caregory)) {
                sum += expense;
                if (sum > maxCategorySum) {
                    maxCategorySum = sum;
                    maxCategoryName = caregory;
                }
            }
        }
        return maxCategoryName;
    }
}