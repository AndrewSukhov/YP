package JavaCore1.module1.sptint2.theme10.task1006;

class Practicum {
    public static void main(String[] args) {
        ModelZ testCar = new ModelZ();

        System.out.println("Характеристики модели:");
        System.out.println("Ускорение: " + testCar.acceleration + " км/(ч*с)");
        System.out.println("Максимальная скорость: " + testCar.maxSpeed + " км/ч");
        // Символ \n позволяет оставлять пустую строку в консоли
        System.out.println("\nНачало теста!");
        System.out.println("Количество колёс: " + testCar.wheelsNumber);

        testCar.turnTo("Север");
        System.out.println("Направление: " + testCar.direction);
        System.out.println("Едем на автопилоте:");
        for (int second = 0; second < 5; second++) {
            testCar.accelerateByAutopilot();
        }
        System.out.println("Скорость Z спустя 5с на автопилоте: " + testCar.speed + " км/ч");
        for (int second = 0; second < 5; second++) {
            testCar.accelerateByAutopilot();
        }
        System.out.println("Скорость Z спустя ещё 5с на автопилоте: " + testCar.speed + " км/ч");

        System.out.println("Переходим в ручной режим:");
        for (int second = 0; second < 2; second++) {
            testCar.accelerate();
        }
        System.out.println("Скорость Z спустя 2с в ручном режиме: " + testCar.speed + " км/ч");
        System.out.println("Проверяем торможение:");
        int brakingTime = 0;
        while (testCar.speed > 0) {
            testCar.brake();
            brakingTime++;
        }
        System.out.println("Время торможения до полной остановки: " + brakingTime + "c");
    }
}
/*
На заводе скоростных автомобилей «Tezla» построили новую модель «Z». Перед выходом на рынок её необходимо протестировать.
Но с программой для тестирования что-то не так — в ней смешались классы из двух разных проектов и пропали все наследственные связи.
Вам нужно отсеять лишние классы и восстановить цепочку наследования. После того, как это будет сделано, проверьте модификаторы —
везде ли обеспечен необходимый уровень доступа!

Классы Train, TezlaTruck и ModelP никак не участвуют в тестовой программе.
В классе Transport не может быть полей с модификатором доступа private. Допустимые модификаторы для его полей —
public, protected или по умолчанию.
Чтобы в классе Automobile сработал конструктор, его необходимо наследовать от Transport. Это также даст возможность
унаследовать поля speed, maxSpeed, acceleration и brakingSpeed.
Чтобы использовать метод turnTo(String worldSide), класс TezlaCar должен наследоваться от Automobile.
Чтобы у экземпляра класса ModelZ появился метод accelerateByAutopilot(), ModelZ должен наследоваться от TezlaCar,
а модификатор accelerateByAutopilot() не должен быть private.

 */
