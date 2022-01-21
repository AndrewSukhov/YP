package JavaCore1.module1.sptint4.theme19.task1904;

import java.util.Random;
import java.util.Scanner;

public class Practicum {
    public static void main(String[] args) {
        Random random = new Random();
        int target = random.nextInt(1000) + 1;
        System.out.println("Я загадал число. Попробуйте угадать!");

        Scanner s = new Scanner(System.in);
        int userGuess = -1;

        // Считывайте числа от пользователя пока не найдёте число, равное target
        while (target != userGuess) {
            userGuess = s.nextInt();
            if (userGuess < target) {
                System.out.println("Ваше число меньше");
            } else if (userGuess > target) {
                System.out.println("«Ваше число больше»");
            }
        }
        System.out.println("Правильный ответ");
    }
}
/*
Реализуйте игру-угадайку. В начале игры программа загадывает случайное число от 1 до 1000.
Пользователь вводит некоторое число в поле для ввода, после чего программа должна сказать:

    Если введённое число меньше загаданного — вывести «Ваше число меньше».
    Если введённое число больше загаданного — вывести «Ваше число больше».
    Если введённое число равно загаданному — вывести «Правильный ответ».

    Вам нужно искать число, пока оно не будет равно target. Этого можно достичь либо при помощи бесконечного цикла
    с выходом внутри, либо через цикл while (userGuess != target).
    На каждом шаге цикла считайте число scanner.nextInt(). Сравните это число с target и выведите либо
    "Ваше число больше", либо "Ваше число меньше". Если числа равны — выведите "Правильный ответ" и выйдите из цикла.
 */