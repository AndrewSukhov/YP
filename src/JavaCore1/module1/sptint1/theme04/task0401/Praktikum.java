package JavaCore1.module1.sptint1.theme04.task0401;

import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("На сколько кусков порезана пицца?");
        int slicesInPizza = scanner.nextInt();
        System.out.println("Сколько кусков съедает один участник встречи?");
        int slicesToPerson = scanner.nextInt();
        printMaximumPeopleToMeeting(slicesToPerson, slicesInPizza);
    }

    private static void printMaximumPeopleToMeeting(int slicesToPerson, int slicesInPizza) {
        int numOfPizzas = 2;
        int totalSlices = ... // Посчитайте общее число кусков пиццы
        int maximumPeopleToMeeting = ... // На сколько человек хватит пиццы
        int leftSlices = ... // Сколько пиццы останется
        System.out.println("Максимальное число участников идеальной встречи: " + maximumPeopleToMeeting);
        System.out.println("Останется кусков пиццы: " + leftSlices);
    }
}
/*
По мнению Джеффа Безоса, основателя и главы компании Amazon, идеальная встреча —
это встреча, для проведения которой хватит двух пицц. Помогите Джеффу вычислить,
сколько человек можно позвать на встречу, исходя из количества кусочков пиццы
на каждого. Также определите, останется ли ещё пицца после того, как все разойдутся.
Вам нужно дополнить реализацию метода printMaximumPeopleToMeeting(), который
в качестве аргументов принимает, на сколько кусков порезана одна пицца и сколько
кусков пиццы съедает один участник встречи.

Общее количество кусков пиццы нужно вычислить через умножение: numOfPizzas * slicesInPizza.
Чтобы вычислить максимальное число участников встречи, нужно разделить общее количество
кусков пиццы totalSlices на число кусков, которое съест каждый slicesToPerson.
Чтобы определить, сколько пиццы останется, нужно получить остаток от деления общего
количества кусочков на количество кусков на одного человека.

 */
