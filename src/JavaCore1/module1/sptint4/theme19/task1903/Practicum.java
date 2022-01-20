package JavaCore1.module1.sptint4.theme19.task1903;

public class Practicum {
    public static void main(String[] args) {
        int[] array = {1, 2, 65, 3, 5, 7, 54, 12, 46, 4, 2};
        System.out.println("Индекс искомого элемента: " + find(array, 3));
    }

    public static int find(int[] array, int elem) {
        ...
    }
}
/*
Похожим образом решается задача поиска произвольного элемента в массиве. Нужно написать метод, который на вход принимает
массив чисел и значение, которое нужно найти. Необходимо вернуть индекс искомого элемента. Разберём по шагам, что нужно
сделать для того, чтобы решить эту задачу.
Как и в задаче с поиском минимума, сначала нужно выбрать начальное значение для переменной index, в которой будет
храниться индекс искомого элемента. Это может быть любое отрицательное число. Как правило, выбирают –1. Это обусловлено
тем, что индексами в массиве могут быть только числа, большие или равные нулю: если искомого элемента в массиве нет,
то программа вернёт –1. Это число не может быть индексом, а значит, тот, кто вызвал код, поймёт,
что такого элемента в массиве нет.
После того как начальное значение для индекса зафиксировано, с помощью цикла нужно пройти по всем его элементам,
на каждом шаге сравнивая значение текущего с искомым. Как только они совпадут — цикл можно остановить,
а текущий индекс сохранить в переменной index.
Коротко этот алгоритм можно описать так

    Зафиксировать начальное значение для индекса — index = -1.
    Пройти по массиву с помощью цикла. На каждой итерации сравнивать значение текущего и искомого элементов.
    Если значения совпали — сохранить индекс в переменной index и завершить работу цикла.

Начните обходить все элементы массива через цикл for (int i = 0; i < array.length; i++).
Каждый элемент array[i] нужно сравнить с искомым значением elem. Если элементы равны,
цикл можно завершить досрочно и вернуть значение i.
Если ни одного совпадения не найдено, нужно вернуть -1
 */
