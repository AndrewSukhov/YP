package basicsJava.methods.parametersArgumentsAndMethodSignature.task1;

public class Praktikum {

    public static void main(String[] args) {
        System.out.println("Наибольшее из чисел 3 и 5 = " + findMax(3,5));
        // Напишите аналогичный вызов метода findMax для таких пар чисел: 16 и 5, -1 и -7
        System.out.println("Наибольшее из чисел 16 и 5 = " + findMax(16, 5));
        System.out.println("Наибольшее из чисел -1 и -7 = " + findMax(-1, -7));
    }

    public static int findMax(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

}
/*
Условие задачи:
Метод findMax() сейчас может работать только с фиксированными значениями — 3 и 5.
Исправьте код метода таким образом, чтобы он мог принимать два любых целых значения.
Затем по аналогии вызовите метод, чтобы напечатать результат сравнения ещё двух пар чисел: 16 и 5, -1 и -7.
ПОДСКАЗКА:
Для того чтобы метод мог получать значения, ему необходимы параметры. Так как требуется передавать целые
числа, их тип будет int, а имена — a и b.
При вызове метода необходимо передать аргументы, с которыми он будет работать. Например, findMax(3, 5).
 */