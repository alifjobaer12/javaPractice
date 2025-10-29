package lab4;

class vehicle {
    String brand;
    int year;
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
    vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
}

class Car extends vehicle {
    int numberOfDoors;
    Car(String brand, int year, int numberOfDoors) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + numberOfDoors);
    }
}

class ElectricCar extends Car {
    int batteryCapacity;
    ElectricCar(String brand, int year, int  numberOfDoors, int batteryCapacity) {
        super(brand, year, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity);
    }
}

public class Lab4_q4 {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar("BMW", 1990, 2, 4);
        electricCar.displayInfo();
    }
}
