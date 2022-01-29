package JavaCore1.module1.sptint4.theme20.task2002;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PairGenerator {

    // Random — класс в Java, отвечающих за генерацию случайных элементов.
    private static final Random rnd = new Random();

    /**
     * Разбивает список незнакомцев по парам.
     */

    // Укажите правильный тип, возвращаемый этой функцией. Вам нужно преобразовать список незнакомцев в
    // набор пар, т.е. в список, состоящий из других списков.
    public List<List<Stranger>> splitByPairs(List<Stranger> strangers) {

        // Укажите тип ещё раз.
        List<List<Stranger>> pairs = new ArrayList<>();
        while (!strangers.isEmpty()) {

            List<Stranger> pair = getRandomPair(strangers);
            // Добавьте новый элемент в набор пар.
            pairs.add(pair);
        }

        return pairs;
    }

    /**
     * Возвращает одну пару и удаляет её из списка strangers
     */
    private List<Stranger> getRandomPair(List<Stranger> strangers) {

        // Ищем двух незнакомцев
        int p1Index = rnd.nextInt(strangers.size());
        int p2Index = rnd.nextInt(strangers.size());
        while (p2Index == p1Index) {
            p2Index = rnd.nextInt(strangers.size());
        }

        Stranger strangerOne = strangers.get(p1Index);
        Stranger strangerTwo = strangers.get(p2Index);

				/* Осталось только удалить двух найденных незнакомцев из списка strangers,
           а затем вернуть их в качестве результата! */
        List<Stranger> strangerList = List.of(strangerOne, strangerTwo);
        strangers.removeAll(strangerList);

        return strangerList;
    }
}
/*
Допишите код приложения для случайных встреч с незнакомцами — Random Coffee.
Основная программа представлена в классах RandomCoffee и PairGenerator.
Информация об одном незнакомце находится в классе Stranger. Ваша задача —
дописать методы splitByPairs и getRandomPair, чтобы программа могла разбить незнакомцев по парам.

Список пар — это список, состоящий из списков. Он имеет тип List<List<Stranger>>.
Добавить новый элемент в список можно при помощи метода add(..)
Для удаления сразу нескольких элементов списка есть метод removeAll(Collection).
Чтобы создать список из двух элементов, удобно воспользоваться методом List.of(strangerOne, strangerTwo).

 */