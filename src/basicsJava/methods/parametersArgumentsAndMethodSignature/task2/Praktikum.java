package basicsJava.methods.parametersArgumentsAndMethodSignature.task2;

import java.lang.reflect.Array;

public class Praktikum {

    public static void main(String[] args) {
        double[] expenses = {1772.5, 367.0, 120.6, 2150.2, 874.0, 1.0, 1459.4};
        double maxExpense = findMaxExpense(expenses); // Вызовите метод и присвойте maxExpense значение его результата
        System.out.println("Самая большая трата недели " + maxExpense);
    }

    public static double findMaxExpense(double[] expenses) {
        double maxExpense = Double.MIN_VALUE;
        for (double expens : expenses) {
            if (expens > maxExpense)
                maxExpense = expens;
        }
        return maxExpense;
    } // Объявите метод findMaxExpense
    // Реализуйте метод. Чтобы найти самую большую трату, воспользуйтесь циклом
    // Самую большую трату запишите в переменную maxExpense

}
/*
Условие задачи:
Объявите и реализуйте метод findMaxExpense — он должен находить в списке расходов за неделю
самую большую трату и возвращать её значение. В качестве единственного параметра этого метода
укажите массив расходов expenses.
ПОДСКАЗКА:
При объявлении метода не забудьте указать служебные слова и тип возвращаемого значения double.
В круглых скобках укажите аргумент метода — массив double[] expenses.
Для поиска самой большой траты создайте переменную double maxExpense с нулевым значением.
С помощью цикла for (int i = 0; i < expenses.length; i++) сравните её с элементами массива.
Если значение элемента массива больше значения переменной (expenses[i] > maxExpense),
то перезапишите её: maxExpense = expenses[i].
В конце метода не забудьте вернуть результат — return maxExpense.
 */