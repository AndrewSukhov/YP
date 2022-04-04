package JavaCore2.module2.sprint6.theme8.task0802;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class DiscountCalculatorTest {
    DiscountCalculator discountCalculator = new DiscountCalculator();
    @Test
    public void shouldGiveNoDiscountForValue999() {
        // Подготовка
        int buySum = 999;
        int expectedSum = 999;
        // Исполнение
        int resultSum = discountCalculator.sumAfterDiscount(buySum);
        // Проверка
        Assertions.assertEquals(expectedSum, resultSum);
    }
    @Test
    public void shouldGiveNoDiscountForValue1() {
        // Подготовка
        int buySum = 1;
        int expectedSum = 1;
        // Исполнение
        int resultSum = discountCalculator.sumAfterDiscount(buySum);
        // Проверка
        Assertions.assertEquals(expectedSum, resultSum);
    }
    @Test
    public void shouldGiveNoDiscountForValue333() {
        // Подготовка
        int buySum = 333;
        int expectedSum = 333;
        // Исполнение
        int resultSum = discountCalculator.sumAfterDiscount(buySum);
        // Проверка
        Assertions.assertEquals(expectedSum, resultSum);
    }
    @Test
    public void shouldGive2PercentDiscountForValue1000() {
        // Подготовка
        int buySum = 1000;
        int expectedSum = 980;
        // Исполнение
        int resultSum = discountCalculator.sumAfterDiscount(buySum);
        // Проверка
        Assertions.assertEquals(expectedSum, resultSum);
    }
    @Test
    public void shouldGive2PercentDiscountForValue2000() {
        // Подготовка
        int buySum = 2000;
        int expectedSum = 1960;
        // Исполнение
        int resultSum = discountCalculator.sumAfterDiscount(buySum);
        // Проверка
        Assertions.assertEquals(expectedSum, resultSum);
    }
}
/*
На текущий момент класс DiscountCalculatorTest покрывает только один тест-кейс из пяти.
Составьте ещё четыре теста, чтобы обеспечить полное покрытие класса DiscountCalculator.
Вам нужно покрыть все тест-кейсы из списка:

Если покупка на сумму 1–999 рублей, то скидка составляет 0%. 1.1. Совершить покупку на 1 рубль.
Ожидаемое поведение: стоимость покупки составляет 1 рубль. 1.2. Совершить покупку на 333 рубля.
Ожидаемое поведение: стоимость покупки составляет 333 рубля. 1.3. Совершить покупку на 999 рублей.
Ожидаемое поведение: стоимость покупки составляет 999 рублей.
Иначе скидка составляет 2%. 2.1. Совершить покупку на 1000 рублей. Ожидаемое поведение:
стоимость покупки составляет 980 рублей (-2%). 2.2. Совершить покупку на 2000 рублей. Ожидаемое поведение: стоимость покупки составляет 1960 рублей (-2%).

Наименование тестовых методов уже представлено в методе main.

Все ваши тесты будут похожи друг на друга. Можете скопировать содержание теста и поменять в нём
значения buySum и expectedSum. В случае ошибки метод assertEquals выбросит исключение.
В нём будет написано, какое из сравнений не прошло проверку.
 */
