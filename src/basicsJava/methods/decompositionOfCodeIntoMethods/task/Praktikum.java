package basicsJava.methods.decompositionOfCodeIntoMethods.task;

public class Praktikum {

    public static void main(String[] args) {
        System.out.println("Привет, Пиксель!");
        System.out.println("Привет, Байт!");

        double[] feedExpensesCat = {100.50, 236.0, 510.6, 150.20, 80.0, 172.0, 135.4};
        double[] feedExpensesHamster = {70.50, 146.0, 710.6, 250.20, 83.0, 19.0, 55.4};

        double maxFeedExpenseCat = 0;
        for (int i = 0; i < feedExpensesCat.length; i++) {
            if (feedExpensesCat[i] > maxFeedExpenseCat) {
                maxFeedExpenseCat = feedExpensesCat[i];
            }
        }

        System.out.println("Твой самый дорогой корм стоил " + maxFeedExpenseCat);

        double maxFeedExpenseHamster = 0;
        for (int i = 0; i < feedExpensesHamster.length; i++) {
            if (feedExpensesHamster[i] > maxFeedExpenseHamster) {
                maxFeedExpenseHamster = feedExpensesHamster[i];
            }
        }

        System.out.println("Твой самый дорогой корм стоил " + maxFeedExpenseHamster);

        double sumFeedCat = 0;
        for (int i = 0; i < feedExpensesCat.length; i++) {
            sumFeedCat = sumFeedCat + feedExpensesCat[i];
        }

        System.out.println("Всего на корм было потрачено " + sumFeedCat);

        double sumFeedHamster = 0;
        for (int i = 0; i < feedExpensesHamster.length; i++) {
            sumFeedHamster = sumFeedHamster + feedExpensesHamster[i];
        }

        System.out.println("Всего на корм было потрачено " + sumFeedHamster);

        System.out.println("Приятного аппетита, Пиксель!");
        System.out.println("Приятного аппетита, Байт!");
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
