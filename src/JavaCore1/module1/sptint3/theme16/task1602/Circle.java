package JavaCore1.module1.sptint3.theme16.task1602;

public class Circle implements Figure {
    // Радиус круга
    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getArea() {
        return Math.PI * r * r;
    }
}
