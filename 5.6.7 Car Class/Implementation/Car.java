public class Car {
    
    // instance variables
    private double efficiency; // this is miles per gallon
    private double tankCapacity;
    
    private double gas;
    private double totalMilesDriven;
    
    // constructor
    public Car(double carEfficiency, double carTankCapacity)
    {
        efficiency = carEfficiency;
        tankCapacity = carTankCapacity;
    }

    // methods

    public void addGas() {
        gas = tankCapacity;
        
        System.out.println("Filling up...");
    }
    
    public void addGas(double amount) {
        gas += amount;
        
        if (gas > tankCapacity) {
            gas = tankCapacity;
        }
        
        System.out.println("Adding gas...");
    }
    
    public double getTotalMilesDriven() {
        return totalMilesDriven;
    }
    
    public void drive(double distance) {
        boolean enoughGasToDrive = canDrive(distance);
        if (!enoughGasToDrive) {
            System.out.println("Can't drive " + distance + ". That's too far!");    
        } else {
            totalMilesDriven += distance;
            double usedGas = distance / efficiency;
            gas -= usedGas;
            System.out.println("Driving " + distance);
        }
    }
    
    public boolean canDrive (double distance) {
        double neededGas = distance / efficiency;
        return gas >= neededGas;
    }
    
    public double milesAvailable() {
        return gas * efficiency;
    }
    
    public double getGas() {
        return gas;
    }
}
