package HomeWork.Lesson8;

public class Calculation {

    static int Test1(int a, int b, int c) {
        return a * b * c;
    }

    static void Test2(double a, double b) {
        double c = a / b;
        System.out.println(a + "/" + b + " = " + c);
    }
}

class Result {

    public static void main(String[] args) {
        int result1 = Calculation.Test1(2, 2, 2);
        int result2 = Calculation.Test1(1, 3, 2);

        System.out.println(result1);
        System.out.println(result2);

        Calculation.Test2(5, 3);
        Calculation.Test2(75, 7);

    }

}
