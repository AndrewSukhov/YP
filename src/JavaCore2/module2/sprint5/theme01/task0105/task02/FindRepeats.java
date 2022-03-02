package JavaCore2.module2.sprint5.theme01.task0105.task02;

public class FindRepeats {
    int numberOfRepeats(String text, String substring) {
        StringBuilder sb = new StringBuilder(text);
        int count = 0;
        while (sb.indexOf(substring) != -1) {
            count++;
            sb.delete(0, substring.length());
        }
        return count;
    }
}
/*
В уроке мы не раз сделали акцент на том, что StringBuilder позволяет не создавать лишние строки.
Проверьте это! Оптимизируйте программу по подсчету количества вхождений строки в текст из
предыдущего урока, чтобы она не создавала лишний «мусор». Подсказка: вместо contains()
в StringBuilder необходимо пользоваться методом indexOf, а вместо получения подстроки
можно просто удалять лишние элементы.

Создайте объект StringBuilder через конструктор, принимающий аргумент text.
После этого замените методы по обработке строки. Вместо text.contains(substring)
нужно искать индекс substring в StringBuilder. Если он не -1, значит, мы нашли совпадение.
Если совпадение найдено, нужно отрезать все символы от начала StringBuilder до конца
найденной строки. Для этого используйте функцию sb.delete(0, ..,).
Второй аргумент должен быть индексом следующего за повторением элемента.
*/
