package JavaCore2.module2.sprint6.theme6.task0602;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

class FilteredSaver {
    // ваши поля
    List<String> saved = new LinkedList<>();
    public List<Predicate<String>> predicateList= new ArrayList<>();
    private Consumer<String> onSaveListener;

    public void setOnSaveListener(Consumer<String> onSaveListener) {
        this.onSaveListener = onSaveListener;
    }

    public void addFilter(Predicate<String> predicate) {
        predicateList.add(predicate);
    }

    public void save(String line) {
        if(predicateList.get(0).test(line) && predicateList.get(1).test(line)) {
            saved.add(line);
            onSaveListener.accept(line);
        }
    }

    public List<String> getSaved() {
        return saved;
    }
}

public class Practicum {

    public static void main(String[] args) {
        FilteredSaver saver = new FilteredSaver();
        saver.setOnSaveListener(new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println("СОХРАНЕНО: " + value);
            }
        });

        saver.addFilter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("ВАЖНО");
            }
        });
        saver.addFilter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return (s.charAt(s.length() - 1) == '!');
            }
        });

        saver.save("Привет!");  // не сохранится
        saver.save("ВАЖНО - это важное слово"); // не сохранится
        saver.save("ВАЖНО! Не забывай его использовать для заметок!"); // сохранится и выведется на экран
        saver.save("Но и память тренировать тоже очень ВАЖНО!");    // сохранится и выведется на экран
        System.out.println(saver.getSaved());   // список из двух сохранённых сообщений
    }
}
/*
Продолжаем модифицировать лог. Вам предстоит написать хранилище сообщений,
в котором нет ограничений на максимальное количество записей.
При этом необходимо предусмотреть возможность установки фильтров
filter на запись сообщения в хранилище. Реализуйте два фильтра:

текст сообщения содержит слово «ВАЖНО» (регистр учитывается);
текст сообщения заканчивается восклицательным знаком.

Реализуйте вызов действия-реакции в случае успешной записи сообщения в хранилище.
При создании объекта-хранилища укажите в качестве реакции на сохранение вывод содержания
сообщения на экран в формате “СОХРАНЕНО: <текст сообщения>”.

Для хранения критериев фильтрации используйте списки.
Для реализации фильтров используйте подходящие функциональные интерфейсы из библиотеки java.util.function.
Реакции на сохранение и фильтры нужно описать в анонимных классах.
В методе save проверьте, что переданная строка удовлетворяет каждому критерию.
Если не удовлетворяет хотя бы одному — выходите из метода без сохранения и без вызова реакции на сохранение.
 */