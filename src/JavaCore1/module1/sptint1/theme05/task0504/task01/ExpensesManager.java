package JavaCore1.module1.sptint1.theme05.task0504.task01;

import java.util.ArrayList;// Импортируйте ArrayList

public class ExpensesManager {
    ArrayList<Double> expenses;
    // Замените массив списком

    ExpensesManager() {
        expenses = new ArrayList<>(); // Создайте список в конструкторе
    }
    // Номер дня больше не нужен
    double saveExpense(double moneyBeforeSalary, double expense) {
        expenses.add(expense);
        moneyBeforeSalary = moneyBeforeSalary - expense;
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
        if (moneyBeforeSalary < 1000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary;
    }

    void printAllExpenses() {
        for (int i = 0; i < expenses.size(); i++) {
            System.out.println("Трата № " + (i + 1) + ". Потрачено " + expenses.get(i) + " рублей");
        }
    }

    double findMaxExpense() {
        double maxExpense = 0;
        for (Double expense : expenses) {
            if (expense > maxExpense)
                maxExpense = expense;
        }
        return maxExpense;
    }
}
