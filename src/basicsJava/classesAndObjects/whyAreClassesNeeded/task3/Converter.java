package basicsJava.classesAndObjects.whyAreClassesNeeded.task3;

public class Converter {
    double rateUSD = 78.5;
    double rateEUR = 88.7;
    double rateJPY = 0.75;

    public void convert(double rubles, int currency) {
        if (currency == 1) {
            System.out.println("Ваши сбережения в долларах: " + rubles / rateUSD);
        } else if (currency == 2) {
            System.out.println("Ваши сбережения в евро: " + rubles / rateEUR);
        } else if (currency == 3) {
            System.out.println("Ваши сбережения в иенах: " + rubles / rateJPY);
        } else {
            System.out.println("Неизвестная валюта");
        }
    }
}
/*
Условие задачи:
Вам нужно, чтобы конвертер умел рассчитать соотношение валют. Для этого объявите метод:
convert. Этот метод должен принимать такие параметры, как сумма в рублях (double rubles)
и код валюты (int currency). Напишите определение метода и поместите в него логику конвертации валюты.
ПОДСКАЗКА:
Объявите метод со такой сигнатурой: convert(double rubles, int currency).
Он не должен ничего возвращать.
Тело метода есть в прекоде — раскомментируйте его.
 */