package JavaCore1.module1.sptint2.theme09.task0901;

public class CarTimeCalculator {
    private double speedInMS = new SpeedConverter(speed).getSpeedInMs();
    private double speed = 25; // средняя скорость в км/ч
    private String courierName;

    public CarTimeCalculator(String name) {
        courierName = name;
    }

    public long getDeliveryTime(int distanceInMeters) {
        if (distanceInMeters <= 0) {
            return 1;
        }
        return (int)Math.ceil(distanceInMeters / speedInMS);
    }

    public String getCourierName() {
        return courierName;
    }
}
