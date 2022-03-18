package JavaCore2.module2.sprint5.theme01.task0107.task01;

public class CheckPrinter {
    public void printCheck(String[] items) {
        for (String item: items) {
            String[] strings = item.split(", ");
            System.out.printf("%-10s, %-15s, %-23s", strings[0], strings[1], strings[2]);
        }
    }
}
/*
Допишите программу для вывода на экран информации из чека.
На вход подаётся массив строк вида
{"Пицца, 1 шт., 310.50", "Чай, 2 шт., 113.30", "Печенье, 1 уп., 75.75"}.
Наименование товара состоит не более чем из восьми символов, количество
не более чем из пяти, а цена не более чем из шести символов.
В результате исполнения метода на экран должен напечататься чек.
Все его элементы должны быть выровнены по левому краю. Между ними
должно быть минимум два пробела. Ограничений на максимальный вывод нет,
равно как и ограничений на количество пробелов между наименованием / количеством / ценой.
Пример обработанных данных (оба варианты корректны):

Пицца,    1 шт.,  310.50
Чай,      2 шт.,  113.30
Печенье,  1 уп.,  75.75

Пицца,       1 шт.,     310.50
Чай,         2 шт.,     113.30
Печенье,     1 уп.,     75.75

Исходную строку для начала нужно разбить на элементы при помощи .split(", ").
Ограничения на количество символов в наименовании товара, количестве и цене
даны не просто так — их можно использовать для выравнивания строки через форматирование.
Например, для ограничения в восемь символов можно использовать формат %-10s.
Это включит и строку наименования товара, и пару пробелов для красивого вывода.
 */