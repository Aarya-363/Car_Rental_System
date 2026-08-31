public class driver{
    public static void main(String[] args) {
        rentalsystem rentalSystem = new rentalsystem();

        Car car1 = new Car("C001", "Toyota", "Fortuner", 3000.0); // Different base price per day for each car
        Car car2 = new Car("C002", "Tata", "Nexon", 1500.0);
        Car car3 = new Car("C003", "Mahindra", "Thar", 2500.0);
        Car car4 = new Car("C004", "Mahindra", "Scorpio-S6", 2000.0);
        Car car5 = new Car("C005", "Suzuki", "Swift", 1100.0);
        Car car6 = new Car("C006", "Jeep", "Wrangler", 3200.0);
        Car car7 = new Car("C007", "Audi", "Q7", 4000.0);
        rentalSystem.addCar(car1);
        rentalSystem.addCar(car2);
        rentalSystem.addCar(car3);
        rentalSystem.addCar(car4);
        rentalSystem.addCar(car5);
        rentalSystem.addCar(car6);
        rentalSystem.addCar(car7);
        rentalSystem.menu();
    }
}
