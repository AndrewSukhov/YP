package JavaCore1.module1.sptint2.theme10.task1003.task01;

public class WorkCalculator {

    public int workingHours = 8;
    String workerName;
    private double coefficient;

    WorkCalculator(String newName) {
        workerName = newName;
    }

    private String getWorkerName() {
        return workerName;
    }

    int calculate(int workDays) {
        return workDays * workingHours;
    }

    double calculateWithCoefficient(int workDays) {
        return workDays * workingHours * coefficient;
    }
}
