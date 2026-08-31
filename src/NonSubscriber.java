public class NonSubscriber extends Passenger {

    private boolean discountCoupon;


    // Constructor
    public NonSubscriber() {

    }

    public NonSubscriber(String name, String id, boolean discountCoupon) {
        super(name, id);
        this.discountCoupon = discountCoupon;
    }

    // get and set


    public boolean isDiscountCoupon() {
        return discountCoupon;
    }

    public void setDiscountCoupon(boolean discountCoupon) {
        this.discountCoupon = discountCoupon;
    }

    @Override
    public void reserveCar(Car car) throws Exception {

        // التحقق من السعة القصوى للسيارة
        if (car.getMaxCapacity() == 0) {
            throw new Exception("Reservation Failed! Car " + car.getCode() + " has zero capacity.");
        }

        this.reservedCar = car;
        // إذا كان لديه كوبون يخصم 10%، وإلا يدفع السعر كاملاً
        if (discountCoupon) {
            this.tripCost = car.getFixedRoute().getPrice() - (car.getFixedRoute().getPrice() * 0.1);
        } else {
            this.tripCost = car.getFixedRoute().getPrice();
        }
    }

}

