package JavaCore1.module1.sptint3.theme16.task1605;

class Appender {

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static String add(String a, String b) {
        return a + b;
    }

    public static boolean add(boolean a, boolean b) {
        return a || b;
    }

}

public class Practicum {
    public static void main(String[] args) {
        System.out.println("2 + 3 = " + Appender.add(2, 3));
        System.out.println("9.4 + 1.2 = " + Appender.add(9.4, 1.2));
        System.out.println("Кофе + машина = " + Appender.add("Кофе", "машина"));
        System.out.println("true + false = " + Appender.add(true, false));
    }
}
/*
 Начинающий программист хотел написать программу, которая умеет складывать любые переданные ей на вход данные.
 Но у него получилось написать её только для целых чисел — он не знал о возможности перегрузки методов.
 Помогите ему закончить программу — доработайте класс Appender так, чтобы он мог работать еще и с дробными числами,
 булевыми значениями и строками.

 Перегрузка — это возможность в одном классе определить методы с одинаковым именем и разными наборами параметров.
Добавьте в класс методы add, которые будут принимать аргументы типа double, типа String и типа boolean.
Сложением для типа boolean будет выступать логическое сложение — «или» || .

 */