package JavaCore2.module2.sprint6.theme7.task0701;

import java.time.Instant;
import java.util.Scanner;
class Practicum {
    public static final int ONE_SECOND_MILLIS = 1000;
    public static final int ONE_MINUTE_MILLIS = 60 * 1000;
    public static final int ONE_HOUR_SECONDS = 60 * 60;
    public static final int ONE_HOUR_MILLIS = ONE_HOUR_SECONDS * 1000;
    public static final int ONE_DAY_SECONDS = 60 * 60 * 24;
    public static final int ONE_DAY_MILLIS = ONE_DAY_SECONDS * 1000;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите отметку времени начала экзамена (в миллисекундах):");
        long examStartMillis = scanner.nextLong();
        Instant examStart = Instant.ofEpochMilli(examStartMillis);
        System.out.println("Введено " + examStart);
        System.out.println("Введите отметку текущего времени (в миллисекундах):");
        long currentTimeMillis = scanner.nextLong();
        Instant currentTime = Instant.ofEpochMilli(currentTimeMillis);
        System.out.println("Введено " + currentTime);
        Instant timeToWakeUp = examStart.minusSeconds(ONE_HOUR_SECONDS);
        if (currentTime.isAfter(timeToWakeUp)) {
            System.out.println("На экзамен уже не успеть, готовься к пересдаче!");
            return;
        }
        if (currentTime.plusSeconds(ONE_DAY_SECONDS).isBefore(examStart)) {
            System.out.printf("Дней до экзамена: %.0f. До экзамена ещё слишком далеко, волноваться не о чем!%n", calculateDuration(currentTime, examStart, TimeUnits.DAYS));
            return;
        }
        System.out.println("Введите желаемую продолжительность сна (в часах):");
        int sleepGoalHours = scanner.nextInt();
        if (sleepGoalHours <= 0) {
            System.out.println("Надо поспать хоть сколько-то!");
            return;
        }
        int sleepGoalSeconds = sleepGoalHours * ONE_HOUR_SECONDS;
        Instant timeToGoToSleep = timeToWakeUp.minusSeconds(sleepGoalSeconds);
        if (currentTime.isAfter(timeToGoToSleep)) {
            System.out.println("Такое количество времени поспать уже не получится!");
            return;
        }
        System.out.printf("На учёбу остаётся: %.0f мс.%n", calculateDuration(currentTime, timeToGoToSleep, TimeUnits.MILLIS));
        System.out.printf(
                "Это %.2f мин. или %.2f ч.%n",
                calculateDuration(currentTime, timeToGoToSleep, TimeUnits.MINUTES),
                calculateDuration(currentTime, timeToGoToSleep, TimeUnits.HOURS)
        );
        System.out.printf("Ведь проснуться нужно уже через %.2f ч.%n", calculateDuration(currentTime, timeToWakeUp, TimeUnits.HOURS));
    }
    private static double calculateDuration(Instant firstMoment, Instant secondMoment, TimeUnits unit) {
        switch (unit) {
            case MILLIS: {
                return secondMoment.toEpochMilli() - firstMoment.toEpochMilli();
            }
            case SECONDS: {
                return (double) (secondMoment.toEpochMilli() - firstMoment.toEpochMilli()) / ONE_SECOND_MILLIS;
            }
            case MINUTES: {
                return (double) (secondMoment.toEpochMilli() - firstMoment.toEpochMilli()) / ONE_MINUTE_MILLIS;
            }
            case HOURS: {
                return (double) (secondMoment.toEpochMilli() - firstMoment.toEpochMilli()) / ONE_HOUR_MILLIS;
            }
            case DAYS: {
                return (double) (secondMoment.toEpochMilli() - firstMoment.toEpochMilli()) / ONE_DAY_MILLIS;
            }
            default:
                return 0;
        }
    }
}
enum TimeUnits {
    MILLIS,
    SECONDS,
    MINUTES,
    HOURS,
    DAYS
}
/*
У Лёши есть проблема — в ночь перед экзаменами он часто сидит допоздна, повторяя материал.
Хорошо известно, что вероятность сдать экзамен выше, если накануне хорошенько поспать,
а не зубрить билеты всю ночь. Обычно Лёша нервничает и пытается посчитать, сколько времени
у него остаётся на повторение материала, при условии, что он хочет выспаться.
До начала экзаменов ещё неделя, поэтому в этот раз Лёша решил разработать программу, к
оторая делала бы это за него.
Он составил для программы следующее ТЗ:

Так как Лёша к текущему моменту изучил только класс Instant, то расчёты производить нужно с помощью него.
Сразу после запуска программа должна запрашивать время начала экзамена в миллисекундах Unix-эпохи.
Затем — текущее время, также в миллисекундах Unix-эпохи.
На сборы и дорогу до университета у Лёши обычно уходит один час. Поэтому проснуться ему нужно за час
до начала экзамена. Программа должна проверить, не опоздал ли уже Лёша,
иначе вывести сообщение о том, что Лёша проспал.
Лёша не хочет волноваться раньше времени. По этой причине введённый текущий момент
времени не должен быть раньше, чем за 24 часа до начала экзаменов. В ином случае выводится текст
с количеством дней до экзамена и сообщением о том, что готовиться ещё рано. Количество дней округляется до целых.
После этих проверок программа должна запросить желаемую продолжительность сна в часах.
Затем проверяется, что количество часов — положительное.
А также проверяется, что указанное количество минут вообще можно поспать
(продолжительность времени для сна должна быть не больше, чем промежуток времени
от текущего момента до момента пробуждения).
В итоге программа должна вывести количество времени, оставшееся для учёбы: сначала
в миллисекундах (без знаков после запятой), потом — в минутах и часах. Информацию о том,
сколько времени осталось до пробуждения, нужно вывести в часах.
Минуты и часы вывести с точностью двух знаков после запятой.

Лёша даже нашёл варианты миллисекунд в Unix-эпохе для тестирования программы:
1642413600000 соответствует 10:00 17.01.22 UTC, а 1642376700000 — 23:45 16.01.22 UTC.
💡 Найти варианты в миллисекундах можно с помощью онлайн-калькуляторов —
например, https://currentmillis.com.
К сожалению, Лёша уснул, пока писал программу.
Помогите ему дописать её (только пишите тихонечко, чтобы его не разбудить!).

Количество миллисекунд от Unix-эпохи необходимо сохранять в тип long,
поэтому для ввода данных воспользуйтесь методом nextLong().
Чтобы создать экземпляр класса Instant из миллисекунд от Unix-эпохи,
воспользуйтесь методом Instant.ofEpochMilli(long epochMilli).
Чтобы вычислить время пробуждения, необходимо вычесть от времени начала
экзамена один час с помощью метода minusSeconds(ONE_HOUR_SECONDS).
Сравнить два экземпляра Instant можно с помощью методов isAfter(Instant otherInstant)
и isBefore(Instant otherInstant).
Проверить, что до начала экзамена есть ещё 24 часа, можно с помощью
метода plusSeconds(ONE_DAY_SECONDS).isBefore(examStart).
В методе calculateDuration перед возвращением значения его необходимо привести к типу
double: (double). Иначе из-за целочисленного деления будет возвращено целое число.
Перевести разницу во времени можно произведя вычитание одного момента из другого и
поделив на количество миллисекунд в единице времени. Например, для минут это будет
(secondMoment.toEpochMilli() firstMoment.toEpochMilli()) / ONE_MINUTE_MILLIS
 */
