package JavaCore1.module1.sptint1.theme04.task0404;

import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monthNumber;

        while (true) {
            System.out.println("Когда планируется путешествие? Введите номер месяца от 1 до 12.");
            monthNumber = scanner.nextInt();

            if (monthNumber > 12) { // Инвертируйте условие
                break;
            } else {
                System.out.println("Некорретный номер месяца. Введите ещё раз.");
            }
        }
        String season = getSeasonByNumber(monthNumber);

        ... /* Допишите ветвление, которое будет печатать строку:
            System.out.println("Летом лучше остаться в Москве.");
              и завершать выполнение программы */


        System.out.println("Укажите стоимость прямых билетов из Москвы в Париж:");
        int ticketMoscowParis = scanner.nextInt();
        System.out.println("Укажите стоимость билетов из Москвы в Париж с пересадкой в Лондоне:");
        int ticketMoscowLondonParis = scanner.nextInt();
        System.out.println("У вас есть британская виза?");
        System.out.println("1 - да, виза есть");
        System.out.println("0 - визы нет");
        int britainVisa = scanner.nextInt();


        // В этом ветвлении что-то напутано с условиями - исправьте это
        if (!season.equals("Лето")) { // Перенесите проверку на "Лето" в ветвление выше
            if (!(ticketMoscowLondonParis < ticketMoscowParis)) {
                if (!(britainVisa == 0)) { // Упростите это условие
                    System.out.println("Летим через Лондон!");
                } else {
                    System.out.println("Летим напрямую в Париж!");
                }
            } else {
                System.out.println("Летим напрямую в Париж!");
            }
        }
    }

    private static String getSeasonByNumber(int monthNumber) {
        // Допишите условия ветвления в виде утверждений
        if (...) {
            return "Зима";
        } else if (...) {
            return "Весна";
        } else if (...) {
            return "Лето";
        } else if (...) {
            return "Осень";
        } else {
            return "Зима";
        }
    }
}
/*
Агрегатор авиабилетов заказал разработку приложения для планирования путешествий.
Доработайте фрагмент кода, отвечающий за маршрут Москва-Париж. В коде допущен ряд ошибок:
где-то неправильно указано условие, где-то некорректно использовано отрицание.
Исправьте ошибки так, чтобы приложение работало корректно в соответствии с техническим заданием.
ТЗ от заказчика:
Если вводится летний месяц — рекомендуем остаться в Москве.
Если прямые билеты в Париж дешевле билетов с пересадкой в Лондоне,
то советуем лететь напрямую.
Если билеты с пересадкой в Лондоне дешевле или равны по стоимости прямым
билетам в Париж и у путешественника есть британская виза, то рекомендуем лететь через Лондон.

Условие monthNumber > 12 можно инвертировать либо через изменение знака
monthNumber <= 12, либо через отрицание !(monthNumber > 12).
В методе getSeasonByNumber нужно сравнить переменную месяца с его порядковым номером.
Если monthNumber < 3, то зима, если monthNumber < 6, то весна и дальше по аналогии.
После определения времени года нужно добавить ветвление if c условием
season.equals("Лето") без отрицания. Чтобы программа завершила работу
в этом месте, после строки печати должен стоять оператор return.
В выражении !(ticketMoscowLondonParis < ticketMoscowParis) отрицание не нужно.
Выражение !(britainVisa == 0) лучше заменить на britainVisa != 0 или britainVisa == 1.

 */
