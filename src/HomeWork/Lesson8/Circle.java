package HomeWork.Lesson8;

public class Circle {

    static final double PI = 3.14;

    double area(double r) {
        return PI * r * r;
    }

    static double length(double r) {
        return 2 * PI * r;
    }

    void circleInformation(double r) {
        System.out.println("Circle r = " + r);
        System.out.println("Circle area = " + area(r));
        System.out.println("Circle length = " + length(r));
    }
}

class Test1 {

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Area = " + circle.area(3.6));
        circle.circleInformation(2.5);
        System.out.println("Length = " + Circle.length(6.5));
    }

}
