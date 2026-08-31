public abstract class Passenger {

    private String name;
    private String id;
    private Car reservedCar;
    private double tripCost;

    // Constructor
    public Passenger(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Car getReservedCar() {
        return reservedCar;
    }

    public void setReservedCar(Car reservedCar) {
        this.reservedCar = reservedCar;
    }

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }

    // Abstract method
    public abstract void reserveCar(Car car) throws Exception;

    // Display information
    public void displayDetails() {

        System.out.println("Passenger Name: " + name);
        System.out.println("Passenger ID: " + id);

        if (reservedCar != null) {

            System.out.println("Car Code: " + reservedCar.getCode());

            System.out.println("Route Price: "
                    + reservedCar.getFixedRoute().getPrice());

            System.out.println("Trip Cost: " + tripCost);
        }
    }
}