package JavaCore1.module1.sptint4.theme21.task2105;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Practicum {
    private static List<String> allPurchases = List.of(
            "яблоки",
            "молоко",
            "колбаса",
            "огурцы",
            "сок",
            "хлеб",
            "виноград",
            "молоко",
            "йогурт",
            "хлеб",
            "пельмени"
    );

    public static void main(String[] args) {
        // переменная uniquePurchases должна содержать множество уникальных товаров
        Set<String> uniquePurchases = findUniquePurchases(allPurchases);

        // допишите вывод количества уникальных товаров
        System.out.println( "За месяц было куплено " + uniquePurchases.size() + " уникальных товаров.");
    }

    // реализуйте этот метод
    public static Set<String> findUniquePurchases(List<String> allPurchases) {
        return new HashSet<>(allPurchases);
    }
}
/*
Работа у программистов весьма разнообразна, и сегодня ваш новый проект — приложение для ведения списка покупок!
Часть кода уже написана, вам нужно дописать недостающие части. В переменной allPurchases хранятся все покупки,
которые семья сделала за последний месяц. Некоторые товары были приобретены несколько раз. Вам нужно выявить
уникальные товары, которые покупала семья. Для этого реализуйте метод findUniquePurchases(List<String> allPurchases)
и допишите недостающие части кода. Также посчитайте, сколько уникальных товаров приобретено за последний месяц,
и выведите эту информацию на консоль.

Для переменной uniquePurchases лучше всего подойдёт тип данных Set<String>.
У множества есть метод size(), он поможет посчитать количество уникальных товаров.
В методе findUniquePurchases создайте новое множество типа HashSet на основе входного списка allPurchases.
HashSet находится в пакете java.util.HashSet. Не забудьте сделать импорт.
 */
