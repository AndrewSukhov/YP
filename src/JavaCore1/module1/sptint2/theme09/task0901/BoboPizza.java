package JavaCore1.module1.sptint2.theme09.task0901;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoboPizza {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<BikeTimeCalculator> bikes = new ArrayList<BikeTimeCalculator>() {{
            add(new BikeTimeCalculator("Иван"));
            add(new BikeTimeCalculator("Василий"));
            add(new BikeTimeCalculator("Инга"));
        }};
        List<CarTimeCalculator> cars = new ArrayList<CarTimeCalculator>() {{
            add(new CarTimeCalculator("Ольга"));
            add(new CarTimeCalculator("Пётр"));
        }};
        List<HumanTimeCalculator> humans = new ArrayList<HumanTimeCalculator>() {{
            add(new HumanTimeCalculator("Анна"));
            add(new HumanTimeCalculator("Дмитрий"));
            add(new HumanTimeCalculator("Алексей"));
        }};
        new BoboPizza().loop();
    }

    private void loop() {
        CourierSelector selector = new CourierSelector(bikes, cars, humans);

        DeliveryInfo delivery = null;

        do {
            System.out.print("Введите расстояние в метрах => ");
            int distance = scanner.nextInt();
            delivery = selector.selectDelivery(distance);
            if (delivery != null) {
                System.out.println(
                        "Пицца будет доставлена через " + delivery.getTime() + " минут(у,ы)."
                );
                System.out.println("Ваш курьер - " + delivery.getName() + ".");
            } else {
                System.out.println("Доступных курьеров не найдено");
            }
        } while (delivery != null);
    }
}
/*
Перед вами программа-диспетчер для организации работы курьеров «БобоПицца».
Она считает время на доставку и предлагает заказ свободному курьеру.
На длинные дистанции (более 10 км) отправляются курьеры на машинах,
а на самые короткие (менее 2 км) пешеходы. Всё остальное выполняют
курьеры-велосипедисты. Эту программу писал стажёр и что-то напутал
с областями видимости. Исправьте код программы,
чтобы стажёр смог пройти испытательный срок.

Убедитесь, что в области видимости метода getBikeDelivery нет переменных с одинаковыми именами.
Обратите внимание на объявление переменной delivery в методе selectDelivery .
Проверьте, что все переменные, которые используются в методе loop, объявлены в нём.
Проверьте объявление speed, переменная не может использоваться раньше, чем она объявлена.

 */
