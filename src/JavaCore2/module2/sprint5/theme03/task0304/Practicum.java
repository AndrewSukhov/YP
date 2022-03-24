package JavaCore2.module2.sprint5.theme03.task0304;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Practicum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество участников: ");
        int playersNumber = scanner.nextInt();

        List<String> words = readWordsFromFile("words.txt");

        // если слов меньше, чем участников, то выведите сообщение:
        // "Недостаточно слов в файле. Добавьте слова и обновите файл."
        // и завершите выполнение программы

        // воспользуйтесь статическим методом Collections.shuffle(List<?> list),
        // чтобы поменять порядок слов случайным образом

        int wordsNumber = words.size() / playersNumber;

        for (int i = 0; i < playersNumber; i++) {
            String filename = String.format("player%s.txt", i + 1);
            List<String> subList = words.subList(i * wordsNumber, (i + 1) * wordsNumber);

            writeListToFile(subList, filename);
        }

        System.out.println("Карточки готовы!");
    }

    private static List<String> readWordsFromFile(String filename) {
        // добавьте построчное чтение из файла с помощью BufferedReader
        // в случае ошибки выведите сообщение: "Произошла ошибка во время чтения файла."
    }

    private static void writeListToFile(List<String> list, String filename) {
        // добавьте запись слов в файл с помощью FileWriter
        // в случае ошибки выведите сообщение: "Произошла ошибка во время записи файла."
    }
}
/*
Компания «Игры для всех» переносит популярные карточные игры в мета-пространство.
На очереди любимец всех вечеринок — Алиас. В этой игре количество участников не ограничено.
Участники должны объяснить членам своей команды слова, указанные на виртуальных карточках.
Осталось написать модуль для распределения слов по карточкам.
База всех слов для игры хранится в файле words.txt — каждое слово записано на новой строке.
Этот файл можно дополнить и обновить. На вход приложение должно принимать количество участников,
а на выходе генерировать файл-карточку для каждого участника со словами в случайном порядке.

Не забудьте указать кодировку при создании объекта FileReader и FileWriter.
Воспользуйтесь конструкцией try-with-resources при работе с потоками ввода-вывода.
Для чтения файла используйте метод readLine() в цикле. Условие цикла — вызов метода ready().
Для записи в файл воспользуйтесь методом write(String str).
Для переноса записи на новую строку используйте символ \n.
 */

