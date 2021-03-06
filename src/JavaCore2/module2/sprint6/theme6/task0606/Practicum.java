package JavaCore2.module2.sprint6.theme6.task0606;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Practicum {

    public static void main(String[] args) {
        Map<String, Integer> badWords = new HashMap<>();
        badWords.put("волнует", 1);
        badWords.put("разочарован", 5);
        badWords.put("ненавижу", 10);
        badWords.put("взбешён", 12);

        Map<String, Integer> goodWords = new HashMap<>();
        goodWords.put("рад", 6);
        goodWords.put("хорошо", 7);
        goodWords.put("отлично", 9);
        goodWords.put("лучший", 10);

        String text = "Лучший способ научиться программировать - практика."
                + "Каждый раз, когда я сталкиваюсь со сложным заданием, меня волнует, что я не могу с ним справиться."
                + "Волнует меня и то, что другие справляются быстрее."
                + "Ненавижу себя, ненавижу своего хомячка и ненавижу соседа с дрелью в такие моменты."
                + "Но когда я его решу, я рад до безумия. Предоление сложности, преодоление себя - лучший момент в научении.";

        int rank = Arrays.stream(text.split("[\\s,\\.!-]"))
                .map(String::toLowerCase)
                .filter(word -> goodWords.containsKey(word) || badWords.containsKey(word))
                .distinct()
                .mapToInt(word -> goodWords.getOrDefault(word, 0) - badWords.getOrDefault(word, 0))
                .sum();

        if (rank < 0) {
            System.out.println("-".repeat(-rank));
        } else {
            System.out.println("+".repeat(rank));
        }
        System.out.println("Эмоциональный ранг текста: " + rank);
    }
}
/*
Допишите программу, которая с помощью стримов рассчитывает эмоциональный ранг текста.
Словарь хороших слов представлен в виде хеш-таблицы goodWords, где ключами являются слова,
присутствие которых считается положительным для текста, а значениями — числа, выражающие
степень положительности. Аналогично и с плохими словами. Случаи, когда пред словом стоит
частица «не», меняющая значение на противоположное, и другие подобные лингвистические
моменты учитывать не нужно.
Эмоциональный ранг текста высчитывается следующим образом:

Текст бьётся на слова по пробелу.
Отбрасываются слова, не влияющие на ранг (не представленные в хеш-таблице).
Суммируются ранги уникальных слов. При этом, если слова в тексте различаются только
регистром, они считаются одинаковыми.

Чтобы в стриме остались только уникальные элементы, используйте метод distinct().
Для регистронезависимости можно использовать метод toLowerCase() из класса String.
Для суммирования пригодится метод sum() из IntStream.
 */
