package basicsJava.methods.decompositionOfCodeIntoMethods.task;

public class Praktikum {
    public static void main(String[] args) {

        double[] feedExpensesCat = {100.50, 236.0, 510.6, 150.20, 80.0, 172.0, 135.4};
        double[] feedExpensesHamster = {70.50, 146.0, 710.6, 250.20, 83.0, 19.0, 55.4};

        sayHello("Пиксель");
        System.out.println("Твой самый дорогой корм стоил " + findMaxExpense(feedExpensesCat));
        System.out.println("Всего на корм было потрачено " + findExpensesSum(feedExpensesCat));
        sayEnjoyMeal("Пиксель");
        sayHello("Байт");
        System.out.println("Твой самый дорогой корм стоил " + findMaxExpense(feedExpensesHamster));
        System.out.println("Всего на корм было потрачено " + findExpensesSum(feedExpensesHamster));
        sayEnjoyMeal("Байт");

    }

    public static void sayHello(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static void sayEnjoyMeal(String name) {
        System.out.println("Приятного аппетита, " + name + "!");
    }

    public static double findMaxExpense(double[] expenses) {
        double expense = 0;
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > expense) {
                expense = expenses[i];
            }
        }
        return expense;
    }

    public static double findExpensesSum(double[] expenses) {
        double sum = 0;
        for (int i = 0; i < expenses.length; i++) {
            sum = sum + expenses[i];
        }
        return sum;
    }
}
/*
Условие задачи:
Прочитайте код. Сейчас программа анализирует расходы на корм одновременно для двух питомцев:
кота Пикселя и хомяка Байта — из-за этого в результатах печати можно запутаться.
Декомпозируйте код — разбейте его отдельные методы: sayHello, sayEnjoyMeal, findMaxExpense
 findExpensesSum. Методы с приветствием и пожеланием приятного аппетита должны быть типа void;
 методы, касающиеся анализа трат, должны возвращать значение.
У всех методов должны быть параметры. Внутри главного метода main(String[] args)
должны остаться массивы с тратами, вызов методов и вывод результатов трат.
Вызовите методы так, чтобы сначала была напечатана информация про Пикселя, а потом про Байта.
ПОДСКАЗКА:
Нужно объявить четыре метода. Все они будут начинаться со служебных слов public и static.
Методы с приветствием и пожеланием приятного аппетита будут иметь тип void и содержать
один параметр — имя. В коде это будет выглядеть так: sayHello(String name) и sayEnjoyMeal(String name).
Задача этих методов: напечатать заготовленный текст и имя питомца — его нужно подставить при вызове.
Методы, касающиеся трат, должны возвращать значение — не забудьте указать его тип double перед
именем каждого метода. В качестве параметров они принимают массивы трат — double[] expenses.
Для возврата значения из методов findMaxExpense и findExpensesSum используйте оператор return.
Вызов методов findMaxExpense и findExpensesSum с аргументами-массивами поставьте в main внутрь
печати фраз про самый дорогой корм и общую сумму расходов. Это должно выглядеть так:
System.out.println("Твой самый дорогой корм стоил " + findMaxExpense(feedExpensesCat));.
 */
