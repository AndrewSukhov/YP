package JavaCore1.module1.sptint3.theme16.task1602;

public class Practicum {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника 4см*6см = " + rectangle.getArea());

        Square square = new Square(3);
        System.out.println("Площадь квадрата 3см*3см = " + square.getArea());

        Rhombus rhombus = new Rhombus(4, 3);
        System.out.println("Площадь ромба со стороной 4см и высотой 3см = " + rhombus.getArea());

        Circle circle = new Circle(2);
        System.out.println("Площадь круга с радиусом 2см = " + circle.getArea());
    }

}
/*
В прошлом уроке мы вынесли общие свойства геометрических фигур в абстрактный класс.
В этом задании вам необходимо применить полученные знания об интерфейсах и абстрактных классах так,
чтобы связать все фигуры в единую иерархию и написать программу-калькулятор, вычисляющую площадь фигур:
ромба, квадрата, прямоугольника и круга.

У классов Square, Rhombus и Rectangle совпадает реализация метода double getArea().
Такой метод можно вынести в абстрактный класс Parallelogram.
У всех классов есть метод double getArea(). Поскольку сигнатура метода одинаковая,
а способ подсчёта площади фигуры внутри метода — разный, метод можно вынести в базовый интерфейс Figure.
Классы Square, Rhombus и Rectangle используют одинаковый набор параметров, эти параметры можно вынести
в абстрактный класс и создать конструктор с параметрами.
Некоторые из фигур являются частными случаями других. Например, квадрат — это частный случай прямоугольника,
а прямоугольник — частный случай параллелограмма. Такие фигуры можно унаследовать друг от друга.
Если затрудняетесь построить иерархию фигур, воспользуйтесь схемой:
 */
