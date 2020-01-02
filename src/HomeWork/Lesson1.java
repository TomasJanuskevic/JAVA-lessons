package HomeWork;

import java.util.Arrays;

public class Lesson1 {

    public static boolean prog(int[] a, int[] b) {
        if (a == null || b == null || a.length == 0 || b.length == 0) {
            return false;
        } else if (a.length != b.length) {
            return false;
        } else {
            Arrays.sort(a);
            Arrays.sort(b);
            for (int i = 0; i < a.length; i++) {
                if (Math.pow(a[i], 2) != b[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
        System.out.println(prog(a, b));
    }

}
