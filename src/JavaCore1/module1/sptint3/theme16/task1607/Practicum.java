package JavaCore1.module1.sptint3.theme16.task1607;

import java.util.Scanner;

public class Practicum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Заполните данные для ипотечной заявки и узнайте статус одобрения");
        System.out.println("Введите ФИО:");
        String name = scanner.nextLine();

        System.out.println("Ваш возраст:");
        byte age = scanner.nextByte();

        System.out.println("Планируемая сумма ипотеки:");
        int mortgageAmount = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Трудоустроены ли вы сейчас?");
        boolean employed = scanner.nextBoolean();

        MortgageRequest mortgageRequest = new MortgageRequest(name, age, mortgageAmount, employed);
        mortgageRequest.validate();

    }

}
/*
Ваша команда разрабатывает приложение, которое помогает пользователю заполнить заявку на ипотеку.
Пользователь вводит данные для покупки квартиры: фамилию, имя и отчество, возраст, сумму ипотеки
и указывает свой статус по трудоустройству. Задача вашего приложения — проверить данные, которые
заполнил пользователь, и показать предварительный ответ банка.
Вам необходимо написать валидацию данных пользователя, используя типизированные классы. Ипотека
может быть выдана только людям 18 лет и старше, минимальная сумма ипотеки — 1.000.000,
а максимальная — 10.000.000, человек обязательно должен быть трудоустроенным.

Чтобы базовый класс мог принимать значения любого типа, его необходимо сделать типизированным,
указав в его объявлении параметр типа T: public abstract class ValidationRule<T>.
Объявленный параметр типа T можно использовать в типизированном классе, когда необходимо
указать тип переменной: T value.
Чтобы унаследоваться от типизированного класса, необходимо указать ключевое слово extends,
затем имя базового класс и в угловых скобках указать значение параметра типа:
public class AgeValidationRule extends ValidationRule<Byte>.

 */