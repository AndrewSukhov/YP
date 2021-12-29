package JavaCore1.module1.sptint2.theme10.task1003.task02.model;

public class BedAndBreakfast { // сделайте класс общедоступным

    private int capacity; // число свободных номеров (10) сохраните в переменную capacity
    private boolean full; // сохраните в переменную full значение false - есть номера в наличии

    public BedAndBreakfast() {
        capacity = 10;
        full = false;
    }

    public void book() { // метод для бронирования комнат
        if (!full) { // если есть свободные номера
            System.out.println("Забронирован ещё один номер!");
            capacity--; // уменьшите количество свободных номеров на один
            printRooms();
            if (capacity == 0) {
                full = true;
            }
        } else {
            System.out.println("Свободных номеров нет!");
        }
    }

    private void printRooms() {
        System.out.println("Свободных номеров - " + capacity);
    }

    public void free() { // метод для освобождения комнат
        if (capacity < 10 && capacity > 0) { // если свободных комнат меньше 10
            capacity++; // увеличиваем количество свободных мест на одно
            System.out.println("Освободился номер!");
            printRooms();
            full = false;
        } else {
            System.out.println("В гостинице только 10 номеров.");
        }
    }

    public boolean isFull() {
        return full;
    }
}
/*
Напишите программу для бронирования комнаты с завтраком в мини-отеле “Royal Java Bed and Breakfast”. В нём 10 номеров.
Реализуйте методы для заселения book() и выезда free() гостей. Расставьте нужные модификаторы доступа: переменные
capacity (вместимость) и full (заполненность), а также метод printRooms() нужно скрыть — доступ к ним должен остаться
только внутри класса BedAndBreakfast. Сам класс BedAndBreakfast и другие методы в нём должны иметь максимальный уровень доступа.

 Чтобы импортировать классы BedAndBreakfast и Scanner нужно ключевое слово import и имена пакетов:
 ru.yandex.practicum.model и java.util.
Класс BedAndBreakfast, методы book(), free(), isFull() должны иметь модификатор public.
Переменные int capacity и boolean full, метод printRooms(), модификатор private.
Проверить, есть ли свободные номера в методе book(), нужно с помощью отрицания — !full.
Количество свободных номеров в методе free() должно быть строго меньше 10 — capacity < 10.
Для увеличения и уменьшения числа номеров в методах используйте инкремент и декремент: capacity++ и capacity--.

 */