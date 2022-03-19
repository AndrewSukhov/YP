package JavaCore2.module2.sprint5.theme02.task0207;

import JavaCore2.module2.sprint5.theme02.task0207.exceptions.ValidateException;
import JavaCore2.module2.sprint5.theme02.task0207.storage.PasswordMemoryStorage;
import JavaCore2.module2.sprint5.theme02.task0207.storage.PasswordStorage;
import JavaCore2.module2.sprint5.theme02.task0207.validators.PasswordLengthValidator;
import JavaCore2.module2.sprint5.theme02.task0207.validators.PasswordStrengthValidator;
import JavaCore2.module2.sprint5.theme02.task0207.validators.Validator;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

class Practicum {

    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Validator> passwordValidators = List.of(
            new PasswordLengthValidator(5), new PasswordStrengthValidator()
    );

    private static final List<Validator> nameValidators = List.of(); // поработайте со списком

    public static void main(String[] args) {
        loop();
    }

    public static void loop() {
        while (true) {
            final String action = getAction();
            if ("1".equals(action)) {
                addUser();
            } else if ("2".equals(action)) {
                showUserPassword();
            } else {
                break;
            }
        }
    }

    private static void checkValidatorRules(
            final List<Validator> validators, final String value
    ) throws ValidateException {
        for (Validator validator: validators) {
            validator.validate(value);
        }
    }

    private static void addUser() {
        final PasswordStorage storage = new PasswordMemoryStorage();
        // добавьте отлов исключений ValidateNameException и ValidatePasswordException
        // закройте хранилище
        try {
            storage.open();
            System.out.println("Введите имя пользователя => ");
            final String name = scanner.nextLine();
            checkValidatorRules(nameValidators, name);
            System.out.println("Введите пароль пользователя => ");
            final String password = scanner.nextLine();
            checkValidatorRules(passwordValidators, password);
            storage.store(name, password);
        } catch (ValidateException e) {
            System.out.println("Ошибка валидации: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка работы с хранилищем: " + e.getMessage());
        }
    }

    private static void showUserPassword() {
        final PasswordStorage storage = new PasswordMemoryStorage();
        // добавьте отлов исключения ValidateNameException
        // закройте хранилище
        try {
            storage.open();
            System.out.println("Введите имя пользователя => ");
            final String name = scanner.nextLine();
            checkValidatorRules(nameValidators, name);
            final String password = storage.get(name);
            System.out.println(String.format("Пароль пользователя %s = %s", name, password));
        } catch (ValidateException e) {
            System.out.println("Ошибка валидации: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка работы с хранилищем: " + e.getMessage());
        }
    }

    private static String getAction() {
        System.out.println("1 - добавить пользователя с паролем");
        System.out.println("2 - отобразить пароль пользователя");
        System.out.println("другие символы - выход");
        System.out.println("Выберите действие => ");
        return scanner.nextLine();
    }
}
/*
Доработайте код приложения для хранения и обработки паролей пользователей.

По аналогии с классом ValidatePasswordException для ошибок при вводе пароля допишите
код класса ValidateNameException для ошибок при вводе имени пользователя.
Оба класса должны наследовать от ValidateException и принимать короткое сообщение об ошибке.
В методах класса PasswordMemoryStorage пропущены предупреждения об исключении IOException — добавьте их.
Допишите код класса NameValidator — он должен реализовывать интерфейс Validator и проверять,
не передана ли пустая строка. В обратном случае — генерировать исключение ValidateNameException
с сообщением «Имя не должно быть пустым».
Добавьте реализованный экземпляр класса NameValidator в список nameValidators.
Добавьте отлов исключений ValidateNameException и ValidatePasswordException в методы класса Practicum.
При этом выведите сообщения формата:
    Ошибка валидации имени: + короткое описание ошибки.
    Ошибка валидации пароля: + короткое описание ошибки.
Организуйте закрытие хранилища storage при помощи метода close() при любом развитии событий в методах
addUser() и showUserPassword() класса Practicum.

Класс ValidateNameException должен наследовать от ValidateException и переопределять его конструктор.
В методах open(), store() и get() класса PasswordMemoryStorage
нужно добавить указание на исключение IOException с помощью throws.
В классе NameValidator нужно переопределить метод validate(),
предупредить об исключении типа ValidateException и сгенерировать исключение ValidateNameException.
Для генерации исключений используйте ключевое слово throw.
Проверьте, передана ли реализация класса NameValidator в список.
Для отлова исключений ValidateNameException и ValidatePasswordException
в методах addUser() и showUserPassword() нужно использовать блоки catch.
Получить короткое сообщение об ошибке поможет метод getMessage().
Используйте блок finally для закрытия хранилища.
 */