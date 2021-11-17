package basicsJava.arrays.indicesAndElements.task1;

class Praktikum {
    public static void main(String[] args) {
        double[] expenses = {100.50, 500.00, 10.00, 0.0, 640.60, 370.20, 200.00};

        // Добавьте 115 рублей к расходам за среду
        ...
        System.out.println("Новое значение расходов за среду: " + ... + " рублей.");

        // Суммируйте три самые крупные траты
        ...
        System.out.println("Самые большие расходы были во вторник, пятницу и субботу.");
        System.out.println("Всего вы потратили в эти дни: " + ... + " рублей.");
    }
}
/*
Условие задачи:
Перед вами массив трат за неделю. Каждый его элемент — это сумма, потраченная за один день, от понедельника до воскресенья.
Сделайте следующее:
Исправьте сумму расходов за среду: в ней не отражено мороженое, купленное за 115 рублей. Прибавьте стоимость десерта к расходам за день.
Суммируйте три самые крупные траты в массиве — это расходы за вторник, пятницу и субботу. Результат сохраните в переменную sum.
ПОДСКАЗКА:
Используйте индекс, чтобы обратиться к элементу с тратами за среду. Не забудьте, что нумерация в массиве начинается с нуля,
поэтому получится expenses[2]. Чтобы поменять значение этого элемента, прибавьте к нему 115.0.
Расходы за вторник, пятницу и субботу хранятся в массиве под индексами 1, 4 и 5.
Нужно получить элементы по этим индексам, сложить и сохранить в переменную с именем sum и типом double. sum подставьте в итоговую фразу.
 */