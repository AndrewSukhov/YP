package JavaCore1.module1.sptint2.theme09.task0901;

public class SpeedConverter {
    private int metersInKilometer = 1000;
    private int minutesInHour = 60;
    private double speed;

    public SpeedConverter(double speedInKmH) {
        speed = speedInKmH;
    }

    public double getSpeedInMs() {
        return (speed * metersInKilometer) / minutesInHour;
    }
}
