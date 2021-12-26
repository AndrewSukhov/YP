package JavaCore1.module1.sptint2.theme09.task0901;

public class BikeTimeCalculator {
    private double speed = 10; // средняя скорость в км/ч
    private String courierName;

    public BikeTimeCalculator(String name) {
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

    private double speedInMS = new SpeedConverter(speed).getSpeedInMs();
}
