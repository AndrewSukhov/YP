package JavaCore1.module1.sptint4.theme20.task2007;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PotatoLaboratory {

    public static void main(String[] args) {
        List<Potato> potatoes = List.of(
                new Potato(1, 30, 30, 30),
                new Potato(2, 35, 31, 35),
                new Potato(3, 40, 35, 44),
                new Potato(4, 28, 44, 41),
                new Potato(5, 33, 23, 30),
                new Potato(6, 35, 33, 33),
                new Potato(7, 38, 41, 24)
        );

        List<Potato> fourUnderExperiment = findPotatoesForExperiment(potatoes);

        System.out.println("Картофелины для эксперимента: " + fourUnderExperiment);
    }

    private static List<Potato> findPotatoesForExperiment(List<Potato> potatoes) {
				/* Вычислите две самые большие и две самые маленькие картофелины,
           а затем выведите их в порядке от самых маленьких до самых больших.*/
        var list = new ArrayList<>(potatoes);
        //list.sort(Potato::compareTo);
        Collections.sort(list);
        return List.of(list.get(0), list.get(1), list.get(list.size() - 1), list.get(list.size() - 2));
    }
}
/*
В лаборатории высокотехнологичного агрохолдинга разработали уникальную методику селекции картошки. Каждой картофелине
из нового урожая присваивается её уникальный идентификатор, а также измеряются основные характеристики —
масса, длина и ширина. Затем для каждой картофелины вычисляется альфа-характеристика, равная 50% от массы, 65% от длины и 80% от ширины.
После этого, выбираются две картошки с самым большим показателям альфа-характеристик и две с самым маленьким.
Именно они отправляются на главное испытание, по которому производится вывод, поступит ли этот сорт картошки в продажу или нет.
Вам необходимо реализовать для класса картошки Potato интерфейс Comparable<Potato>, который сравнит две картофелины по их альфа-характеристикам.
После этого допишите метод **findPotatoesForExperiment класса PotatoLaboratory, чтобы он находил две самые большие
и две самые маленькие по альфа-характеристикам картошки. Результат выведите в порядке от меньшего к большему.

Чтобы вычислить альфа-характеристику картофеля, удобно использовать вспомогательный метод
public int calculateAlpha(Potato o). Его тело будет таким —{return (int) (o.weight * 0.5 + o.length * 0.65 + o.girth * 0.80);}.
Для нахождения минимальной и максимальной картошки можно использовать такой способ:
взять сначала минимальный и максимальный элемент при помощи методов Collections.max() и Collections.min(),
удалить их из списка, а затем взять ещё раз. Помните, что для начала надо сделать изменяемую копию списка при помощи new ArrayList<>(potatoes).
Есть и второй способ по получению двух максимальных и минимальных элементов.
Сначала отсортируйте весь картофель при помощи Collections.sort(..), а затем возьмите элементы с правильными индексами.

 */