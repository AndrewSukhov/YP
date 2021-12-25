package JavaCore1.module1.sptint1.finalSprintTask.task1;

import java.util.ArrayList;
import java.util.HashMap;

public class StepTracker {
    HashMap<String, ArrayList<Integer>> stepsCount;
    ArrayList<Integer> calendar;
    int stepsPerDay;
    int targetStepsCount;

    StepTracker() {
        stepsCount = new HashMap<>();
        stepsPerDay = 0;
        targetStepsCount = 10_000;
        stepsCount.put("Январь", initArrayList());
        stepsCount.put("Февраль", initArrayList());
        stepsCount.put("Март", initArrayList());
        stepsCount.put("Апрель", initArrayList());
        stepsCount.put("Май", initArrayList());
        stepsCount.put("Июнь", initArrayList());
        stepsCount.put("Июль", initArrayList());
        stepsCount.put("Август", initArrayList());
        stepsCount.put("Сентябрь", initArrayList());
        stepsCount.put("Октябрь", initArrayList());
        stepsCount.put("Ноябрь", initArrayList());
        stepsCount.put("Декабрь", initArrayList());
    }

    private ArrayList<Integer> initArrayList() {
        calendar = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            calendar.add(stepsPerDay);
        }
        return calendar;
    }

    public void saveSteps(String month, int day, int steps) {
        if (steps < 0) {
            System.out.println("Количество шагов должно быть неотрицательным");
        }
        if (stepsCount.containsKey(month)) {
            stepsCount.get(month).set((day - 1), steps);
            System.out.println("Данные сохранены");
        } else {
            System.out.println("Название месяца введено неверно");
        }
    }

    public void printStatistic(String month) {
        int totalSumSteps = 0;
        int maxSteps = 0;
        int dayOfMaxSteps = 0;
        int bestSeries = 0;
        int tmpCurrentSeries = 0;
        if (stepsCount.containsKey(month)) {
            for (int i = 0; i < calendar.size(); i++) {
                int steps = stepsCount.get(month).get(i);
                if (i != 29) {
                    System.out.print((i + 1) + " день: " + steps + ", ");
                } else {
                    System.out.print((i + 1) + " день: " + steps + "\n");
                }
                totalSumSteps += steps;
                if (steps > maxSteps) {
                    maxSteps = steps;
                    dayOfMaxSteps = i + 1;
                }
                if (steps > targetStepsCount) {
                    tmpCurrentSeries++;
                } else {
                    bestSeries = Math.max(bestSeries, tmpCurrentSeries);
                    tmpCurrentSeries = 0;
                }
            }
            int avgSteps = totalSumSteps / calendar.size();
            System.out.println("Общее количество шагов за месяц: " + totalSumSteps);
            System.out.println("Максимальное количество шагов - " + maxSteps +
                    " было пройдено в день номер " + dayOfMaxSteps);
            System.out.println("Среднее количество шагов в день: " + avgSteps);
            Converter.convert(totalSumSteps);
            System.out.println("Лучшая серия: " + bestSeries + " дней");
        } else {
            System.out.println("Название месяца введено неверно");
        }
    }

    void changePurposeOfDailySteps(int targetStepsCount) {
        if (targetStepsCount < 0) {
            System.out.println("Введённое значение не должно быть отрицательным");
        } else {
            this.targetStepsCount = targetStepsCount;
            System.out.println("Данные сохранены");
        }
    }
}