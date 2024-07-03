import java.util.Scanner;

class Car {
    String carModel;
    String carName;
    double carPrice;
    String carOwner;

    public void setCarData(String model, String name, double price, String owner) {
        this.carModel = model;
        this.carName = name;
        this.carPrice = price;
        this.carOwner = owner;
    }

    public void displayCarData() {
        System.out.println("Car Model: " + this.carModel);
        System.out.println("Car Name: " + this.carName);
        System.out.println("Car Price: " + this.carPrice);
        System.out.println("Car Owner: " + this.carOwner);
    }
}

public class CarData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        System.out.println("Enter data for Car 1:");
        car1.setCarData(scanner.nextLine(), scanner.nextLine(), scanner.nextDouble(), scanner.nextLine());
        scanner.nextLine(); // consume the leftover newline
        System.out.println("Enter data for Car 2:");
        car2.setCarData(scanner.nextLine(), scanner.nextLine(), scanner.nextDouble(), scanner.nextLine());
        scanner.nextLine(); // consume the leftover newline
        System.out.println("Enter data for Car 3:");
        car3.setCarData(scanner.nextLine(), scanner.nextLine(), scanner.nextDouble(), scanner.nextLine());

        System.out.println("Car 1 Data:");
        car1.displayCarData();
        System.out.println("Car 2 Data:");
        car2.displayCarData();
        System.out.println("Car 3 Data:");
        car3.displayCarData();
    }
}
