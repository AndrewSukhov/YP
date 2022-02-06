package JavaCore1.module1.sptint4.theme21.task2101.task01;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practicum {
    // Пример списка пассажиров (на самом деле их больше)
    private static List<String> passengerNames = List.of(
            "Василий Петров",
            "Анна Ягирская",
            "Виктория Сотова",
            "Игорь Серов",
            "Людмила Ульянова"
    );

    public static void main(String[] args) {
        Map<String, Integer> seats = assignSeats(passengerNames);
        System.out.println("Места пассажиров: " + seats);
    }

    public static Map<String, Integer> assignSeats(List<String> passengerNames) {
        // Тут нужно написать код, который будет распределять места в самолёте ✈️
        Map<String, Integer> seats = new HashMap<>();
        int seat = 1;
        for (String passengerName : passengerNames) {
            seats.put(passengerName, seat);
            seat++;
        }
        return  seats;
    }
}
/*
У вас ответственное задание — нужно написать программу для авиакомпании,
которая будет распределять пассажиров по местам в самолёте. Чтобы не усложнять,
будем считать, что места идут последовательно: 1, 2, 3, …, 50, 51, 52 и так далее.
Заполните хеш-таблицу таким образом, чтобы каждому пассажиру в ней соответствовало его место в самолёте.

Для начала создайте хеш-таблицу, которая будет хранить места пассажиров: Map<String, Integer> seats = new HashMap<>();.
Чтобы у каждого следующего пассажира место было на одно больше от предыдущего,
нужна переменная-счётчик. Первое доступное место должно быть 1: int seat = 1;.
Создайте цикл по всем пассажирам и в теле цикла назначьте каждому пассажиру своё место.
Имя пассажира и назначенное место нужно сохранить в хеш-таблицу seats.
После назначения места пассажиру нужно не забывать увеличивать переменную-счётчик на 1: seat += 1;.
 */