public class CarTester {

    public static void main(String[] args) {
        //Create a car that gets 20 mpg and has a 15 gallon tank
        Car car = new Car(20, 15);
        
        //Fill up the gas tank
        car.addGas();
        
        //Check the miles available
        double milesAvailable = car.milesAvailable();
        System.out.println("Miles available: " + milesAvailable);

        //Drive 100 miles
        car.drive(100);

        //Check the miles available
        milesAvailable = car.milesAvailable();
        System.out.println("Miles available: " + milesAvailable);

        //Add 2 gallons to the gas tank
        car.addGas(2);

        //Check the miles available
        milesAvailable = car.milesAvailable();
        System.out.println("Miles available: " + milesAvailable);
        
        //Try driving more miles than available by driving 1000 miles
        car.drive(1000);

        //Drive 200 miles
        car.drive(200);

        //Check how much gas you have left
        double gasRemaining = car.getGas();
        System.out.println("Gas remaining: " + gasRemaining);

        //Print total miles driven
        double milesDriven = car.getTotalMilesDriven();
        System.out.println("Total Miles Driven: " + milesDriven);
        
        // Filling up ...
        // Miles available: 300.0
        // Driving 100.0
        // Miles available: 200.0
        // Adding gas ...
        // Miles available: 240.0
        // Can't drive 1000.0. That's too far!
        // Driving 200.0
        // Gas remaining: 2.0
        // Total Miles Driven: 300.0

    }
}
