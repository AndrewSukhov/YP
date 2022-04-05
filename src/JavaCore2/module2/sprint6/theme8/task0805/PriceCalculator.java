package JavaCore2.module2.sprint6.theme8.task0805;

public class PriceCalculator {

    private static final int BIKE_PRICE_PER_KM = 10;
    private static final int CAR_PRICE_PER_KM = 7;
    private static final int TRUCK_PRICE_PER_KM = 5;

    private static final String DISTANCE_TOO_SHORT_EX_TEXT = "Distance should be more than 0 km";

    public int calculatePrice(TransportType transportType, int distanceKm) {
        switch (transportType) {
            case BIKE:
                return calculateForBike(distanceKm);
            case CAR:
                return calculateForCar(distanceKm);
            case TRUCK:
                return calculateForTruck(distanceKm);
            default:
                throw new UnsupportedOperationException("transport type '" + transportType + "' is not handled correctly");
        }
    }

    private int calculateForTruck(int distanceKm) {
        if (distanceKm <= 0) throw new IllegalArgumentException(DISTANCE_TOO_SHORT_EX_TEXT);
        return distanceKm * TRUCK_PRICE_PER_KM;
    }

    private int calculateForCar(int distanceKm) {
        if (distanceKm > 1000) throw new IllegalArgumentException("Car can not go for more than 1000 km");
        if (distanceKm <= 0) throw new IllegalArgumentException(DISTANCE_TOO_SHORT_EX_TEXT);
        return distanceKm * CAR_PRICE_PER_KM;
    }

    private int calculateForBike(int distanceKm) {
        if (distanceKm > 20) throw new IllegalArgumentException("Bike can not go for more than 20 km");
        if (distanceKm <= 0) throw new IllegalArgumentException(DISTANCE_TOO_SHORT_EX_TEXT);
        return distanceKm * BIKE_PRICE_PER_KM;
    }
}
