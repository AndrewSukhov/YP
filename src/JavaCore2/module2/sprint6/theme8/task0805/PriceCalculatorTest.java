package JavaCore2.module2.sprint6.theme8.task0805;

/*import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class PriceCalculatorTest {
    private final PriceCalculator priceCalculator = new PriceCalculator();
    @Test
    public void shouldThrowExceptionWhenBikeAndDistanceIs0Km() {
        IllegalArgumentException ex = Assertions.assertThrows(
                IllegalArgumentException.class,
                generateExecutable(TransportType.BIKE, 0)
        );
        Assertions.assertEquals("Distance should be more than 0 km", ex.getMessage());
    }
    @Test
    public void shouldThrowExceptionWhenBikeAndDistanceIsMoreThan20km() {
        IllegalArgumentException ex = Assertions.assertThrows(
                IllegalArgumentException.class,
                generateExecutable(TransportType.BIKE, 21)
        );
        Assertions.assertEquals("Bike can not go for more than 20 km", ex.getMessage());
    }
    @Test
    public void shouldReturn200ForBikeAndDistanceIs20() {
        Assertions.assertEquals(priceCalculator.calculatePrice(TransportType.BIKE, 20), 200);
    }
    @Test
    public void shouldThrowExceptionWhenCarAndDistanceIs0Km() {
        IllegalArgumentException ex = Assertions.assertThrows(
                IllegalArgumentException.class,
                generateExecutable(TransportType.CAR, 0)
        );
        Assertions.assertEquals("Distance should be more than 0 km", ex.getMessage());
    }
    @Test
    public void shouldThrowExceptionWhenCarAndDistanceIsMoreThan1000km() {
        IllegalArgumentException ex = Assertions.assertThrows(
                IllegalArgumentException.class,
                generateExecutable(TransportType.CAR, 1001)
        );
        Assertions.assertEquals("Car can not go for more than 1000 km", ex.getMessage());
    }
    @Test
    public void shouldReturn7000ForCarAndDistanceIs1000() {
        Assertions.assertEquals(priceCalculator.calculatePrice(TransportType.CAR, 1000), 7000);
    }
    @Test
    public void shouldThrowExceptionWhenTruckAndDistanceIs0Km() {
        IllegalArgumentException ex = Assertions.assertThrows(
                IllegalArgumentException.class,
                generateExecutable(TransportType.TRUCK, 0)
        );
        Assertions.assertEquals("Distance should be more than 0 km", ex.getMessage());
    }
    @Test
    public void shouldReturn5000ForTruckAndDistanceIs1000() {
        Assertions.assertEquals(priceCalculator.calculatePrice(TransportType.TRUCK, 1000), 5000);
    }
    @Test
    public void shouldThrowExceptionWhenDroneDeliveryIsRequested() {
        UnsupportedOperationException ex = Assertions.assertThrows(
                UnsupportedOperationException.class,
                generateExecutable(TransportType.DRONE, 1)
        );
        Assertions.assertEquals(
                "transport type 'DRONE' is not handled correctly",
                ex.getMessage());
    }
    private Executable generateExecutable(TransportType type, int distance) {
        return () -> priceCalculator.calculatePrice(type, distance);
    }
}*/
/*
Вам нужно доработать тесты для класса PriceCalculator по расчёту стоимости доставки
в зависимости от расстояния и типа транспорта.
Когда класс только разрабатывался, поддерживался единственный тип транспорта —
велосипед (BIKE). К сожалению, тестированию тогда внимания не уделялось, и был
написан всего один тест. Теперь к обрабатываемым типам транспорта добавились
легковая машина (CAR) и фура (TRUCK). Также есть пока что неиспользуемый тип
транспорта — квадрокоптер (DRONE). Вам нужно доработать тесты для велосипеда,
машины, фуры и квадрокоптера в соответствии с правилами:

Доставка осуществляется только на расстояния больше 0 км.
На велосипеде можно доставлять грузы на расстояние до 20 км (включительно).
Стоимость доставки задана через переменную-константу BIKE_PRICE_PER_KM.
Машина может доставлять грузы на расстояние до 1000 км (включительно).
Стоимость доставки задана через переменную-константу CAR_PRICE_PER_KM.
Грузовик может доставлять грузы на любые расстояния. Стоимость доставки
задана через переменную-константу TRUCK_PRICE_PER_KM.
В случае выхода за границы доставки для определённого
транспорта выбрасывается исключение.
Доставка на квадрокоптере не поддерживается. В случае попытки
рассчитать для него доставку выбрасывается исключение.

Вам требуется определить необходимый минимальный набор тестов, чтобы
полностью проверить корректность программы и написать эти тесты.

Всего должно быть девять тестов: три для велосипеда (один уже написан),
три для автомобиля, два для фуры и один для квадрокоптера.
Для каждого вида транспорта один из тестов должен проверять позитивное
поведение, другие проверяют ошибки, если дистанция равна 0 или если дистанция
больше допустимой. Для квадрокоптера тест должен проверять соответствующую ошибку.
Для проверки лучше использовать граничные значения — например, 1000 и 1001 для автомобиля.
Для позитивных тестов удобно использовать названия вида
shouldReturn[число]For[транспорт]AndDistanceIs[дистанция]Km(). В них вам нужно:
вызвать метод calculatePrice(...) с соответствующим транспортом и дистанцией;
сохранить результат в переменную price;
с помощью Assertions.assertEquals(...) сравнить ожидаемый результат с фактическим.
Для негативных сценариев можно использовать названия
shouldThrowExceptionWhen[транспорт]AndDistanceIs[дистанция]Km().
В методе Assertions.assertThrows(...) вызвать метод
generateExecutable(...) с нужным транспортом и дистанцией.
Результат выполнения assertThrows(...) сохранить в переменную ex.
С помощью Assertions.assertEquals(...) сравнить ожидаемое сообщение в исключении с фактическим.

 */
