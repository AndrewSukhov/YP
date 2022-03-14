package JavaCore2.module2.sprint5.theme02.task0203;

/*import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        System.out.print("Введите целое число => ");
        Scanner scanner = new Scanner(System.in);
        final String inputValue = scanner.next();
        try {
            final int parsedValue = IntegerParser.parseInt(inputValue);
            System.out.println(parsedValue);
        } catch (NullStringException | EmptyStringException e) {
            System.out.println("Введена пустая строка.");
        } catch (StringNotNumberException e) {
            System.out.println("Вы ввели не целое число.");
        } catch (StringIsTooBigNumberException e) {
            System.out.println("Введённое число слишком большое.");
        } catch (StringIsTooSmallNumberException e) {
            System.out.println("Введённое число слишком маленькое.");
        }
    }
}*/

/*
Класс IntegerParser преобразует строку в целое число.
Строку на вход передают пользователи, а это всегда риск
некорректного ввода данных. Исключения будут генерироваться в методе parseInt().
Важно обработать все исключения так, чтобы в случае, если они произойдут,
пользователи увидели сообщения, с помощью которых могут исправить допущенную
ошибку ввода. Для каждого типа исключений должен быть настроен свой вывод.

NullStringException и EmptyStringException — “Введена пустая строка."
StringNotNumberException — “Вы ввели не целое число."
StringIsTooBigNumberException — “Введённое число слишком большое."
StringIsTooSmallNumberException — “Введённое число слишком маленькое.".

Р. S. Часть кода, необходимого для запуска программы,
специально скрыта от вас, чтобы не отвлекать от выполнения задания.

Добавьте в код конструкцию try — catch для вызова метода parseInt().
Блоков catch должно быть четыре. Объедините NullStringException и
EmptyStringException в один блок, так как вывод там одинаковый.
Проверьте, что каждому типу исключения соответствует свой текст.
Убедитесь, что вы не обрабатываете родительские исключения Exception или Throwable.
 */