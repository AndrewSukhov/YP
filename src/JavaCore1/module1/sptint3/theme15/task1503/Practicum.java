package JavaCore1.module1.sptint3.theme15.task1503;

import java.util.Scanner;

public class Practicum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите сумму перевода в рублях.");
        // считайте сумму перевода
        Double amount = scanner.nextDouble();

        boolean isValid = TransactionValidator.isValidAmount(amount); // добавьте вызов метод isValidAmount
        if (isValid)
            System.out.println("Спасибо! Ваш перевод на сумму " + amount + " р. успешно выполнен.");
    }
}
/*
Во всех банковских приложениях есть возможность перевода денег. Как правило, прежде чем выполнить перевод, система
должна проверить, правильно ли введены все необходимые данные.
Ваша задача — реализовать класс TransactionValidator, в котором будет находиться логика проверки суммы перевода.
Минимальная сумма перевода — MIN_AMOUNT (1 р.), максимальная сумма перевода — MAX_AMOUNT (5000 р.).

Метод isValidAmount нужно сделать статическим.
Метод isValidAmount на вход будет принимать сумму перевода, а на выходе возвращать true, если все проверки успешно
пройдены, или false, если обнаружены ошибки.
Для объявления констант используйте модификаторы public static final.
Сумма перевода может содержать цифры после запятой.
Константы должны быть не только в выражении if, но и в сообщениях об ошибке.
 */

