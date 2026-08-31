public class Subscriber extends Passenger {


    // Constructor
    public Subscriber(String name, String id, double tripCost) {
        super(name, id);
    }

    // Methods
    @Override
    public void reserveCar(Car car) throws Exception {
        // Chek capacity car
        if (car.getMaxCapacity() == 0) {
            throw new Exception("Reservation Failed! Car " + car.getCode() + " has zero capacity.");
        }

        this.reservedCar = car;

        this.tripCost = car.getFixedRoute().getPrice() * 0.5;
    }

}
