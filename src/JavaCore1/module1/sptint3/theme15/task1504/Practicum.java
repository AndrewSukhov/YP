package JavaCore1.module1.sptint3.theme15.task1504;

// импортируйте нужные пакеты

public class Practicum {

    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(TaskPriority.HIGH, "Оплатить интернет."));
        tasks.add(new Task(TaskPriority.LOW, "Сходить в парикмахерскую."));
        tasks.add(new Task(TaskPriority.MEDIUM, "Выбрать подарок подруге на ДР."));
        tasks.add(new Task(TaskPriority.MEDIUM, "Купить билеты в театр."));
        tasks.add(new Task(TaskPriority.HIGH, "Посетить вебинар по английскому языку."));
        tasks.add(new Task(TaskPriority.LOW, "Купить пылесос."));

        System.out.println("Задачи с наивысшим приоритетом на сегодня:");
        ... // цикл for для поиска задач
    }
}
/*
Перед вами часть программы для хранения списка задач с приоритетом. Приоритет (англ. task priority) может быть:

    высокий (англ. high) — TaskPriority.HIGH,
    средний (англ. medium) — TaskPriority.MEDIUM,
    низкий (англ. low) — TaskPriority.LOW.

Вам нужно реализовать поиск задач с наивысшим приоритетом из предложенного списка.

    Для работы со списками вам понадобятся пакеты ArrayList и List.
    Для хранения значений приоритета создайте перечисление TaskPriority.
    Цикл for поможет перебрать все дела в списке.
    Для поиска задач с максимальным приоритетом TaskPriority.HIGH воспользуйтесь оператором ==.
 */
