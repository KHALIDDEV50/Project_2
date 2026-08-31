public class Subscriber extends Passenger {

    // Constructor
    public Subscriber(String name, String id) {
        super(name, id);
    }

    @Override
    public void reserveCar(Car car) throws Exception {

        // Check capacity
        if (car.getMaxCapacity() == 0) {
            throw new Exception(
                    "Reservation Failed! Car "
                            + car.getCode()
                            + " has zero capacity."
            );
        }

        // Reserve car
        setReservedCar(car);

        // 50% discount
        double price = car.getFixedRoute().getPrice();

        setTripCost(price * 0.5);
    }
}