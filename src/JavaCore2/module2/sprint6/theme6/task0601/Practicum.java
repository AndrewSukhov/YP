package JavaCore2.module2.sprint6.theme6.task0601;

import java.time.LocalDateTime;
import //добавьте недостающий импорт

interface StringsSaverConfig {
    // как нужно преобразовать сохраняемую строку
    String transform(String line);

    // дополнительное действие при сохранении
    void onSave(String line);
}

class StringsSaver {
    public static final int MAX_SIZE = 10_000;

    private List<String> saved = new LinkedList<>();
    private StringsSaverConfig config;

    public StringsSaver(StringsSaverConfig config) {
        this.config = config;
    }

    public void save(String line) {
        if (saved.size() == MAX_SIZE) {
            saved.remove(0);
        }
        line = config.transform(line);
        saved.add(line);
        config.onSave(line);
    }

    public List<String> getSaved() {
        return saved;
    }
}

public class Practicum {

    public static void main(String[] args) {
        StringsSaverConfig config = ...;
        // тут ваш анонимный класс




        StringsSaver saver = new StringsSaver(config);
        saver.save("Пользователь залогинился");
        saver.save("ERROR Пользователь загрузил фото");     // ничего не выводим
        saver.save("ERROR Пользователь загрузил видео");    // вывод "[1] ERROR Пользователь загрузил фото" и "[2] ERROR Пользователь загрузил видео"
        saver.save("ERROR Пользователь загрузил аватар");   // вывод "[3] ERROR Пользователь загрузил аватар"
        saver.save("Пользователь пополнил счёт");
        saver.save("Пользователь купил артефакт");
        saver.save("ERROR Пользователь опубликовал пост");  // ничего не выводим
        saver.save("Пользователь продал артефакт");
        saver.save("ERROR Пользователь опубликовал пост");
        saver.save("ERROR Пользователь опубликовал пост");  // вывод "[1] ERROR Пользователь опубликовал пост" и "[2] ERROR Пользователь опубликовал пост"
        System.out.println(saver.getSaved());

    }
}
/*
В этом уроке вы практиковались на логе. Теперь ваша задача изменить конфигурацию,
а именно реакцию на сохранение этого приложения-хранилища.
Если хотя бы два сообщения подряд содержат слово “ERROR”, то,
начиная со второго, должно выводиться сообщение вида «[X] текст ошибки»,
где X — порядковый номер сообщения в серии сообщений с меткой “ERROR”.
При этом при второй ошибке подряд должны вывестись сразу два сообщения: про первую ошибку и про вторую.

Заведите поле в анонимном классе, в котором будете хранить число —
количество сохранённых подряд сообщений об ошибке.
Если очередное сообщение не ошибка, поле нужно сбросить в $0$.
Если очередное сообщение — тоже ошибка и условие выполняется,
нужно изменить поле и вывести на экран сообщение по шаблону.
 */
