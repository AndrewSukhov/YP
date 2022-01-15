package JavaCore1.module1.sptint3.theme16.task1602;

public abstract class Parallelogram implements Figure{
    private final double a;
    private final double b;

    public Parallelogram(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getArea() {
        return a * b;
    }
}
