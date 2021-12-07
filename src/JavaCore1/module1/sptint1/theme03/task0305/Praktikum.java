package JavaCore1.module1.sptint1.theme03.task0305;

import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пользователя:");
        String name = scanner.nextLine();
        PersonAccount user = new PersonAccount(name);

        System.out.println("Хотите открыть счёт в RUB?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        int command = scanner.nextInt();
        if (command == 1) {
            user.moneyRUB = 0.0;
        }

        System.out.println("Хотите открыть счёт в USD?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        command = scanner.nextInt();
        if (command == 1) {
            user.moneyUSD = 0.0;
        }

        System.out.println("Хотите открыть счёт в EUR?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        command = scanner.nextInt();
        if (command == 1) {
            user.moneyEUR = 0.0;
        }

        System.out.println("Поздравляем, аккаунт для пользователя " + user.name + " создан.");
        System.out.println("Открытые счета:");
        if (user.moneyRUB == 0.0) {
            System.out.println("- RUB");
        }
        if (user.moneyUSD == 0.0) {
            System.out.println("- USD");
        }
        if (user.moneyEUR == 0.0) {
            System.out.println("- EUR");
        }

    }
}
/*
Прочитайте код приложения онлайн-банка, где пользователь может по желанию завести счета в трёх валютах. В программу
забрался баг — вне зависимости от выбора пользователя сразу открываются все три счёта.
С помощью классов-обёрток и их свойств исправьте код так, чтобы открывались счета только в тех валютах, которые выберет
пользователь. Счета необходимо создавать с нулевым балансом.

Ошибка происходит из-за того, что счетам ставится значение примитива double по умолчанию 0.0. Замените примитивы
double на обёртки Double. Теперь тем счетам, которые не были проинициализированы, присвоится значение по умолчанию
для ссылочных типов — null.
При проверке открытых счетов значения переменных необходимо сравнивать не с 0.0, а с null. Если значение счёта
не равно null — user.moneyRUB != null, значит, он открыт.

 */
