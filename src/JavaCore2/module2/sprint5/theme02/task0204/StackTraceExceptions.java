package JavaCore2.module2.sprint5.theme02.task0204;

/*import java.util.Scanner;

public class StackTraceExceptions {
    public static void main(String[] args) {
        System.out.print("Введите целое число => ");
        Scanner scanner = new Scanner(System.in);
        final String inputValue = scanner.next();
        try {
            final int parsedValue = IntegerParser.parseInt(inputValue);
            System.out.println(parsedValue);
        } catch (NullStringException | EmptyStringException exception) {
            printException("Введена пустая строка.", exception);
        } catch (StringNotNumberException exception) {
            printException("Вы ввели не целое число.", exception);
        } catch (StringIsTooBigNumberException exception) {
            printException("Введённое число слишком большое.", exception);
        } catch (StringIsTooSmallNumberException exception) {
            printException("Введённое число слишком маленькое.", exception);
        }
    }

    private static void printException(final String message, final Throwable exception) {
        System.out.print(message + ": ");
        if (exception.getMessage() != null)
        System.out.print(exception.getMessage());
        else
            exception.printStackTrace();
    }
}*/
/*
Программа по преобразованию строки в целое число немного изменилась. Теперь при исключении в блоках catch
происходит вызов метода printException(). Сейчас этот метод работает неправильно — вам нужно доработать его реализацию.

Во-первых, printException() должен принимать не только сообщение об ошибке, но и само исключение.
Во-вторых, нужно сделать так, чтобы помимо основного сообщения он выводил информацию об ошибке.
Если у исключения есть короткое описание, то нужно вывести его, если нет, то полный стек-трейс ошибки.

Р. S. Часть кода, необходимого для запуска программы, специально скрыта от вас, чтобы не отвлекать от выполнения задания.

У printException() должно быть два параметра final String message и final Throwable throwable.
Для получения короткого описания ошибки используйте метод getMessage().
Для вывода полного стек-трейса нужен метод printStackTrace().
Проверить, есть ли короткое описание ошибки, можно с помощью условия if (....  != null).
 */