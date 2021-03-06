package basicsJava.loops.whileLoop.task1;

import java.util.Scanner;

class Praktikum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько денег у вас сейчас: ");
        double balance = scanner.nextDouble(); // Ваши сбережения
        int years = 0;

        while (balance <= 1000000) {
            balance += balance * .05 ;
            years += 1;
        }

        System.out.println("Через " + years + " лет у вас будет миллион!");
    }
}
/*
Задание:
Накопления — дело серьёзное. Ваш друг уже накопил 5000 рублей и решил замахнуться на миллион.
Для этого он положил свои сбережения на накопительный счёт под 5% годовых.
Допишите программу с циклом while, которая посчитает, через сколько лет на счету будет нужная сумма.
Предполагается, что стартовый баланс счёта (сумма сбережений) вводится с консоли.

ПОДСКАЗКА:
1.Цикл выполняется до тех пор, пока на счету не будет миллиона — balance < 1000000.
2.Чтобы посчитать, как изменится состояние счёта за год с учётом ставки в 5%,
используйте формулу balance = balance + balance * 0.05;.
3.Для учёта лет прибавляйте каждый раз по году years = years + 1.
 */