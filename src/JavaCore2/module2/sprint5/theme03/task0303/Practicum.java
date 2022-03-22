package JavaCore2.module2.sprint5.theme03.task0303;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Practicum {

    public static void main(String[] args) {
        BufferedReader fileReader = null;
        try {
            fileReader = new BufferedReader(new FileReader("input.txt"));
            fileReader.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
/*
Перепишите фрагмент кода так, чтобы в нём появилась конструкция try-with-resources
Добавьте объявление ресурса в круглые скобки после try. Блок finally вам больше не нужен.
 */
