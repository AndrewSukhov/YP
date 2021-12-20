package JavaCore1.module1.sptint1.theme05.task0507.task01;

... // Импортируйте нужные классы

public class Praktikum {
    public static void main(String[] args) {
        ... // Объявите и проиницализируйте хеш-таблицу musicGroups
        musicGroups.put("The Beatles", 1960);
        musicGroups.put("Rammstein", 1994);
        musicGroups.put("Queen", 1970);
        musicGroups.put("Led Zeppelin", 1968);
        musicGroups.put("Black Sabbath", 1968);
        musicGroups.put("AC/DC", 1973);
        musicGroups.put("The Rolling Stones", 1962);
        musicGroups.put("The Who", 1964);
        musicGroups.put("Nightwish", 1996);
        musicGroups.put("Nirvana", 1987);
        musicGroups.put("Guns N’ Roses", 1985);
        musicGroups.put("Scorpions", 1965);
        musicGroups.put("Kiss", 1973);
        musicGroups.put("The Doors", 1965);

        System.out.println("Легендарные группы, год основания которых вы можете узнать:");
        ... // Распечайте список групп
        ... // System.out.println(group)

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите опцию");
            System.out.println("1 - Узнать год основания группы");
            System.out.println("2 - Добавить любимую группу");
            System.out.println("3 - Выйти из приложения");
            int command = scanner.nextInt();
            if (command == 1) {
                ... // "Введите название группы"
                ... // keyGroup
                ... // year
               ... // "Год основания " + keyGroup
                System.out.println(year);

            } else if (command == 2) {
                ... // "Добавьте свою любимую группу"
                ... // "Введите её название"
                ... // nameGroup
                ... // "Введите год основания"
                ... // bornYear
                ...
                System.out.println("Информация о группе " + nameGroup + " добавлена.");

            } else if (command == 3) {
              ... // Остановите цикл
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }
}
/*
Допишите код приложения, которое позволяет пользователям узнать год основания легендарных
музыкальных коллективов, а также сохранить информацию о своей любимой группе.
Вам нужно объявить и проинициализировать хеш-таблицу, напечатать все хранящиеся в ней группы,
а также дописать реализацию цифрового меню. Для считывания из консоли пользуйтесь методами
next() или nextInt(). В комментариях прекода оставлены фразы для печати и имена переменных.

Нужно импортировать классы Scanner и HashMap.
При объявлении хеш-таблицы нужно указать типы ключей и значений —
HashMap<String, Integer> musicGroups. При инициализации после угловых скобок
не забыть круглые — new HashMap<>().
Группы — это ключи. Чтобы их напечатать, нужен короткий цикл for и метод keySet().
В переменную String keyGroup нужно сохранить введённое пользователем название группы,
в переменную Integer year год её основания — musicGroups.get(keyGroup).
Затем распечатайте значения этих переменных.
В переменную String nameGroup нужно сохранить название группы, которую пользователь
хочет добавить в таблицу, в переменную Integer bornYear год её основания.
Добавить элемент в хеш-таблицу нужно с помощью метода put() — musicGroups.put(nameGroup, bornYear);.
Для прерывания цикла используйте оператор break.
 */
