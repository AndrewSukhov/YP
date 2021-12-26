package JavaCore1.module1.sptint2.theme09.task0901;

import java.util.List;

public class CourierSelector {

    private List<BikeTimeCalculator> bikes;
    private List<CarTimeCalculator> cars;
    private List<HumanTimeCalculator> humans;

    public CourierSelector(
            List<BikeTimeCalculator> bikesDelivery,
            List<CarTimeCalculator> carsDelivery,
            List<HumanTimeCalculator> humansDelivery
    ) {
        bikes = bikesDelivery;
        cars = carsDelivery;
        humans = humansDelivery;
    }

    public DeliveryInfo selectDelivery(int distance) {
        if (distance >= 10000) {
            DeliveryInfo delivery = getCarDelivery(distance);
            if (delivery != null) {
                return delivery;
            }
        }

        if (distance >= 2000) {
            DeliveryInfo delivery = getBikeDelivery(distance);
            if (delivery != null) {
                return delivery;
            }
        }

        DeliveryInfo delivery = getHumanDelivery(distance);
        if (delivery != null) {
            return delivery;
        }

        delivery = getBikeDelivery(distance);
        if (delivery != null) {
            return delivery;
        }

        return getCarDelivery(distance);
    }

    private DeliveryInfo getCarDelivery(int distance) {
        if (cars.isEmpty()) {
            return null;
        }
        CarTimeCalculator carDelivery = cars.get(0);
        cars.remove(0);
        return new DeliveryInfo(
                carDelivery.getCourierName(), carDelivery.getDeliveryTime(distance)
        );
    }

    private DeliveryInfo getBikeDelivery(int distance) {
        if (bikes.isEmpty()) {
            return null;
        }
        BikeTimeCalculator bikeDelivery = bikes.get(0);
        bikes.remove(0);
        return new DeliveryInfo(
                bikeDelivery.getCourierName(), bikeDelivery.getDeliveryTime(distance)
        );
    }

    private DeliveryInfo getHumanDelivery(int distance) {
        if (humans.isEmpty()) {
            return null;
        }
        HumanTimeCalculator humanDelivery = humans.get(0);
        humans.remove(0);
        return new DeliveryInfo(
                humanDelivery.getCourierName(), humanDelivery.getDeliveryTime(distance)
        );
    }

}
