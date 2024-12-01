package delta;

public class Main {
    public static void main(String[] args) {
        // Example 1: Assemble a Car
        Vehicle car = VehicleFactory.createVehicle("car");
        car.assemble();

        // Example 2: Assemble a Truck
        Vehicle truck = VehicleFactory.createVehicle("truck");
        truck.assemble();

        // Example 3: Assemble a Motorcycle
        Vehicle motorcycle = VehicleFactory.createVehicle("motorcycle");
        motorcycle.assemble();
    }
}

