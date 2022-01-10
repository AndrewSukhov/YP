package JavaCore1.module1.sptint3.theme15.task1504;

public class Task {

    private TaskPriority priority; // добавьте переменную priority с приоритетом задачи
    private String description;

    // добавьте конструктор класса
    public Task(TaskPriority priority, String description) {
        this.priority = priority;
        this.description = description;
    }

    // добавьте метод get для приоритета
    public TaskPriority getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }
}
