package HomeWork.Lesson19;

public class Arrays {

    static String[] abc(String[]... array) {
        int length = 0;
        for (String[] array1 : array) {
            length += array1.length;
        }
        String[] target = new String[length];
        int count = 0;
        for (String[] array1 : array) {
            for (String s : array1) {
                target[count] = s;
                count++;
            }
        }
        return target;
    }

    public static void main(String[] args) {
        String[] Array = abc(new String[]{"a", "b", "c"}, new String[]{"d", "e"}, new String[]{"f"});
        for (String s : Array) {
            System.out.print(s + " ");
        }
    }
}
