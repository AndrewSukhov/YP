package JavaCore2.module2.sprint5.theme01.task0102.task02;

public class SubstringFunctions {
    public boolean endsWith(String initial, String other) {
        int otherLength = other.length();
        int entry =  initial.lastIndexOf(other);
        int initialLength = initial.length();
        return initialLength - otherLength == entry;
    }
}
/*
Теперь вам нужно реализовать метод boolean endsWith(String initial, String other) — для
поиска не по началу слова, а по окончанию. Метод должен возвращать true, если строка initial
заканчивается на строку other, иначе false. Например, для сочетания «жираф» и «раф»,
результат должен быть true, так как строка «жираф» заканчивается на слово «раф»,
а вот для сочетания «кошка» и «каша» должно вернуться false.

Чтобы написать алгоритм, возьмите конкретный пример. Допустим, у вас есть строки «ик» и «котик».
Для начала определить, начиная с какой позиции первое входит во второе.
Индекс вхождения other в initial определим через initial.lastIndexOf(other). Получили 3.
Обратите внимание на то, каким образом соотносятся длины строк initial и other.
Сколько нужно прибавить к 3, чтобы получилась длина строки «котик», то есть 5?
Это значение всегда будет равно длине строки other.
Остаётся только сравнить сумму найденного индекса и длины окончания с длиной начальной строки initial.length().
*/
