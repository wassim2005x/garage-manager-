import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Garage \n");
        garage mygarage = new garage();
        Scanner scanner = new Scanner(System.in);
        boolean index = true;

        while (index) {
            System.out.println("Select an option: \n");
            System.out.println("1- add a car \n");
            System.out.println("2- add a truck \n");
            System.out.println("3- add a motorcycle \n");
            System.out.println("4- show all the vehicles \n");
            System.out.println("5- exit");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter model, made, year, and number of seats:");
                    String carModel = scanner.next();
                    String carMade = scanner.next();
                    int carYear = scanner.nextInt();
                    int numSeats = scanner.nextInt();
                    mygarage.addCar(new car(carModel, carMade, carYear, numSeats));
                    break;
                case 2:
                    System.out.println("Enter model, made, year, and shipping weight:");
                    String truckModel = scanner.next();
                    String truckMade = scanner.next();
                    int truckYear = scanner.nextInt();
                    float shippingWeight = scanner.nextFloat();
                    mygarage.addTruck(new truck(truckModel, truckMade, truckYear, shippingWeight));
                    break;
                case 3:
                    System.out.println("Enter model, made, year, and engine size:");
                    String motorcycleModel = scanner.next();
                    String motorcycleMade = scanner.next();
                    int motorcycleYear = scanner.nextInt();
                    float engineSize = scanner.nextFloat();
                    mygarage.addMotorcycle(new motorcycle(motorcycleModel, motorcycleMade, motorcycleYear, engineSize));
                    break;
                case 4:
                    mygarage.showAllVehicles();
                    break;
                case 5:
                    System.out.println("Exit ...");
                    index = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
