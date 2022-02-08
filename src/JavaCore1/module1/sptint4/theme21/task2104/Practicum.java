package JavaCore1.module1.sptint4.theme21.task2104;

import java.util.ArrayList;
import java.util.List;

class Practicum {
    private static List<User> users = new ArrayList<>();

    public static void main(String[] args) {
        // создадим 10 миллион пользователей
        for (long i = 1; i <= 1_000_000L; i++) {
            users.add(new User(i, "Имя " + i));
        }

        final long startTime = System.nanoTime();
        User user = findUser(378_366L);
        final long endTime = System.nanoTime();

        System.out.println("Найден пользователь: " + user);
        System.out.println("Поиск занял " + (endTime - startTime) + " наносекунд.");
    }

    private static User findUser(Long userId) {
        for (User user : users) {
            if (user.id.equals(userId)) {
                return user;
            }
        }

        return null;
    }

    static class User {
        Long id;
        String name;

        public User(Long id, String name) {
            this.id = id;
            this.name = name;
        }

        public String toString() {
            return "User{id=" + id + ", name='" + name + "'}";
        }
    }
}
/*
Перед вами код для поиска пользователя по ID. Но пользователей очень много — один миллион.
Поэтому сейчас поиск работает медленно, ведь, чтобы найти нужный ID, приходится выполнять итерацию по всем пользователям!
Перепишите код таким образом, чтобы поиск пользователей работал быстрее. Также обратите внимание на код, который измеряет,
сколько времени занял поиск пользователя, и сравните разницу до и после оптимизации.
Также после оптимизации посчитайте, во сколько раз вам удалось ускорить поиск.

Измените тип поля users с List на HashMap.
Не забудьте импортировать пакет Hashmap.
Организуйте хранение данных в хеш-таблице так, чтобы в качестве ключа был ID пользователя,
а в качестве значения — объект пользователя целиком.
Метод findUser(Long userId) теперь можно реализовать гораздо проще — напрямую искать ключ (userId) в хеш-таблице.
 */
