public class Main {

    public static void main(String[] args) {

        // Create 2 Routes

        Route route1 = new Route(
                "DAHRET LABN",
                "Airport",
                100.0
        );

        Route route2 = new Route(
                "OLYA",
                "ALNASEEM",
                50.0
        );


        // Create 2 Cars

        Car car1 = new Car(
                "CAR-01",
                route1,
                4
        );

        // This car has zero capacity
        Car car2 = new Car(
                "CAR-02",
                route2,
                0
        );


        // Create Passenger Array

        Passenger[] passengers = new Passenger[2];

        passengers[0] = new Subscriber(
                "KHALID",
                "SUB-01"
        );

        passengers[1] = new NonSubscriber(
                "SAMI",
                "NON-01",
                true
        );


        System.out.println("----- Car Pooling System -----");


        // Passenger 1
        System.out.println("\nPassenger 1:");

        try {

            passengers[0].reserveCar(car1);

            passengers[0].displayDetails();

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }


        // Passenger 2
        System.out.println("\nPassenger 2:");

        try {

            passengers[1].reserveCar(car2);

            passengers[1].displayDetails();

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}