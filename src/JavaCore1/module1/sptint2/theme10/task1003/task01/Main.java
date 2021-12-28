package JavaCore1.module1.sptint2.theme10.task1003.task01;

//import ru.yandex.practicum.work.WorkCalculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя работника:");
        WorkCalculator calculator = new WorkCalculator(scanner.next());

        System.out.println("Введите коэффициент в формате 1,5:");
        calculator.coefficient = scanner.nextDouble();

        System.out.println("Введите количество отработанных дней без коэффициента:");
        double hoursWithoutCoefficient = calculator.calculate(scanner.nextInt());

        System.out.println("Введите количество отработанных дней с коэффициентом:");
        double hoursWithCoefficient = calculator.calculateWithCoefficient(scanner.nextInt());

        double allWorkHours = hoursWithoutCoefficient + hoursWithCoefficient;
        // метод printf позволяет нам вывести строку с форматированием
        // символ %s заменит строку, а %.2f число с 2 знаками после запятой
        System.out.printf("Работник %s отработал %.2f часов.",
                calculator.getWorkerName(), allWorkHours);
    }
}
/*
Коллега помогал главному бухгалтеру и написал калькулятор рабочих часов, но не доделал работу и ушёл в отпуск.
Сотрудники компании рискуют остаться без выплат! Доработайте приложение и расставьте модификаторы
доступа в соответствии с логикой приложения. Доступ к рабочим часам и имени работника нужно закрыть,
чтобы уберечь эти данные. А вот доступ к повышающему коэффициенту можно сделать максимально широким.
Чтобы избежать ошибок при компиляции, конструктор класса WorkCalculator тоже лучше сделать доступным.
Кроме того, нужно предусмотреть публичный доступ к интерфейсу калькулятора — всем его методам.

Переменные workingHours и workerName должны иметь модификатор доступа private.
Для переменной coefficient и конструктора WorkCalculator(String newName) нужен доступ public.
С модификатором private не получится получить доступ к методу getWorkerName() — нужен public.
Для успешной компиляции у методов calculate() и calculateWithCoefficient() нужно заменить модификатор по умолчанию на public.
 */
