package JavaCore2.module2.sprint5.theme01.task0103.task02;

public class Capitalizator {
    public String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
/*
Маленькие дети часто забывают, что нужно начинать новое предложение с большой буквы.
Помогите им! Реализуйте метод capitalize(). Он должен переводить первый символ в переданной
строке в верхний регистр при помощи метода toUpperCase() и возвращать полученную строку.

Первый символ в строке нужно взять через substring(0,1) и перевести в верхний регистр через toUpperCase().
Затем заглавный символ нужно прибавить к оставшейся строке. Получить её позволит substring(1).
 */