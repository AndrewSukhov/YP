package JavaCore1.module1.sptint2.theme10.task1007.task02;

class Practicum {
    public static void main(String[] args) {
        ModelZ testCar = new ModelZ();

        System.out.println("Характеристики модели:");
        System.out.println("Ускорение: " + testCar.acceleration + " км/(ч*с)");
        System.out.println("Максимальная скорость: " + testCar.maxSpeed + " км/ч");

        System.out.println("\nНачало теста!");

        System.out.println("Едем на автопилоте:");
        for (int second = 0; second < 5; second++) {
            testCar.accelerateByAutopilot();
        }
        System.out.print("Скорость Z спустя 5с на автопилоте: " + testCar.speed + " км/ч");
        checkResult(55.0, testCar.speed);

        for (int second = 0; second < 5; second++) {
            testCar.accelerateByAutopilot();
        }
        System.out.print("Скорость Z спустя ещё 5с на автопилоте: " + testCar.speed + " км/ч");
        checkResult(60.0, testCar.speed);


        System.out.println("Переходим в ручной режим:");
        for (int second = 0; second < 2; second++) {
            testCar.accelerate();
        }
        System.out.print("Скорость Z спустя 2с в ручном режиме: " + testCar.speed + " км/ч");
        checkResult(260.0, testCar.speed);

        for (int second = 0; second < 2; second++) {
            testCar.accelerate();
        }
        System.out.print("Скорость Z спустя ещё 2с в ручном режиме: " + testCar.speed + " км/ч");
        checkResult(300.0, testCar.speed);


        System.out.println("Проверяем торможение:");
        int brakingTime = 0;
        while (testCar.speed > 0) {
            testCar.brake();
            brakingTime++;
        }
        System.out.print("Время торможения до полной остановки: " + brakingTime + "c");
        checkResult(3, brakingTime);
        System.out.print("Скорость Z: " + testCar.speed + " км/ч");
        checkResult(0.0, testCar.speed);
    }

    private static void checkResult(double expect, double actual) {
        if (expect == actual) {
            System.out.println(" ✅");
        } else {
            System.out.println(" ❌");
        }
    }

    private static void checkResult(int expect, int actual) {
        if (expect == actual) {
            System.out.println(" ✅");
        } else {
            System.out.println(" ❌");
        }
    }
}
/*
Систему тестирования модели “Z” от “Tezla” доработали и убрали лишнее. Код теперь запускается, но есть проблема —
результаты тестов не совпадают с ожидаемыми. Из-за технического сбоя файл Automobile оказался недоступен.
Вносить изменения в класс Practicum также нельзя. Менять код можно только в файлах Tezla и ModelZ.
Исправьте код таким образом, чтобы все тесты проходили успешно. Учитывайте, что сейчас метод accelerateByAutopilot()
не учитывает максимальную скорость автопилота. Добавьте в него условие, чтобы ускорение происходило,
только если скорость автомобиля меньше максимальной скорости автопилота. Если условие не выполняется, то значит,
что скорость равна максимальной. Затем переопределите методы accelerate() и brake().
Итоговый вывод в консоли должен быть таким:

Характеристики модели:
Ускорение: 100.0 км/(ч*с)
Максимальная скорость: 300.0 км/ч

Начало теста!
Едем на автопилоте:
Скорость Z спустя 5с на автопилоте: 55.0 км/ч ✅
Скорость Z спустя ещё 5с на автопилоте: 60.0 км/ч ✅
Переходим в ручной режим:
Скорость Z спустя 2с в ручном режиме: 260.0 км/ч ✅
Скорость Z спустя ещё 2с в ручном режиме: 300.0 км/ч ✅
Проверяем торможение:
Время торможения до полной остановки: 3c ✅
Скорость Z: 0.0 км/ч ✅


Максимальная скорость в ручном режиме — 300 км/ч, значит, необходимо в конструкторе ModelZ установить в maxSpeed значение 100.
После поездки на автопилоте скорость автомобиля должна быть 60 км/ч, а после 2 секунд в ручном режиме должна стать 260 км/ч.
Значит, в конструкторе ModelZ нужно установить в acceleration значение 100.
Ускорение на автопилоте происходит, только если скорость автомобиля меньше максимальной скорости
if (speed < autoPilotMaxSpeed) {speed += autoPilotAcceleration;}, в обратном случае else {speed = autoPilotMaxSpeed;}.
При ускорении: если скорость меньше максимальной if (speed < maxSpeed), машина разгоняется speed += acceleration,
пока не достигнет максимума speed = maxSpeed.
При торможении: если скорость больше нуля if (speed > 0), машина сбрасывает скорость speed -= brakingSpeed до полной остановки speed = 0.
Не забудьте добавить аннотацию @Override перед переопределяемыми методами.
 */
