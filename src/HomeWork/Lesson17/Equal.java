package HomeWork.Lesson17;

public class Equal {

    static boolean equal(StringBuilder sb1, StringBuilder sb2) {
        boolean result = true;
        if (sb1.length() == sb2.length()) {
            for (int i = 0; i < sb1.length(); i++) {
                if (sb1.charAt(i) != sb2.charAt(i)) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("HeLlo");
        StringBuilder sb3 = new StringBuilder("Helo");
        StringBuilder sb4 = new StringBuilder("Hello");

        System.out.println(equal(sb1, sb2));
        System.out.println(equal(sb1, sb3));
        System.out.println(equal(sb1, sb4));

    }
}
