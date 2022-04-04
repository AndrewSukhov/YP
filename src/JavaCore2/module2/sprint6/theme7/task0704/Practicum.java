package JavaCore2.module2.sprint6.theme7.task0704;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

class Practicum {
    // Задайте форматирование для времени и даты в формате часы:минуты день.месяц.год
    // Пример - 12:15 02.11.21
    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm dd.MM.yy");
    // Задайте форматирование для времени в формате часы:минуты
    public static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm");

    public static void main(String[] args) {
        System.out.println("Тест №1:");
        printFlightInformation(
                "12:15 02.11.21",
                "VKO",
                "LED",
                30,
                1,
                55
        );
        System.out.println("\nТест №2:");
        printFlightInformation(
                "14:00 03.10.21",
                "SVX",
                "VVO",
                0,
                9,
                5
        );
        System.out.println("\nТест №3:");
        printFlightInformation(
                "06:00 12.12.21",
                "DME",
                "VVO",
                0,
                12,
                0
        );
        System.out.println("\nТест №4:");
        printFlightInformation(
                "23:00 29.03.22",
                "LED",
                "SVX",
                0,
                2,
                55
        );
    }

    private static void printFlightInformation(
            String formattedDepartureTime,
            String departureAirportCode,
            String arrivalAirportCode,
            int delay,
            int flightDurationHours,
            int flightDurationMinutes
    ) {
        Airport departureAirport;
        Airport arrivalAirport;
        // С помощью класса AirportDatabase получите данные об аэропортах вылета и посадки.
        // При получении исключения выведите сообщение исключения.
        try {
            departureAirport = AirportDatabase.getAirportByCode(departureAirportCode);
            arrivalAirport = AirportDatabase.getAirportByCode(arrivalAirportCode);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
            return;
        }
        // Создайте экземпляр ZonedDateTime с помощью formattedDepartureTime и зоны аэропорта вылета.
        LocalDateTime departureDateTime = LocalDateTime.parse(formattedDepartureTime, DATE_TIME_FORMATTER);
        ZoneId departureZoneId = ZoneId.of(departureAirport.getZone());
        ZonedDateTime departure = ZonedDateTime.of(departureDateTime, departureZoneId);
        // Выведите информацию о том, между какими городами будет перелёт.
        System.out.println("Ваш билет на рейс " + departureAirport.getCity() + " - " + arrivalAirport.getCity() + ": ");
        // Найдите продолжительность полёта.
        Duration flightDuration = Duration.ofHours(flightDurationHours).plusMinutes(flightDurationMinutes);
        // Найдите время прибытия с учётом зоны прилёта.
        ZoneId arrivalZoneId = ZoneId.of(arrivalAirport.getZone());
        ZonedDateTime arrival = departure.plus(flightDuration).withZoneSameInstant(arrivalZoneId);
        // Заполните данные для передачи в метод печати билета.
        // Город вылета
        String departureCity = departureAirport.getCityForTicket();
        // Город прилёта
        String arrivalCity = arrivalAirport.getCityForTicket();
        // Отформатированное время прилёта
        String formattedArrivalTime = arrival.format(DATE_TIME_FORMATTER);
        // Только время вылета
        String departureTimeOnly = departure.format(TIME_FORMATTER);
        printTicket(
                formattedDepartureTime,
                departureAirportCode,
                arrivalAirportCode,
                departureCity,
                arrivalCity,
                formattedArrivalTime,
                departureTimeOnly
        );
        // Добавьте проверку на случай задержки.
        if (delay > 0) {
            // Определите продолжительность задержки.
            Duration delayDuration = Duration.ofMinutes(delay);
            // Вычислите время вылета с учётом задержки.
            ZonedDateTime departureWithDelay = departure.plus(delayDuration);
            // Вычислите время прилёта с учётом задержки.
            ZonedDateTime arrivalWithDelay = arrival.plus(delayDuration);
            System.out.println("Ваш вылет задерживается.");
            // Выведите продолжительность задержки в формате часы:минуты
            System.out.println("Задержка: " + delayDuration.toHours() + ":" + delayDuration.toMinutesPart());
            // Выведите отформатированное время вылета с учётом задержки.
            System.out.println("Обновлённое время вылета: " + departureWithDelay.format(DATE_TIME_FORMATTER));
            // Выведите отформатированное время прилёта с учётом задержки.
            System.out.println("Обновлённое время прилёта: " + arrivalWithDelay.format(DATE_TIME_FORMATTER));
        } else {
            System.out.println("Удачного полёта!");
        }
    }

    private static void printTicket(
            String departureTime,
            String departureAirportCode,
            String arrivalAirportCode,
            String departureCity,
            String arrivalCity,
            String arrivalTime,
            String departureTimeOnly
    ) {
        System.out.println(
                " _______________________________________________________\n" +
                        "|                                            |          |\n" +
                        "|  " + departureCity + "|" + departureAirportCode + "      "
                        + departureTime + "  |   " + departureAirportCode + "    |\n" +
                        "|  " + arrivalCity + "|" + arrivalAirportCode + "      "
                        + arrivalTime + "  |   " + arrivalAirportCode + "    |\n" +
                        "|                                            |          |\n" +
                        "|  BOARDING TIME   --:--      SEAT  1A       |   " + departureTimeOnly + "  |\n" +
                        "|  GATE  23                                  |   1A     |\n" +
                        "|____________________________________________|__________|");
    }
}
/*
Сервис по продаже авиабилетов LeTumbler просит вас помочь дописать метод по выводу информации о рейсе.
Входные параметры:

Время и дата вылета в виде строки 12:30 25.12.21
Код аэропорта вылета
Код аэропорта прибытия
Количество минут, на которое задерживается рейс
Продолжительность полёта:
    Отдельно часы
    Отдельно минуты

По указанным параметрам необходимо вычислить актуальное время вылета
рейса и время его прибытия с учётом задержки. Вычисленные
значения необходимо передать в метод printTickets(...).
Также необходимо с помощью оператора switch-case дополнить метод
getAirportByCode(String airportCode). Для неверного кода аэропорта
выбросить исключение IllegalStateException с текстом «Неизвестный код аэропорта: [переданный код]».
Данное исключение необходимо обработать в коде: выполнение программы не должно на нём прерываться.

Необходимый формат времени и даты можно получить с помощью метода DateTimeFormatter.*ofPattern(*"HH:mm dd.MM.yy"*).*
Необходимый формат времени можно получить с помощью DateTimeFormatter.*ofPattern(*"HH:mm"*).*
Чтобы обработать исключение, необходимо получение данных обернуть в try catch:
java
     try {
              // исполняемый код
          } catch (IllegalStateException e) {
              System.out.println(e.getMessage());
              return;
          }

Собрать экземпляр ZonedDateTime можно из LocalDateTime и ZoneId с помощью метода ZonedDateTime.*of(...)*.
Получить LocalDateTime из входной строки можно с помощью метода LocalDateTime.*parse(*formattedDepartureTime,
*DATE_TIME_FORMATTER).*
Получить ZoneId можно с помощью метода ZoneId.*of(*departureAirport.getZone*())*.
Создать экземпляр класса Duration можно из переменных flightDurationHours и flightDurationMinutes:
Duration.*ofHours(*flightDurationHours*)*.plusMinutes*(*flightDurationMinutes*).*
Найти время прибытия в нужной временной зоне можно с помощью методов
departure.plus*(*flightDuration*)*.withZoneSameInstant*(*arrivalZoneId*).*
Вывести продолжительность полёта в формате часы:минуты можно с помощью
delayDuration.toHours*()* + ":" + delayDuration.toMinutesPart*().*

 */
