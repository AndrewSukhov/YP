package basicsJava.classesAndObjects.сonstructors.task2;

public class Converter {
    double rateUSD = 78.5;
    double rateEUR = 88.7;
    double rateJPY = 0.75;

    //добавьте конструктор здесь

    void convert(double rubles, int currency) {
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
Добавьте конструктор в класс для конвертера валют, который вы написали в прошлом уроке.
Значения полей должны передаваться в качестве параметров со следующими названиями: usd, eur, jpy.
Имя конструктора совпадает с именем класса. Порядок аргументов должен совпадать с порядком объявления полей.
 */
