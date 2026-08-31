public class Car {
    private String code;
    private Route fixedRoute;
    private int maxCapacity;

    // Constructor

    public Car(){

    }

    public  Car(String code, Route fixedRoute , int maxCapacity){
        this.code = code;
        this.fixedRoute = fixedRoute;
        this.maxCapacity =maxCapacity;
    }
}
