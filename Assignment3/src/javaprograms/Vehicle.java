package javaprograms;


class Vehicle {
 String make;
 String model;
 int year;
 String fuelType;

 public Vehicle(String make, String model, int year, String fuelType) {
     this.make = make;
     this.model = model;
     this.year = year;
     this.fuelType = fuelType;
 }

 
 public double calculateFuelEfficiency(double distance, double fuelConsumed) {
     return distance / fuelConsumed;
 }

 public double calculateDistance(double speed, double time) {
     return speed * time;
 }

 public double getMaximumSpeed() {
     return 0; 
 }
}

class Truck extends Vehicle {
 private double maxLoad;

 public Truck(String make, String model, int year, String fuelType, double maxLoad) {
     super(make, model, year, fuelType);
     this.maxLoad = maxLoad;
 }

 public double getMaximumSpeed() {
     return 100;
 }
}

class Car extends Vehicle {
 private int numSeats;

 public Car(String make, String model, int year, String fuelType, int numSeats) {
     super(make, model, year, fuelType);
     this.numSeats = numSeats;
 }

 public double getMaximumSpeed() {

     return 150;
 }
}

class Motorcycle extends Vehicle {
 private boolean hasFairing;

 public Motorcycle(String make, String model, int year, String fuelType, boolean hasFairing) {
     super(make, model, year, fuelType);
     this.hasFairing = hasFairing;
 }

 
 public double getMaximumSpeed() {
    
     return 200;
 }
}

public class Vehicle {
 public static void main(String[] args) {
    
     Truck truck = new Truck("Ford", "F150", 2022, "Diesel", 5000);
     Car car = new Car("Toyota", "Camry", 2023, "Petrol", 5);
     Motorcycle motorcycle = new Motorcycle("Honda", "CBR600RR", 2024, "Petrol", true);

     System.out.println("Truck Maximum Speed: " + truck.getMaximumSpeed() + " km/h");
     System.out.println("Car Maximum Speed: " + car.getMaximumSpeed() + " km/h");
     System.out.println("Motorcycle Maximum Speed: " + motorcycle.getMaximumSpeed() + " km/h");
 }
}
