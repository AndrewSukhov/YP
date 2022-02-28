package JavaCore2.module2.sprint5.theme01.task0101.task02;

public class TextEditor {

    private boolean isCapsLock = false;

    public void capsLock() {
        isCapsLock = !isCapsLock;
    }

    public void print(String str) {
        if (isCapsLock) {
            System.out.println(str.toUpperCase());
        } else {
            System.out.println(str.toLowerCase());
        }
    }
}
/*
Реализуйте методы capsLock() и print(). Первый устанавливает флаг isCapsLock в true или false.
Второй выводит строку в верхнем или оставляет регистр как есть в зависимости от этого флага.

Для изменения значения флага на противоположное можно взять его логическое отрицание true == !false.
Чтобы выбрать, в каком регистре выводить строку, можно использовать условную конструкцию if (...) {} else {}.
*/