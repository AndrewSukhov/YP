package JavaCore1.module1.sptint1.finalSprintTask.task1;

// В этом классе осуществляется преобразование шагов в километры и калории
public class Converter {
    final static double lengthStep = 0.75d;
    final static double calorieStep = 50d;

    // Конвертация шагов в километры и калории
    static void convert(int steps) {
        System.out.println("Пройденная дистанция (в км): " + (steps * lengthStep / 1000));
        System.out.println("Количество сожжённых килокалорий: " + (steps * calorieStep / 1000));
    }
}