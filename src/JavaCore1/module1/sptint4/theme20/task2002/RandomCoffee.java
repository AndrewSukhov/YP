package JavaCore1.module1.sptint4.theme20.task2002;

import java.util.ArrayList;
import java.util.List;

public class RandomCoffee {

    public static void main(String[] args) {

        List<Stranger> strangers = new ArrayList<>(List.of(
                new Stranger("Анна", 29),
                new Stranger("Иван", 25),
                new Stranger("Мария", 25),
                new Stranger("Павел", 26),
                new Stranger("Святослав", 27),
                new Stranger("Екатерина", 28)
        ));
        PairGenerator pairGenerator = new PairGenerator();

        System.out.println("На этой неделе в Random Coffee участвуют: " + strangers);

        List<List<Stranger>> splitByPairs = pairGenerator.splitByPairs(strangers);

        System.out.println("Генератор случайных чисел составил пары: " + splitByPairs);
    }
}
