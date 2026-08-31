public class NonSubscriber extends Passenger {

    private boolean discountCoupon;

    // Constructor
    public NonSubscriber(String name, String id, boolean discountCoupon) {
        super(name, id);
        this.discountCoupon = discountCoupon;
    }

    // Getter
    public boolean isDiscountCoupon() {
        return discountCoupon;
    }

    // Setter
    public void setDiscountCoupon(boolean discountCoupon) {
        this.discountCoupon = discountCoupon;
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

        double price = car.getFixedRoute().getPrice();

        // Check coupon
        if (discountCoupon) {

            setTripCost(price * 0.9);

        } else {

            setTripCost(price);
        }
    }
}