package JavaCore2.module2.sprint5.theme03.task0301;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Practicum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while_loop:
        while (true) {
            printMenu();
            String command = scanner.nextLine();

            System.out.println("Введите путь к файлу/директории: ");
            String enteredPath = scanner.nextLine();
            // Объявите переменную path с типом Path.

            // Выполните действия в зависимости от введённой команды.
            switch (command) {
                case "exit":
                    System.out.println("Выход.");
                    break while_loop;
                case "ls":
                    try {
                        // выведите список элементов директории
                    }
                    catch (IOException e) {
                        System.out.println("Произошла ошибка при запросе содержимого директории.");
                        e.printStackTrace();
                    }
                    break;

                case "mkdir":
                    try {
                        // создайте директорию
                    }
                    catch (IOException e) {
                        System.out.println("Произошла ошибка при создании директории.");
                        e.printStackTrace();
                    }
                    break;
                case "touch":
                    try {
                        // создайте файл
                    }
                    catch (IOException e) {
                        System.out.println("Произошла ошибка при создании файла.");
                        e.printStackTrace();
                    }
                    break;
                case "rename":
                    System.out.println("Введите новое имя файла/директории: ");
                    String newName = scanner.nextLine();

                    try {
                        // переименуйте файл
                    }
                    catch (IOException e) {
                        System.out.println("Произошла ошибка при переименовании файла/директории.");
                        e.printStackTrace();
                    }
                    break;
                case "rm_file":
                    try {
                        if (!Files.isDirectory(path)) {
                            // удалите файл
                        }
                        else {
                            System.out.println("С помощью этой команды можно удалить только файл!");
                        }
                    }
                    catch (IOException e) {
                        System.out.println("Произошла ошибка при удалении файла.");
                        e.printStackTrace();
                    }
                default:
                    System.out.println("Извините, такой команды пока нет.");
            }

        }
    }

    public static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("ls - посмотреть содержимое директории.");
        System.out.println("mkdir - создать директорию.");
        System.out.println("touch - создать файл.");
        System.out.println("rename - переименовать директорию/файл.");
        System.out.println("rm_file - удалить файл.");
        System.out.println("exit - выход.");
    }

}
/*
Вам нужно создать файловый менеджер. Приложение должно уметь:

    просматривать содержимое директории;
    создавать файлы и директории;
    переименовывать файлы или директории;
    полностью перемещать файлы или директории;
    удалять файлы или директории.

Пользователю необходимо выбрать, какую операцию он хочет выполнить
с файлом или папкой, а затем ввести путь к нужному файлу.

Для объявления переменной path воспользуйтесь методом Paths.get(Paths.get(enteredPath).
Проверьте, существует ли указанный путь методом Files.exists(path).
Для перечисления всех файлов в директории воспользуйтесь методом Files.list(path).collect(Collectors.toList()).
Для создания директории вам понадобится метод Files.createDirectory(path).
Создать файл можно при помощи метода Files.createFile(path).
Чтобы переименовать файл или директорию, удобно воспользоваться методом
Files.move(path, path.resolveSibling(newName), StandardCopyOption.REPLACE_EXISTING).
Для удаления файла используйте метод Files.deleteIfExists(path).
 */