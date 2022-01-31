package JavaCore1.module1.sptint4.theme20.task2006;

public class Practicum {

    public static void main(String[] args) {
        RentedFilm film1 = new RentedFilm(
                "Терминатор",
                new DateTime(20, 11, 2021, 10, 0, 0),
                new DateTime(27, 11, 2021, 23, 58, 58)
        );
        System.out.println("Фильм Терминатор взят в аренду: " + film1.getTimeOfRent());
        System.out.println("Фильм должен быть вернут до: " + film1.getTimeOfReturn());


        DateTime today = new DateTime(27, 11, 2021, 23, 58, 59);

        System.out.println("Сегодняшнее число: " + today);

        DateTimeComparator comparator = new DateTimeComparator();
        boolean shouldAlreadyBeReturned = comparator.compare(today, film1.getTimeOfReturn()) > 0;

        System.out.println("Прошло ли время возврата? " + (shouldAlreadyBeReturned ? "Да!" : "Нет!"));
    }
}
/*
В приложении по прокату фильмов обнаружилась уязвимость!
Для класса, представляющего дату проката фильма DateTime,
неправильно реализован интерфейс Comparator<T>.
Из-за этого любой зритель может брать фильм в прокат на целый год.
Измените имплементацию интерфейса Comparator<DateTime> —
DateTimeComparator таким образом, чтобы она сравнивала две даты по всем полям,
а не только по году. Взятый в прокат фильм представлен классом RentedFilm.
Запустите код класса Practicum, чтобы проверить корректность вашей реализации компаратора.

Если фильмы равны по дате выпуска — далее нужно произвести сравнение по месяцу.
Если и по месяцу они равны, сравнение нужно продолжить и сравнить дни.
Как только найден параметр, по которому даты расходятся — необходимо
вернуть результат Integer.compare(.., ..) в качестве результата компаратора.
 */
