package JavaCore2.module2.sprint5.theme01.task0103.task01;

public class FindRepeats {
    int numberOfRepeats(String text, String substring) {
        int count = 0;
        while (text.contains(substring)) {
            count++;
            text = text.substring(text.indexOf(substring) + substring.length());
        }
        return count;
    }
}
/*Команда Ctrl/Alt + F (⌘ + F для Mac) — пожалуй, самый известный пример организации
поиска подстрок и символов внутри текста. При нажатии открывается небольшое окошко,
куда вбивается текст, и в результате вы получаете количество повторов искомого текста или символа.
Попробуйте реализовать такой подсчёт на Java.
Напишите метод int numberOfRepeats(String text, String substring),
который будет возвращать число повторения подстроки substring в переданном тексте text.
Пример:
numberOfRepeats("раз два три, раз два три", "раз"); // вернёт 2
numberOfRepeats("Hello, world!", "goodbye"); // вернёт 0

Для хранения числа повторений создайте переменную. Искать повторы поможет метод contains().
Также понадобится цикл, который будет продолжаться до тех пор, пока не найдены все повторения.
Это будет выглядеть так — while (text.contains(substring)).
Внутри тела цикла нужно считать повторы count++ и менять значение text, удаляя из него текст,
где уже были найдены повторения.
Преобразовать текст нужно через методы substring() и indexOf().
Конструкция text.indexOf(substring) + substring.length() вернёт индекс символа,
следующего за найденной подстрокой. Начиная с этого символа, нужно вернуть остаток текста через substring().
*/