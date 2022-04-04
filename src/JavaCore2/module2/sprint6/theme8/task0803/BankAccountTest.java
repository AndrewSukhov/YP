package JavaCore2.module2.sprint6.theme8.task0803;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class BankAccountTest {

    @Test
    public void shouldNotBeBlockedWhenCreated() {
        BankAccount account = new BankAccount("a", "b");
        assertFalse(account.isBlocked());
    }

    @Test
    public void shouldReturnZeroAmountAfterActivation() {
        BankAccount account = new BankAccount("a", "b");
        account.activate("RUB");
        assertEquals(new Integer(0), account.getAmount());
        assertEquals("RUB", account.getCurrency());
    }
}
/*
Ваш коллега-программист написал класс BankAccount, но не покрыл его функциональность тестами.
Коллега давно уволился, а класс используется практически везде в вашей программе, поэтому просто
выкинуть его нельзя. Придётся тестировать!
По остаткам документации вам удалось собрать следующую информацию:

Чтобы создать BankAccount, нужно передать два аргумента — имя и фамилию человека, владеющего счётом.
Имя владельца можно получить, вызвав метод name(). Результат вернётся в виде String[],
где по нулевому индексу будет имя человека, по первому — фамилия.
После создания счёт нужно дополнительно активировать при помощи метода activate(String currency).
До того как это произошло, метод amount() будет возвращать ошибку IllegalStateException("Счёт не активирован."),
а getCurrency() — null. Активный счёт всегда возвращает Integer , отличный от null.
Счёт можно заблокировать вызовом block.
Статус блокировки счёта можно узнать с помощью метода isBlocked().

Вам необходимо дописать 3 теста:

shouldBeBlockedAfterBlockIsCalled должен проверять, что счёт заблокирован, после вызова метода block().
shouldReturnFirstNameThenSecondName должен проверять, что при вызове метода getName() возвращается правильный массив строк.
shouldReturnNullAmountWhenNotActive должен проверять, что при вызове метода getAmount() для неактивного счёта,
значение currency равно null, а также выбрасывается исключение IllegalStateException с соответствующим сообщением.

В каждом тесте ваше первое действие — создать новый счёт.
После этого вызовите один из его методов и посмотрите на результат.
Чтобы проверить, что при неактивированном счёте вызывается IllegalStateException
с нужным сообщением, а переменная currency остаётся неинициализированной,
необходимо воспользоваться методом assertThrows(...), передав в него интерфейс
Executable() с вызовом метода getAmount().
С помощью метода assertNull(...) можно проверить, что переменная currency
не проинициализирована, а с помощью метода getMessage() — получить сообщение
из полученного исключения и сравнить его с ожидаемым.
Чтобы проверить, корректно ли изменяется булева переменная isBlocked, необходимо
вызвать метод block(), после чего проверить методом assertTrue().
Для проверки того, корректный ли массив возвращает метод getFullName(),
необходимо воспользоваться методом assertArrayEquals(...).

 */
