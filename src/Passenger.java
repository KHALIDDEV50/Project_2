abstract class Passenger  {

    private String name;
    private String id;
    public Car reservedCar;
    public double tripCost;

    // Constructor..

    public Passenger() {

    }

    public Passenger(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // get and set


    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }

    public Car getReservedCar() {
        return reservedCar;
    }

    public void setReservedCar(Car reservedCar) {
        this.reservedCar = reservedCar;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Methods..
    public abstract void reserveCar(Car car) throws Exception;

    public void displayDetails(){
        System.out.println("Passenger Name: "+ name);
        System.out.println("Passenger ID: "+id);
        if (reservedCar != null){
            System.out.println("Car Code: " + reservedCar.getCode());
            System.out.println("Route Original Price: $" + reservedCar.getFixedRoute().getPrice());
            System.out.println("Final Trip Cost: $" + tripCost);
        }
    }


}
