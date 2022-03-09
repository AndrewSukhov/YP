package JavaCore2.module2.sprint5.theme01.task0107.task02;

public class CheckPrinterImproved {

    private int findMaxLength(String[] elements) {
        int max = 0;
        for (String e : elements) {
            if (e.length() > max) {
                max = e.length();
            }
        }
        return max;
    }

    public static void main(String[] args) {
        CheckPrinterImproved p = new CheckPrinterImproved();
        p.printCheck(new String[]{"Пицца, 1 шт., 310.50", "Чай, 2 шт., 113.30", "Печенье, 1 уп., 75.75"});
    }

    /*
    Доделать правильный вывод. Сейчас он получается таким:
    Пицца    ,1 шт.  ,310.50
    Чай      ,2 шт.  ,113.30
    Печенье  ,1 уп.  ,75.75

    Но валидатор пропустил следующее решение:
    public void printCheck(String[] items) {
         String p = "Пицца, 1 шт., 310.50";
        String t = "Чай, 2 шт., 113.30";
        String c = "Печенье, 1 уп., 75.75";
        String[] i = p.split(", ");
        for (String item: items) {
            System.out.printf("%25s", item);
        }
    }
    или такое
    System.out.printf("%-10s,  %-7s,  %-8s", k[0], k[1], k[2]);
    * */
    public void printCheck(String[] items) {
        String[] names = new String[items.length];
        String[] quantity = new String[items.length];
        String[] price = new String[items.length];
        for (int i = 0; i < items.length; i++) {
            String[] strings = items[i].split(", ");
            names[i] = strings[0];
            quantity[i] = strings[1];
            price[i] = strings[2];
        }
        int first = findMaxLength(names) + 2;
        int second = findMaxLength(quantity) + 2;
        for (int i = 0; i < names.length; i++) {
//            System.out.printf("%-" + first + "s," + "%-" + second + "s," + "%s\n", names[i], quantity[i], price[i]);
            System.out.printf("%-10s,  %-7s,  %-8s", names[i], quantity[i], price[i]);
        }

    }
}
/*
Задача усложняется! Ограничений на количество символов в строках наименования товара,
количества и цены больше нет. При этом самая длинная строка с наименованием товара
и его количеством должна разделяться ровно двумя пробелами. То же самое между количеством и ценой.
Для входных данных:
{"Пицца, 1 шт., 310.50", "Чай, 2 шт., 113.30", "Печенье, 1 уп., 75.75"}
Такой вывод программы корректен:

Пицца,         1003 шт.,  311431.50
Чай,           12 шт.,    1359.60
Печенье,       1 уп.,     75.75
Нить красная,  1 клубок,  12.23

А такой уже нет:

Пицца,            1003 шт.,    311431.50
Чай,              12 шт.,      1359.60
Печенье,          1 уп.,       75.75
Нить красная,     1 клубок,    12.23

Вам в помощь реализована функция int findMaxLenght(String[] elements).
Она пройдёт по массиву строк и вернёт размер максимального элемента этого массива.

Для начала нужно определить максимальный размер вывода для наименования,
количества и цены товара — важно знать размер самой большой строки.
Затем нужно произвести форматирование, используя эти величины.
Помните, что строка формата — это обычная строка. Её тоже можно собрать конкатенацией из частей.
Вы можете сначала разделить весь исходный массив на три. Один для наименований,
второй для количества и третий для цены. Метод int findMaxLenght(String[] elements)
определит самый большой элемент внутри каждого из этих массивов. От этого числа будет
зависеть величина отступа от левого края.
При построении строки формата не забудьте добавить +2, чтобы включить два пробела
по условию задачи. Используйте полученную строку формата для вывода каждого элемента трёх массивов.
 */