interface VehicleDashboard {
    void displaySpeed();
    default void displayBattery() {
        System.out.println("Battery status not available.");
    }
}

class PetrolCar implements VehicleDashboard {
    public void displaySpeed() { System.out.println("Speed: 80 km/h"); }
}

class ElectricCar implements VehicleDashboard {
    public void displaySpeed() { System.out.println("Speed: 60 km/h"); }
    public void displayBattery() { System.out.println("Battery: 75%"); }
}

public class SmartVehicleDashboard {
    public static void main(String[] args) {
        VehicleDashboard petrol = new PetrolCar();
        VehicleDashboard electric = new ElectricCar();
        petrol.displaySpeed();
        petrol.displayBattery();
        electric.displaySpeed();
        electric.displayBattery();
    }
}
