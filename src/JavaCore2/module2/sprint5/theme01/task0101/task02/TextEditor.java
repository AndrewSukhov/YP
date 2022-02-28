package JavaCore2.module2.sprint5.theme01.task0101.task02;

public class TextEditor {

    private boolean isCapsLock = false;

    public void capsLock() {
        // Здесь нужно изменить значение флага isCapsLock на противоположное
    }

    public void print(String str) {
        // А здесь распечатать строку в верхнем или нижнем регистре с учётом флага
    }
}
/*
Реализуйте методы capsLock() и print(). Первый устанавливает флаг isCapsLock в true или false.
Второй выводит строку в верхнем или оставляет регистр как есть в зависимости от этого флага.

Для изменения значения флага на противоположное можно взять его логическое отрицание true == !false.
Чтобы выбрать, в каком регистре выводить строку, можно использовать условную конструкцию if (...) {} else {}.
*/