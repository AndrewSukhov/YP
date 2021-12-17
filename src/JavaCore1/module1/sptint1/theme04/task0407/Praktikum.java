package JavaCore1.module1.sptint1.theme04.task0407;

import java.util.Random;
import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {
        CarProperties userCarProperties =
                new CarProperties(
                        "100",
                        0.7f,
                        2
                );

        Car userCar = createCarByProperties(userCarProperties);
        System.out.println("Давно тебя не было в Яндекс.Гонках!");
        System.out.println("Характеристики твоего автомобиля:");
        // Напечайте характеристики автомобиля игрока
        System.out.println("- Максимальная скорость: " + userCar.maxSpeed);
        System.out.println("- Ускорение: " + userCar.acceleration);
        System.out.println("- Закись азота: " + userCar.nitroLevel);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Что выберете?");
            System.out.println("1 - Устроить заезд");
            System.out.println("2 - Показать статистику");
            System.out.println("3 - Закончить игру");
            int command = scanner.nextInt();

            if (command == 1) {
                Car opponentCar = generateOpponentCar();
                System.out.println("Характеристики автомобиля соперника:");
                // Напечайте характеристики автомобиля соперника
                System.out.println("- Максимальная скорость: " + opponentCar.maxSpeed);
                System.out.println("- Ускорение: " + opponentCar.acceleration);
                System.out.println("- Закись азота: " + opponentCar.nitroLevel);

                int distance = generateInt(5, 70);
                System.out.println("Гонка будет проходить на дистанции: " + distance + " км.");

                int points = makeRace(userCar, opponentCar, distance);
                changePointAndDistance(userCar, points, distance); // передайте в метод аргументы

            } else if (command == 2) {
                // Напечайте количество заработанных очков и пройденных километров
                System.out.println("- Количество заработанных очков: " + userCar.score);
                System.out.println("- Пройдено километров на этом авто: " + userCar.kilometersTravelled);
            } else if (command == 3) {
                System.out.println("Увидимся!");
                break;
            }
        }
    }

    private static void changePointAndDistance(Car car, int points, int distance) { // реализуйте метод
        // В результате выполнения метода у userCar количество очков должно увеличиться
        // на значение points, пройденное расстояние - на значение distance.
        car.score += points;
        car.kilometersTravelled += distance;
    }

    private static int makeRace(Car userCar, Car opponentCar, int distance) {
        printFlag();
        // Напишите логические выражения для определения победителя
        boolean shortRaceWin = distance <=15; // на короткой дистанции
        boolean longRaceWin = distance > 50; // на длинной дистанции

        if ((shortRaceWin &&  userCar.acceleration > opponentCar.acceleration)
                || (longRaceWin && userCar.maxSpeed > opponentCar.maxSpeed)) { // если победил на короткой или на длинной дистанции
            System.out.println("Вы выиграли!");
            // Найдите и верните наибольшее из максимальных скоростей
            return (int) Double.max(userCar.maxSpeed, opponentCar.maxSpeed);
        } else if (userCar.acceleration == opponentCar.acceleration) { // Уровни ускорения должны быть равны
            System.out.println("Ничья!");
            return 0;
        } else {
            // Сравните уровни закиси азота
            if (userCar.nitroLevel > opponentCar.nitroLevel) {
                System.out.println("Вы проиграли, но благодаря закиси азота сохранили очки.");
                return 0;
            } else {
                System.out.println("Вы проиграли(");
                return -100;
            }
        }
    }
    private static void printFlag() { // Метод печатает флаг
        System.out.println("_\n" +
                "\\'-,,.\n" +
                " \\    \\\n" +
                "  \\-..,\\\n" +
                "   \\\n" +
                "    \\\n");
    }
    // Метод генерирует авто противника
    private static Car generateOpponentCar() {
        // С помощью метода generateInt() генерируем число от 75 до 125
        double maxSpeed = generateInt(75, 125);
        // Чтобы создать число от 0.4 до 1, с помощью метода generateInt() генерируем число от 4 до 10,
        // после чего делим его на 10
        float acceleration = generateInt(4, 10) / 10.0f;
        int score = 0;
        // С помощью метода generateInt() генерируем число от 1 до 5
        Integer nitroLevel = generateInt(1, 5);

        return new Car(
                maxSpeed,
                acceleration,
                score,
                nitroLevel
        );
    }

    // Этот метод создаёт случайное число в промежутке от from до to
    private static int generateInt(int from, int to) {
        int diapason = to - from;
        int offence = new Random().nextInt(diapason);
        return from + offence;
    }

    private static Car createCarByProperties(CarProperties carProperties) {
        // Конвертируйте параметры в нужные типы
        double maxSpeed = Double.parseDouble(carProperties.maxSpeed);
        float acceleration = (float) carProperties.acceleration;
        int score = carProperties.initialScore;
        Integer nitroLevel = getNitroLevel(carProperties.nitroLevel);

        return new Car( // Метод возвращает экземпляр класса Car
                maxSpeed,
                acceleration,
                score,
                nitroLevel
        );
    }

    private static Integer getNitroLevel(int nitroLevel) {
        // Пропишите логику по конвертации параметра nitroLevel
        if (nitroLevel == 0)
            return null;
        else
            return nitroLevel;
    }
}
/*
Это финальный тренажёр по темам «Типы в Java» и «Операции с примитивами».
Сразу предупреждаем — он непростой и чтобы его решить, придётся поломать голову.
Однако в нём нет подвоха — задание базируется на пройденном материале,
поэтому мы уверены, что вам по силам его выполнить.
Вам необходимо доработать игру — гонки. Игрок-пользователь соревнуется с противником,
сгенерированным компьютером. Победитель определяется по сравнению характеристик.
Действуйте по пунктам:
Внимательно прочитайте код. Разберитесь, как он устроен.
Допечатайте все нужные характеристики — для этого нужно обратиться к полям класса.
Реализуйте методы:
Параметры авто игрока будут подгружаться из отдельного сервиса, хранение данных
в котором отличается от используемого в игре.
Метод createCarByProperties(CarProperties carProperties), должен конвертировать
параметры в нужные типы и возвращает экземпляр класса Car.
Метод Integer getNitroLevel(int nitroLevel) должен возвращать значение nitroLevel.
Если nitroLevel равен нулю — тогда нужно вернуть null.
Метод makeRace(Car userCar, Car opponentCar, int distance) должен определять
победителя и возвращать количество полученных или проигранных очков:
Если гоночная дистанция — переменная distance — меньше или равна 15 километрам,
то победителем объявляется тот игрок, у автомобиля которого больше ускорение —
поле acceleration. Если дистанция больше 50 километров, то выигрывает тот,
у автомобиля которого наибольшая максимальная скорость — поле maxSpeed.
В случае победы игрока метод возвращает количество очков, равное наибольшему
из максимальных скоростей участников.
Если по первому условию определить победителя не удалось, сравниваются ускорения игроков.
Если они равны, объявляется ничья и метод возвращает 0 очков.
Если и ничью определить не удалось, сравнивается уровень закиси азота.
Если он строго больше, то метод возвращает 0 очков. Если нет, метод возвращает -100 очков.
Метод changePointAndDistance(...) должен менять количество очков на переданный аргумент
points и увеличивать количество пройденных километров на аргумент distance.
Если что-то не получается — на помощь придут подсказки и поддержка. Ничего не бойтесь
и гоните на полной скорости!

Чтобы напечатать характеристики автомобилей нужно обратиться к полям
maxSpeed, acceleration и nitroLevel через имя объекта userCar или opponentCar и точку.
В методе createCarByProperties(CarProperties carProperties)для конвертации maxSpeed
из типа String в примитив double используйте метод parseDouble. Для конвертации
acceleration из double во float необходимо использовать явное приведение (float).
Параметр acceleration из byte в int Java приведёт автоматически.
Для конвертации nitroLevel необходимо вызвать метод getNitroLevel(int nitroLevel) и
передать ему в качестве аргумента carProperties.nitroLevel.
Условие победы в методе makeRace(Car userCar, Car opponentCar, int distance):
или (||)одновременно выполняются условия
(distance <= 15) и (&&) (userCar.acceleration > opponentCar.acceleration),
или (distance > 50) и (&&) (userCar.maxSpeed > opponentCar.maxSpeed).
В методе makeRace(Car userCar, Car opponentCar, int distance) найти максимум
двух чисел типа double можно с помощью метода Double.max(). Метод Double.max()
возвращает тип double, который для корректной работы метода нужно явно привести к int.
Чтобы была ничья, должны совпасть ускорения userCar.acceleration == opponentCar.acceleration.
Чтобы изменить параметры у автомобиля пользователя в методе changePointAndDistance(),
необходимо передать экземпляр класса Car, очки points и дистанцию distance —
changePointAndDistance(Car car, int points, int distance).
Чтобы посчитать очки и километры используйте операции car.score += points;
и car.kilometersTravelled += distance;.

 */
