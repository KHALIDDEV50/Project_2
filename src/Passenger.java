abstract class Passenger  {

    private String name;
    private String id;
    private Car reservedCar;
    private double tripCost;

    // Constructor..

    public Passenger() {

    }

    public Passenger(String name, String id) {
        this.name = name;
        this.id = id;
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
