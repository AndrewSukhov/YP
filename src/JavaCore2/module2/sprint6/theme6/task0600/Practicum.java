package JavaCore2.module2.sprint6.theme6.task0600;

import java.util.*;

public class Practicum {
    public static void main(String[] args) throws Exception {
        List<String> people = new ArrayList<>(List.of(
                "Мария Зуева",
                "Анна Дарк",
                "Кирилл Филимонов",
                "Ева Пинк"
        ));

        Comparator<String> comparator = new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.split(" ")[1].length() - o2.split(" ")[1].length();
            }
        };

        Collections.sort(people, comparator);
        System.out.println(people);
    }
}
/*
Перед вами метод main, который создаёт список людей.
Каждый человек описан через имя, пробел и фамилию.
Отсортируйте этот список по возрастанию длины фамилии,
реализовав интерфейс компаратора через анонимный класс.

В качестве имплементируемого интерфейса выберите Comparator<>.
Внутри анонимного класса переопределите метод сравнения, а именно compare.
Чтобы получить имя из строки, разбейте строку по пробелу через split и возьмите первую часть разбиения.
 */