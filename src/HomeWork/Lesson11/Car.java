package HomeWork.Lesson11;

public class Car {

    String color;
    String engine;
    int doorNumber;

    Car(String color, String engine, int doorNumber) {
        this.color = color;
        this.engine = engine;
        this.doorNumber = doorNumber;
    }

}

class CarTest {

    void changeDoorNumber(Car car, int newDoorNumber) {
        car.doorNumber = newDoorNumber;
    }

    void replaceColor(Car car1, Car car2) {
        String color = car2.color;
        car2.color = car1.color;
        car1.color = color;
    }

    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car car1 = new Car("red", "V6", 2);
        Car car2 = new Car("black", "V8", 4);
       
        ct.changeDoorNumber(car1, 5);
        ct.replaceColor(car1, car2);

        System.out.println("car1:");
        System.out.println("color: " + car1.color);
        System.out.println("engine: " + car1.engine);
        System.out.println("Door number: " + car1.doorNumber);
        System.out.println("");
        System.out.println("car2:");
        System.out.println("color: " + car2.color);
        System.out.println("engine: " + car2.engine);
        System.out.println("Door number: " + car2.doorNumber);

    }
}
