package JavaCore1.module1.sptint1.theme05.task0506;

import java.util.ArrayList;
import java.util.HashMap;

public class Praktikum {
    public static void main(String[] args) {
        HashMap<String, ArrayList> stateHolidays = new HashMap<>();
        ArrayList<Integer> january = new ArrayList<>();
        january.add(1);
        january.add(7);
        stateHolidays.put("Январь", january);

        ArrayList<Integer> february = new ArrayList<>();
        february.add(23);
        stateHolidays.put("Февраль", february);

        ArrayList<Integer> march = new ArrayList<>();
        march.add(8);
        stateHolidays.put("Март", march);

        ArrayList<Integer> may = new ArrayList<>();
        may.add(1);
        may.add(9);
        stateHolidays.put("Май", may);

        ArrayList<Integer> june = new ArrayList<>();
        june.add(12);
        stateHolidays.put("Июнь", june);

        ArrayList<Integer> november = new ArrayList<>();
        november.add(4);
        stateHolidays.put("Ноябрь", november);

         System.out.println(stateHolidays);
    }
}
/*
Напишите код хеш-таблицы государственных праздников stateHolidays,
которая будет содержать месяцы и праздничные даты:
Январь — 1, 7;
Февраль — 23;
Март — 8;
Май — 1, 9;
Июнь — 12;
Ноябрь — 4.

Импортируйте классы HashMap и ArrayList.
Ключи хеш-таблицы stateHolidays должны быть строкового типа — String,
а значения — списки из целых чисел ArrayList<Integer>.
Создайте для каждого месяца свой список: january, february, march, may, june, november.
Добавьте в списки элементы с помощью метода add().
Добавьте элементы в хеш-таблицу с помощью метода put().
 */
