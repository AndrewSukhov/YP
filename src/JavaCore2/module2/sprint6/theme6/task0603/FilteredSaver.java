package JavaCore2.module2.sprint6.theme6.task0603;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

class FilteredSaver {
    private List<String> saved = new ArrayList<>();
    private List<Predicate<String>> filters = new ArrayList<>();
    private Consumer<String> onSaveListener;

    public void setOnSaveListener(Consumer<String> onSaveListener) {
        this.onSaveListener = onSaveListener;
    }

    public void addFilter(Predicate<String> filter) {
        filters.add(filter);
    }

    public void save(String line) {
        for (Predicate<String> filter : filters) {
            if (!filter.test(line)) {
                return;
            }
        }
        if (onSaveListener != null) {
            onSaveListener.accept(line);
        }
        saved.add(line);
    }

    public List<String> getSaved() {
        return saved;
    }
}

public class Practicum {


    public static void main(String[] args) {
        FilteredSaver saver = new FilteredSaver();
        saver.setOnSaveListener(...);
        saver.addFilter(...);
        saver.addFilter(...);

        saver.save("Привет!");  // не сохранится
        saver.save("ВАЖНО - это важное слово"); // не сохранится
        saver.save("ВАЖНО! Не забывай его использовать для заметок!"); // сохранится и выведется на экран
        saver.save("Но и память тренировать тоже очень ВАЖНО!");    // сохранится и выведется на экран
        System.out.println(saver.getSaved());   // список из двух сохранённых сообщений
    }
}
/*
Теперь, когда вы узнали более эффективный инструмент для реализации
функциональных интерфейсов, перепишите решение из прошлого урока на лямбды.

Оставьте от анонимных классов только список параметров реализуемого метода
и само тело этого метода, разделив эти две части оператором ->.
Сократите каждую лямбду до одной строки. В этом вам помогут принципы из теории.
 */
