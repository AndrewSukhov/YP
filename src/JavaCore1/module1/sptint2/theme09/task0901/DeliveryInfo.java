package JavaCore1.module1.sptint2.theme09.task0901;

public class DeliveryInfo {
    private String name;
    private long time;

    public DeliveryInfo(String deliveryName, long deliveryTime) {
        name = deliveryName;
        time = deliveryTime;
    }

    public String getName() {
        return name;
    }

    public long getTime() {
        return time;
    }
}
