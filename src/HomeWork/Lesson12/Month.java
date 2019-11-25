package HomeWork.Lesson12;

import java.util.Scanner;

public class Month {

    public static void monthDays2019() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter month number");
        int monthNo = s.nextInt();
        switch (monthNo) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Month have 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Month have 30 days");
                break;
            case 2:
                System.out.println("Month have 28 days");
                break;
            default:
                System.out.println("Month doesn't exist");
        }
    }
}

class Test {

    public static void main(String[] args) {
        Month.monthDays2019();
    }

}
