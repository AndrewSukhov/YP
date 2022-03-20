package JavaCore2.module2.sprint5.theme03.task0302;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Practicum {

    public static void main(String[] args) throws IOException {
        Map<String, Integer> frequencyMap = new HashMap<>();

        FileReader reader = new FileReader("result.txt");
        BufferedReader br = new BufferedReader(reader);

        // читайте файл построчно и сразу обновляйте frequencyMap.

        // выведите результат в формате "<буква>: <количество>".

    }
}
/*
В компании «Профессиональные программы» решили устроить голосование, чтобы выбрать,
чем заняться на летнем корпоративе. Варианты:
A — поехать на базу отдыха;
B — пойти в поход на байдарках;
C — отправиться на экскурсию в Дагестан;
D — устроить вечеринку в офисе.
Результаты голосования представлены в файле result.txt.
Обработайте результат и выведите количество проголосовавших для каждого варианта.
 */

/*
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Practicum {

    public static void main(String[] args) throws IOException {
        Map<String, Integer> frequencyMap = new HashMap<>();

        FileReader reader = new FileReader("result.txt");
        BufferedReader br = new BufferedReader(reader);

        // читайте файл построчно и сразу обновляйте frequencyMap.
        while (br.ready()) {
            String line = br.readLine();
            frequencyMap.put(line, +1);
        }

        br.close();

        // выведите результат в формате "<буква>: <количество>".
        for (Map.Entry<String, Integer> item : frequencyMap.entrySet()){
            System.out.printf("%s: %d\n", item.getKey(), item.getValue());
        }
    }
}
*/
