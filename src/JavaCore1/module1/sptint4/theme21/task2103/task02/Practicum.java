package JavaCore1.module1.sptint4.theme21.task2103.task02;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Practicum {
    public static void main(String[] args) {
        List<String> actorsList = new ArrayList<>();
        fillActors(actorsList);
        Map<String, Integer> actorsMap = new LinkedHashMap<>();

        // заполните хэш-таблицу
        for (String actor: actorsList) {
            actorsMap.put(actor, actorsMap.getOrDefault(actor, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : actorsMap.entrySet()) {
            String actor = entry.getKey();
            int filmsCount = entry.getValue();
            System.out.println(actor + " снялся в " + filmsCount + " фильмах");
        }
    }

    private static void fillActors(List<String> actors) {
        actors.add("Шон Коннери");     // 1962 Доктор Ноу
        actors.add("Шон Коннери");     // 1963 Из России с любовью
        actors.add("Шон Коннери");     // 1964 Голдфингер
        actors.add("Шон Коннери");     // 1965 Шаровая молния
        actors.add("Шон Коннери");     // 1967 Живёшь только дважды
        actors.add("Джордж Лэзенби");  // 1969 На секретной службе Её Величества
        actors.add("Шон Коннери");     // 1971 Бриллианты навсегда
        actors.add("Роджер Мур");      // 1973 Живи и дай умереть
        actors.add("Роджер Мур");      // 1974 Человек с золотым пистолетом
        actors.add("Роджер Мур");      // 1977 Шпион, который меня любил
        actors.add("Роджер Мур");      // 1979 Лунный гонщик
        actors.add("Роджер Мур");      // 1981 Только для твоих глаз
        actors.add("Роджер Мур");      // 1983 Осьминожка
        actors.add("Роджер Мур");      // 1985 Вид на убийство
        actors.add("Тимоти Далтон");   // 1987 Искры из глаз
        actors.add("Тимоти Далтон");   // 1989 Лицензия на убийство
        actors.add("Пирс Броснан");    // 1995 Золотой глаз
        actors.add("Пирс Броснан");    // 1997 Завтра не умрёт никогда
        actors.add("Пирс Броснан");    // 1999 И целого мира мало
        actors.add("Пирс Броснан");    // 2002 Умри, но не сейчас
        actors.add("Дэниел Крейг");    // 2006 Казино «Рояль»
        actors.add("Дэниел Крейг");    // 2008 Квант милосердия
        actors.add("Дэниел Крейг");    // 2012 007: Координаты «Скайфолл»
        actors.add("Дэниел Крейг");    // 2015 007: Спектр
        actors.add("Дэниел Крейг");    // 2021 Не время умирать
    }
}
/*
В списке actors содержатся имена актёров, которые сыграли главную роль в фильме про Джеймса Бонда.
Часто один и тот же актёр играл главную роль сразу в нескольких фильмах подряд. Всего в «бондиане»
25 фильмов, и имена актёров в списке actors соответствуют порядку их выхода.
Преобразуйте этот список в хеш-таблицу таким образом, чтобы в качестве ключа было имя актёра,
а в значении хранилось количество фильмов, в которых этот актёр принял участие.
Порядок актёров в хеш-таблице должен соответствовать порядку выхода первого фильма с участием этого актёра.

Создайте новый объект LinkedHashMap actorsMap. В нём будут храниться имена актёров и количество фильмов.
Импортируйте пакет LinkedHashMap и пакет Map
Заполните actorsMap данными на основе actorsList:
actorsMap.put(actor, actorsMap.getOrDefault(actor, 0) + 1)
Используйте entry.getKey() и entry.getValue(), чтобы вывести данные из хеш-таблицы на консоль.
 */
