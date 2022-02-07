package JavaCore1.module1.sptint4.theme21.task2103.task01;

import java.util.HashMap;
import java.util.Map;

public class Practicum {
    public static void main(String[] args) {
        // ключ – автомобиль, значение – цена
        Map<Car, Integer> cars = new HashMap<>();

        // хеш-таблица заполняется данными
        cars.put(new Car("Audi A6", 3_760_000), 2);
        cars.put(new Car("Honda CR-V ", 2_500_000), 3);
        cars.put(new Car("KIA Cerato", 1_300_000), 8);
        cars.put(new Car("Volkswagen Tiguan", 1_935_000), 5);

        // проверяем порядок
        for (Car car : cars.keySet()) {
            System.out.println(car);
        }
    }
}

class Car {
    String model;
    Integer priceInRubles;

    public Car(String model, Integer priceInRubles) {
        this.model = model;
        this.priceInRubles = priceInRubles;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return model.equals(car.model);
    }

    public int hashCode() {
        return model.hashCode();
    }

    public String toString() {
        return "Car{model=" + model + ", priceInRubles=" + priceInRubles + "}";
    }
}
/*
Представьте, что вы работаете над системой, которая автоматизирует работу автосалона. В ней хранится информация
о всех марках автомобилей, доступных для заказа. Усовершенствуйте код так, чтобы машины в хеш-таблицы хранились
в отсортированном виде. Сортировка должна быть по цене — от дешёвых к дорогим.

    Замените HashMap на TreeMap.
    Класс Car должен реализовывать интерфейс Comparable.

class Car implements Comparable<Car>

    Реализация метода compareTo должны быть такой:

public int compareTo(Car o) {
    return this.priceInRubles - o.priceInRubles;
}
 */
