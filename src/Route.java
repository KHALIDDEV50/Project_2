public class Route {


    private String startAddress;
    private String destinationAddress;
    private double price;

    // Constructor

    public Route(){

    }

    public Route(String startAddress, String destinationAddress,double price){
        this.startAddress =startAddress;
        this.destinationAddress = destinationAddress;
        this.price = price;
    }
}
