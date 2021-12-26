package JavaCore1.module1.sptint2.theme09.task0901;

public class HumanTimeCalculator {
    private double speed = 2.5; // средняя скорость в км/ч
    private double speedInMS = new SpeedConverter(speed).getSpeedInMs();
    private String courierName;

    public HumanTimeCalculator(String name) {
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
