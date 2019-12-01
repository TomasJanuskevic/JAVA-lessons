package HomeWork.Lesson20;

import java.util.*;

public class ArrayL {

    public ArrayList<String> abc(String... s) {
        ArrayList<String> aL = new ArrayList<>();
        for (String s1 : s) {
            if (!aL.contains(s1)) {
                aL.add(s1);
            }
        }
        Collections.sort(aL);
        System.out.println(aL);
        return aL;
    }

    public static void main(String[] args) {
        ArrayL arrayL = new ArrayL();
        arrayL.abc("ok", "hello", "hi", "world", "ok");
    }
}
